package jp.pizzafactory.model.asam.cc.objstore.impl;

import java.io.File;
import java.util.Map;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxy;
import jp.pizzafactory.model.asam.cc.objstore.Zipper;
import jp.pizzafactory.model.asam.cc.objstore.internal.Activator;
import jp.pizzafactory.model.asam.cc.objstore.internal.RepositoryConfiguration;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.deployment.DeployRequest;
import org.eclipse.aether.deployment.DeploymentException;
import org.eclipse.aether.installation.InstallRequest;
import org.eclipse.aether.installation.InstallationException;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.resolution.ArtifactRequest;
import org.eclipse.aether.resolution.ArtifactResolutionException;
import org.eclipse.aether.resolution.ArtifactResult;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import asam.cc.Ablock;

public class AblockProxyImpl implements AblockProxy {

    private static final String ZIP_EXT = "zip"; //$NON-NLS-1$
    private RepositoryConfiguration conf;
    private Zipper zipper;
    private Ablock ablock;

    public AblockProxyImpl(final Ablock ablock,
            final RepositoryConfiguration conf) {
        this.ablock = ablock;
        this.conf = conf;
    }

    private Artifact getArtifact(final String version) {
        return new DefaultArtifact(ablock.getDomain(), ablock.getShortName(),
                ablock.getCategory(), ZIP_EXT, version);
    }

    private File downloadZippedArtifact(final String version)
            throws ArtifactResolutionException {
        final Artifact artifact = getArtifact(version);
        final ArtifactRequest artifactRequest = new ArtifactRequest();
        artifactRequest.setArtifact(artifact);
        artifactRequest.setRepositories(conf.getRemoteRepositories());

        final RepositorySystem system = conf.getRepositorySystem();
        final RepositorySystemSession session = conf
                .getRepositorySystemSession();

        final ArtifactResult artifactResult = system.resolveArtifact(session,
                artifactRequest);
        return artifactResult.getArtifact().getFile();
    }

    @Override
    public void checkout(final String version) throws CoreException {
        try {
            final File zipFile = downloadZippedArtifact(version);
            new Unzipper().unzip(zipFile, ablock, conf);
        } catch (ArtifactResolutionException e) {
            final IStatus status = new Status(IStatus.ERROR,
                    Activator.PLUGIN_ID, "Internal error", e);
            throw new CoreException(status);
        }
    }

    @Override
    public void install(final String version) throws CoreException {
        final File zipFile = getZipper().buildZipArchive();
        final Artifact artifact = getArtifact(version).setFile(zipFile);

        final InstallRequest installRequest = new InstallRequest();
        installRequest.addArtifact(artifact);

        final RepositorySystem system = conf.getRepositorySystem();
        final RepositorySystemSession session = conf
                .getRepositorySystemSession();

        try {
            system.install(session, installRequest);
        } catch (InstallationException e) {
            final IStatus status = new Status(IStatus.ERROR,
                    Activator.PLUGIN_ID, "Internal error", e);
            throw new CoreException(status);
        }
    }

    @Override
    public void deploy(String version, String repoId) throws CoreException {
        final File zipFile = getZipper().buildZipArchive();
        final Artifact artifact = getArtifact(version).setFile(zipFile);

        final RepositorySystem system = conf.getRepositorySystem();
        final RepositorySystemSession session = conf
                .getRepositorySystemSession();

        final DeployRequest deployRequest = new DeployRequest()
                .addArtifact(artifact);

        final RemoteRepository remoteRepository = conf.getAblockProxyFactory()
                .getRemoteRepository(repoId);
        deployRequest.setRepository(remoteRepository);

        try {
            system.deploy(session, deployRequest);
        } catch (DeploymentException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Deployment Failed.", e);
            throw new CoreException(status);
        }
    }

    private Zipper getZipper() {
        if (zipper == null) {
            zipper = new ZipperImpl(ablock, conf);
        }
        return zipper;
    }

    @Override
    public Map<String, String> getZipPathMap() {
        return getZipper().getPathMap();
    }
}

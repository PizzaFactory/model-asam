package jp.pizzafactory.model.asam.cc.objstore.impl;

import java.io.File;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxy;
import jp.pizzafactory.model.asam.cc.objstore.internal.Activator;
import jp.pizzafactory.model.asam.cc.objstore.internal.RepositoryConfiguration;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.resolution.ArtifactRequest;
import org.eclipse.aether.resolution.ArtifactResolutionException;
import org.eclipse.aether.resolution.ArtifactResult;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import asam.cc.Ablock;

public class AblockProxyImpl implements AblockProxy {

    private RepositoryConfiguration conf;

    public AblockProxyImpl(final RepositoryConfiguration conf) {
        this.conf = conf;
    }

    /* (non-Javadoc)
     * @see jp.pizzafactory.model.asam.cc.objstore.impl.AblockProxy#toFile(asam.cc.Ablock, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public File toFile(Ablock ablock, String classifier,
            String version) throws CoreException {

        final Artifact artifact = new DefaultArtifact(ablock.getDomain(),
                ablock.getShortName(), classifier, ablock.getCategory(),
                version);
        final ArtifactRequest artifactRequest = new ArtifactRequest();
        artifactRequest.setArtifact(artifact);
        artifactRequest.setRepositories(conf.getRemoteRepositories());

        final RepositorySystem system = conf.getRepositorySystem();
        final RepositorySystemSession session = conf
                .getRepositorySystemSession();

        try {
            ArtifactResult artifactResult = system.resolveArtifact(session,
                    artifactRequest);
            return artifactResult.getArtifact().getFile();
        } catch (ArtifactResolutionException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Internal error", e);
            throw new CoreException(status);
        }
    }
}

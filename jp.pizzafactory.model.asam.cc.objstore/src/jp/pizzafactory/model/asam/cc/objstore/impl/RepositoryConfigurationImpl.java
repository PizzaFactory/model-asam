package jp.pizzafactory.model.asam.cc.objstore.impl;

import java.io.File;
import java.util.List;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxyFactory;
import jp.pizzafactory.model.asam.cc.objstore.internal.AetherUtils;
import jp.pizzafactory.model.asam.cc.objstore.internal.RepositoryConfiguration;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.RemoteRepository;

public class RepositoryConfigurationImpl implements RepositoryConfiguration {
    private final RepositorySystem system;
    private final RepositorySystemSession session;
    private AblockProxyFactory ablockProxyFactory;
    private final List<RemoteRepository> remoteRepositories;
    private final File basedir;

    public RepositoryConfigurationImpl(
            final AblockProxyFactory ablockProxyFactory,
            final File repoBasedir,
            final List<RemoteRepository> remoteRepositories, final File basedir) {
        system = AetherUtils.newRepositorySystem();
        session = AetherUtils.newRepositorySystemSession(system, repoBasedir);
        this.ablockProxyFactory = ablockProxyFactory;
        this.remoteRepositories = remoteRepositories;
        this.basedir = basedir;
    }

    @Override
    public RepositorySystem getRepositorySystem() {
        return system;
    }

    @Override
    public RepositorySystemSession getRepositorySystemSession() {
        return session;
    }

    @Override
    public AblockProxyFactory getAblockProxyFactory() {
        return ablockProxyFactory;
    }

    @Override
    public List<RemoteRepository> getRemoteRepositories() {
        return remoteRepositories;
    }

    @Override
    public File getBasedir() {
        return basedir;
    }
}

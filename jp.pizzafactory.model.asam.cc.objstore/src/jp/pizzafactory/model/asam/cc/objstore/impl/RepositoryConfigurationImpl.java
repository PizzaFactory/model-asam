package jp.pizzafactory.model.asam.cc.objstore.impl;

import java.io.File;
import java.util.List;

import jp.pizzafactory.model.asam.cc.objstore.internal.AetherUtils;
import jp.pizzafactory.model.asam.cc.objstore.internal.RepositoryConfiguration;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.RemoteRepository;

public class RepositoryConfigurationImpl implements RepositoryConfiguration {
    private final RepositorySystem system;
    private final RepositorySystemSession session;
    private final List<RemoteRepository> remoteRepositories;

    public RepositoryConfigurationImpl(final File repoBasedir,
            final List<RemoteRepository> remoteRepositories) {
        system = AetherUtils.newRepositorySystem();
        session = AetherUtils.newRepositorySystemSession(system, repoBasedir);
        this.remoteRepositories = remoteRepositories;
    }

    public RepositorySystem getRepositorySystem() {
        return system;
    }

    public RepositorySystemSession getRepositorySystemSession() {
        return session;
    }

    public List<RemoteRepository> getRemoteRepositories() {
        return remoteRepositories;
    }
}

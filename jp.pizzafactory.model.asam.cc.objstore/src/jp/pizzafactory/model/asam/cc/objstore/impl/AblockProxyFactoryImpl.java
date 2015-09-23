package jp.pizzafactory.model.asam.cc.objstore.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxy;
import jp.pizzafactory.model.asam.cc.objstore.AblockProxyFactory;

import org.eclipse.aether.repository.RemoteRepository;

public class AblockProxyFactoryImpl implements AblockProxyFactory {

    final private HashMap<String, RemoteRepository> repositoryHash;
    final private File repoBasedir;

    public AblockProxyFactoryImpl(File repoBasedir) {
        repositoryHash = new HashMap<String, RemoteRepository>();
        this.repoBasedir = repoBasedir;
    }

    @Override
    public void addRemoteRepository(String repoId, String type, String repoUrl) {
        RemoteRepository repo = new RemoteRepository.Builder(repoId, type,
                repoUrl).build();
        repositoryHash.put(repoId, repo);
    }

    @Override
    public void removeRemoteRepository(String repoId) {
        repositoryHash.remove(repoId);
    }

    @Override
    public RemoteRepository getRemoteRepository(String repoId) {
        return repositoryHash.get(repoId);
    }

    private List<RemoteRepository> newRepositories() {
        return new ArrayList<RemoteRepository>(repositoryHash.values());
    }

    @Override
    public AblockProxy create() {
        List<RemoteRepository> repos = newRepositories();
        RepositoryConfigurationImpl conf = new RepositoryConfigurationImpl(
                repoBasedir, repos);
        return new AblockProxyImpl(conf);
    }
}

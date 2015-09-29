package jp.pizzafactory.model.asam.cc.objstore.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxy;
import jp.pizzafactory.model.asam.cc.objstore.AblockProxyFactory;

import org.eclipse.aether.repository.Authentication;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.util.repository.AuthenticationBuilder;

import asam.cc.Ablock;

public class AblockProxyFactoryImpl implements AblockProxyFactory {

    final private HashMap<String, RemoteRepository> repositoryHash;
    final private File repoBasedir;

    public AblockProxyFactoryImpl(File repoBasedir) {
        repositoryHash = new HashMap<String, RemoteRepository>();
        this.repoBasedir = repoBasedir;
    }

    @Override
    public void addRemoteRepository(String repoId, String type, String repoUrl) {
        final RemoteRepository repo = new RemoteRepository.Builder(repoId,
                type,
                repoUrl).build();
        repositoryHash.put(repoId, repo);
    }

    @Override
    public void addRemoteRepository(String repoId, String type, String repoUrl,
            String userName, String passwd) {
        final Authentication auth = new AuthenticationBuilder()
                .addUsername(userName).addPassword(passwd).build();
        final RemoteRepository repo = new RemoteRepository.Builder(
                repoId, type, repoUrl).setAuthentication(auth).build();
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
    public AblockProxy create(Ablock ablock, File basedir) {
        List<RemoteRepository> repos = newRepositories();
        RepositoryConfigurationImpl conf = new RepositoryConfigurationImpl(
                this, repoBasedir, repos, basedir);
        return new AblockProxyImpl(ablock, conf);
    }

    @Override
    public File getRepoBasedir() {
        return repoBasedir;
    }
}

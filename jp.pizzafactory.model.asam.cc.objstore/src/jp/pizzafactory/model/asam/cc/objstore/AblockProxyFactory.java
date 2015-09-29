package jp.pizzafactory.model.asam.cc.objstore;

import java.io.File;

import org.eclipse.aether.repository.RemoteRepository;

import asam.cc.Ablock;


public interface AblockProxyFactory {

    void addRemoteRepository(String repoId, String type,
            String repoUrl);

    void addRemoteRepository(String repoId, String type, String repoUrl,
            String userName, String passwd);

    void removeRemoteRepository(String repoId);

    RemoteRepository getRemoteRepository(String repoId);

    AblockProxy create(Ablock ablock, File basedir);

    File getRepoBasedir();

}
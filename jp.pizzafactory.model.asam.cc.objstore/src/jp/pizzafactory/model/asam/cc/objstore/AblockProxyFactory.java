package jp.pizzafactory.model.asam.cc.objstore;

import org.eclipse.aether.repository.RemoteRepository;



public interface AblockProxyFactory {

    public void addRemoteRepository(String repoId, String type,
            String repoUrl);

    public void removeRemoteRepository(String repoId);

    public RemoteRepository getRemoteRepository(String repoId);

    public AblockProxy create();

}
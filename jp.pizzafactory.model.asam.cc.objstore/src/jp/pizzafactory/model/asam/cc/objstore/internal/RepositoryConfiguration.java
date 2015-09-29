package jp.pizzafactory.model.asam.cc.objstore.internal;

import java.io.File;
import java.util.List;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxyFactory;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.RemoteRepository;

public interface RepositoryConfiguration {

    RepositorySystem getRepositorySystem();

    RepositorySystemSession getRepositorySystemSession();

    AblockProxyFactory getAblockProxyFactory();

    List<RemoteRepository> getRemoteRepositories();

    File getBasedir();
}

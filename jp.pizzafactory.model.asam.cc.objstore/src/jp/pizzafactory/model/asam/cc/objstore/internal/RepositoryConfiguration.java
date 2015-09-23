package jp.pizzafactory.model.asam.cc.objstore.internal;

import java.util.List;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.RemoteRepository;

public interface RepositoryConfiguration {

    public RepositorySystem getRepositorySystem();

    public RepositorySystemSession getRepositorySystemSession();

    public List<RemoteRepository> getRemoteRepositories();
}

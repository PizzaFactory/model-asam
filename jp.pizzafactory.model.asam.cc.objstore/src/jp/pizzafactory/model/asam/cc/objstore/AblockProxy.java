package jp.pizzafactory.model.asam.cc.objstore;

import java.util.Map;

import org.eclipse.core.runtime.CoreException;

public interface AblockProxy {

    Map<String, String> getZipPathMap();

    void install(String version) throws CoreException;

    void deploy(String version, String targetUrl, String repoId)
            throws CoreException;

    void checkout(String version) throws CoreException;

}
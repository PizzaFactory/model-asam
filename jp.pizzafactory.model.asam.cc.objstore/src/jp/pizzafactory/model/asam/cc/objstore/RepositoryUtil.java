package jp.pizzafactory.model.asam.cc.objstore;

import java.io.File;

import jp.pizzafactory.model.asam.cc.objstore.impl.AblockProxyFactoryImpl;

public class RepositoryUtil {

    /**
     * Create new instance of AblockProxyFactory.
     * 
     * Same as {@link RepositoryUtil#newAblockProxyFactory(File)} with null
     * argument.
     * 
     * @return
     */
    public static AblockProxyFactory newAblockProxyFactory() {
        return newAblockProxyFactory(null);
    }

    /**
     * Create new instance of AblockProxyFactory.
     * 
     * ${HOME}/.m2/repository is used if reopBasedir was null.
     * 
     * @param repoBasedir
     *            repository location.
     * @return
     */
    public static AblockProxyFactory newAblockProxyFactory(File repoBasedir) {
        if (repoBasedir == null) {
            String[] path = new String[] { System.getProperty("user.home"),
                    ".m2", "repository" };

            repoBasedir = new File(String.join(File.separator, path));
        }
        return new AblockProxyFactoryImpl(repoBasedir);
    }
}

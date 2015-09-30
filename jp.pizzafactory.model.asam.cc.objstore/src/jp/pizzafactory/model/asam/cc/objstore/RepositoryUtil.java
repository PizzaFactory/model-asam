package jp.pizzafactory.model.asam.cc.objstore;

import java.io.File;

import jp.pizzafactory.model.asam.cc.objstore.impl.AblockProxyFactoryImpl;

public class RepositoryUtil {

    private RepositoryUtil() {
        /* It is an utility class. */
    }

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
    public static AblockProxyFactory newAblockProxyFactory(
            final File repoBasedir) {
        final File dir;
        if (repoBasedir == null) {
            String[] path = new String[] { System.getProperty("user.home"),
                    ".m2", "repository" };

            dir = new File(String.join(File.separator, path));
        } else {
            dir = repoBasedir;
        }
        return new AblockProxyFactoryImpl(dir);
    }
}

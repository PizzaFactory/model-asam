package jp.pizzafactory.model.asam.cc.objstore.internal;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxy;
import jp.pizzafactory.model.asam.cc.objstore.AblockProxyFactory;
import jp.pizzafactory.model.asam.cc.objstore.RepositoryUtil;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;

import asam.cc.Ablock;
import asam.cc.ContainerCatalogFactory;

public class AblockProxyTest {

    @Test
    public void testToFile() throws CoreException {
        Ablock ablock = ContainerCatalogFactory.eINSTANCE.createAblock();
        ablock.setDomain("org.apache.maven");
        ablock.setShortName("maven");
        ablock.setCategory("pom");

        AblockProxyFactory factory = RepositoryUtil.newAblockProxyFactory();
        factory.addRemoteRepository("central", "default",
                "http://central.maven.org/maven2/");
        AblockProxy proxy = factory.create();
        File file = proxy.toFile(ablock, "", "2.0");

        assertNotNull(file);
        // /home/monaka/workspace-asam/jp.pizzafactory.model.asam.cc.objstore.tests:.m2:repository/org/apache/maven/maven/2.0/maven-2.0.pom
    }

}

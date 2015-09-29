package jp.pizzafactory.model.asam.cc.objstore.internal;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxy;
import jp.pizzafactory.model.asam.cc.objstore.AblockProxyFactory;
import jp.pizzafactory.model.asam.cc.objstore.RepositoryUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import asam.cc.Ablock;
import asam.cc.ContainerCatalogFactory;
import asam.cc.Files;

public class AblockProxyTest {
    public static final String TEST_FILE_PATH = "foo/test.txt";

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testInstall() throws CoreException {
        File basedir = tempFolder.getRoot();
        try {
            tempFolder.newFolder("foo");
            tempFolder.newFile(TEST_FILE_PATH);
        } catch (IOException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "", e);
            Activator.getDefault().getLog().log(status);
            fail();
        }
        
        Ablock ablock = ContainerCatalogFactory.eINSTANCE.createAblock();
        ablock.setDomain("jp.pizzafactory.model.asam.cc.objstore");
        ablock.setShortName("test-placefolder");
        ablock.setCategory("install-test-artifact");
        Files files = ContainerCatalogFactory.eINSTANCE.createFiles();
        ablock.setFiles(files);
        files.getFile().add(TEST_FILE_PATH);
        
        AblockProxyFactory factory = RepositoryUtil.newAblockProxyFactory();
        // factory.addRemoteRepository("central", "default",
        // "http://central.maven.org/maven2/");
        AblockProxy proxy = factory.create(ablock, basedir);
        proxy.install("0.0.1-SNAPSHOT");
    }

}

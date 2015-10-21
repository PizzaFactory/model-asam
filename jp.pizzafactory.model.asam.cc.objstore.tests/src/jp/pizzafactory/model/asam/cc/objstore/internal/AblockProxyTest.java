package jp.pizzafactory.model.asam.cc.objstore.internal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import jp.pizzafactory.model.asam.cc.objstore.AblockProxy;
import jp.pizzafactory.model.asam.cc.objstore.AblockProxyFactory;
import jp.pizzafactory.model.asam.cc.objstore.RepositoryUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runners.MethodSorters;

import asam.cc.Ablock;
import asam.cc.ContainerCatalogFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AblockProxyTest {
    public static final String TEST_FILE_PATH = "foo/test.txt";

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Rule
    public TemporaryFolder tempRepo = new TemporaryFolder();

    @Rule
    public TemporaryFolder tempRemoteRepo = new TemporaryFolder();

    private Ablock ablock;

    private static final String TARGET_VERSION = "0.0.1-SNAPSHOT"; //$NON-NLS-1$
    private static final String DOMAIN_NAME = "jp.pizzafactory.model.asam.cc.objstore"; //$NON-NLS-1$
    private static final String CATEGORY_NAME = "install-test-artifact"; // $NLN-NLS-1$
    private static final String SHORT_NAME = "test-placefolder"; //$NON-NLS-1$ 

    private static final String REPO_ID = "test"; //$NON-NLS-1$

    private static File getRepositoryFile(File basedir) {
        String path = String.join(
                "/",
                new String[] {
                        DOMAIN_NAME.replaceAll("\\.", "/"),
                        SHORT_NAME,
                        TARGET_VERSION,
                        String.join("-", new String[] { SHORT_NAME,
                                TARGET_VERSION, CATEGORY_NAME }) })
                + ".zip";
        return new File(basedir, path);
    }

    @BeforeClass
    public static void setUp() {
        AblockProxyFactory factory = RepositoryUtil.newAblockProxyFactory();
        File file = getRepositoryFile(factory.getRepoBasedir());
        if (file.exists()) {
            file.delete();
        }
    }

    @Before
    public void tearUp() {
        ablock = ContainerCatalogFactory.eINSTANCE.createAblock();
        ablock.setDomain(DOMAIN_NAME);
        ablock.setShortName(SHORT_NAME);
        ablock.setCategory(CATEGORY_NAME);
    }

    /*
     * This test must be run at the first.
     */
    @Test
    public void test0Install() throws CoreException {
        File basedir = tempFolder.getRoot();
        try {
            tempFolder.newFolder("foo");
            tempFolder.newFile(TEST_FILE_PATH);
        } catch (IOException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "",
                    e);
            Activator.getDefault().getLog().log(status);
            fail();
        }

        ablock.getFiles().add(TEST_FILE_PATH);

        AblockProxyFactory factory = RepositoryUtil.newAblockProxyFactory();
        AblockProxy proxy = factory.create(ablock, basedir);
        proxy.install(TARGET_VERSION);

        File installed = getRepositoryFile(factory.getRepoBasedir());

        assertTrue(installed.exists());
    }

    @Test
    public void testCheckout() throws CoreException {
        File basedir = tempFolder.getRoot();

        assertFalse(new File(basedir, TEST_FILE_PATH).exists());

        ablock.getFiles().add(TEST_FILE_PATH);

        AblockProxyFactory factory = RepositoryUtil.newAblockProxyFactory();
        // factory.addRemoteRepository("central", "default",
        // "http://central.maven.org/maven2/");
        AblockProxy proxy = factory.create(ablock, basedir);
        proxy.checkout(TARGET_VERSION);
        assertTrue(new File(basedir, TEST_FILE_PATH).exists());
    }

    @Test(expected = CoreException.class)
    public void test2Checkout() throws CoreException {
        File basedir = tempFolder.getRoot();

        assertFalse(new File(basedir, TEST_FILE_PATH).exists());

        ablock.getFiles().add(TEST_FILE_PATH + "2");

        AblockProxyFactory factory = RepositoryUtil.newAblockProxyFactory();
        AblockProxy proxy = factory.create(ablock, basedir);
        proxy.checkout(TARGET_VERSION);
    }

    @Test(expected = CoreException.class)
    public void test3Checkout() throws CoreException {
        File basedir = tempFolder.getRoot();

        assertFalse(new File(basedir, TEST_FILE_PATH).exists());

        ablock.getFiles().add(TEST_FILE_PATH);
        ablock.getFiles().add(TEST_FILE_PATH + "2");

        AblockProxyFactory factory = RepositoryUtil.newAblockProxyFactory();
        AblockProxy proxy = factory.create(ablock, basedir);
        proxy.checkout("0.0.1-SNAPSHOT");
        assertTrue(new File(basedir, TEST_FILE_PATH).exists());
    }

    @Test
    public void testInstall() throws CoreException {
        File basedir = tempFolder.getRoot();
        try {
            tempFolder.newFolder("foo");
            tempFolder.newFile(TEST_FILE_PATH);
        } catch (IOException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "",
                    e);
            Activator.getDefault().getLog().log(status);
            fail();
        }

        ablock.getFiles().add(TEST_FILE_PATH);

        File tempRepoFile = tempRepo.getRoot();
        AblockProxyFactory factory = RepositoryUtil
                .newAblockProxyFactory(tempRepoFile);
        AblockProxy proxy = factory.create(ablock, basedir);
        proxy.install(TARGET_VERSION);

        File installed = getRepositoryFile(tempRepoFile);

        assertTrue(installed.exists());
    }

    @Test
    public void testDeploy() throws Exception {
        File basedir = tempFolder.getRoot();
        try {
            tempFolder.newFolder("foo");
            tempFolder.newFile(TEST_FILE_PATH);
        } catch (IOException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "",
                    e);
            Activator.getDefault().getLog().log(status);
            fail();
        }

        ablock.getFiles().add(TEST_FILE_PATH);

        File tempRepoFile = tempRepo.getRoot();
        File tempRemoteRepoFile = tempRepo.getRoot();
        AblockProxyFactory factory = RepositoryUtil
                .newAblockProxyFactory(tempRepoFile);
        factory.addRemoteRepository(REPO_ID, "default", tempRemoteRepoFile
                .toURI().toURL().toExternalForm());
        AblockProxy proxy = factory.create(ablock, basedir);
        proxy.deploy(TARGET_VERSION, REPO_ID);

        File installed = getRepositoryFile(tempRemoteRepoFile);

        assertTrue(installed.getParentFile().exists());
    }
}

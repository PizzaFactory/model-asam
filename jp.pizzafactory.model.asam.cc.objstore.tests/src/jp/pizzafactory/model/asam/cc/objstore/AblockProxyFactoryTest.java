package jp.pizzafactory.model.asam.cc.objstore;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import asam.cc.Ablock;
import asam.cc.impl.ContainerCatalogFactoryImpl;

public class AblockProxyFactoryTest {

    private AblockProxyFactory factory;
    private static final String ID = "id";
    private static final String URL = "http://somedomain.example/";
    @Before
    public void setUp() {
        factory = RepositoryUtil.newAblockProxyFactory();
    }

    @Test
    public void testAddRemoveRepository() {
        factory.addRemoteRepository(ID, "default", URL);
        assertThat(factory.getRemoteRepository(ID).getId(), equalTo(ID));
        assertThat(factory.getRemoteRepository(ID).getUrl(), equalTo(URL));

        assertNull(factory.getRemoteRepository("not registered"));
    }

    @Test
    public void testCreate() {
        File basedir = new File("dummy");
        Ablock ablock = ContainerCatalogFactoryImpl.eINSTANCE.createAblock();
        factory.create(ablock, basedir);
    }

    @Test
    public void testRepoBasedir() {
        File file = new File("dummy");
        File basedir = RepositoryUtil.newAblockProxyFactory(file)
                .getRepoBasedir();

        assertThat(file, equalTo(basedir));
    }

    @Test
    public void testRemoveRemoveRepository() {
        /* Check if ID is not registered. */
        assertNull(factory.getRemoteRepository(ID));

        /* Add and remove */
        factory.addRemoteRepository(ID, "default", URL);
        assertNotNull(factory.getRemoteRepository(ID));
        factory.removeRemoteRepository(ID);

        /* Check if ID is removed. */
        assertNull(factory.getRemoteRepository(ID));
    }
}

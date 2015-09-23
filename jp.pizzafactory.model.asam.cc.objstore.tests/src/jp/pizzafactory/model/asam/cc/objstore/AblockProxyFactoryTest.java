package jp.pizzafactory.model.asam.cc.objstore;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

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

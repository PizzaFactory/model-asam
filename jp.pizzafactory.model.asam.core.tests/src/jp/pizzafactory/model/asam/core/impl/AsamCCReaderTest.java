package jp.pizzafactory.model.asam.core.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;

import jp.pizzafactory.model.asam.core.AsamCCResource;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import asam.cc.Catalog;
import asam.cc.impl.CatalogImpl;

public class AsamCCReaderTest {
    /*
     * @Test public void testParseInFiles() { fail("Not yet implemented"); }
     * 
     * @Test public void testParseInAblock() { fail("Not yet implemented"); }
     * 
     * @Test public void testParseInAblocks() { fail("Not yet implemented"); }
     * 
     * @Test public void testParseInCatalog() { fail("Not yet implemented"); }
     * 
     * @Test public void testReadAsamCCResourceDocument() {
     * fail("Not yet implemented"); }
     */
    @Test
    public void testReadAsamCCResourceInputStream() throws CoreException {
        AsamCCReader reader = new AsamCCReader();
        AsamCCResource resource = new AsamCCResourceImpl(
                URI.createURI("file:dummy"));

        InputStream ist = AsamCCReader.class
                .getResourceAsStream("sample-catalog.xml");
        reader.read(resource, ist);

        EObject o = resource.getContents().get(0);
        assertTrue(o instanceof CatalogImpl);
        Catalog c = (Catalog) o;
        assertEquals("sample", c.getShortName());
    }

}

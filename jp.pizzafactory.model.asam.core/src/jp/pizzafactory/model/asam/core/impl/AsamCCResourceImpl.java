package jp.pizzafactory.model.asam.core.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import jp.pizzafactory.model.asam.core.AsamCCResource;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.w3c.dom.Document;

public class AsamCCResourceImpl extends XMLResourceImpl implements
        AsamCCResource {

    public AsamCCResourceImpl(URI uri) {
        super(uri);
    }

    @Override
    public void doLoad(InputStream inputStream, Map<?, ?> options)
            throws IOException {
        AsamCCReader reader = new AsamCCReader();
        Document document = null;

        try {
            if (options != null
                    && (document = (org.w3c.dom.Document) options
                            .get("DOMDocument")) != null) {
                reader = new AsamCCReader();
                reader.read(this, document);
            } else {
                reader.read(this, inputStream);
            }
        } catch (CoreException e) {
            throw new IOException("Error on parsing XML.", e);
        }
    }

    @Override
    public void doSave(OutputStream outputStream, Map<?, ?> options)
            throws IOException {

        AsamCCWriter writer = new AsamCCWriter();
        writer.write(this, outputStream);

    }

}

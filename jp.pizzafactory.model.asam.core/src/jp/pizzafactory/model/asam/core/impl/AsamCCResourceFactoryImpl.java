package jp.pizzafactory.model.asam.core.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class AsamCCResourceFactoryImpl extends XMIResourceFactoryImpl {

    @Override
    public Resource createResource(URI uri) {
        return new AsamCCResourceImpl(uri);
    }
}

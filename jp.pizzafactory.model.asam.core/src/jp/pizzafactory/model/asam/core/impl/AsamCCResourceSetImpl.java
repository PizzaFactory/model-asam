package jp.pizzafactory.model.asam.core.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class AsamCCResourceSetImpl extends ResourceSetImpl {

    @Override
    public Resource createResource(URI uri, String kind) {
        if (kind == null) {
            return super.createResource(uri);
        }
        Resource resource = createResource(URI.createURI("*." + kind));
        resource.setURI(uri);
        return resource;
    }
}

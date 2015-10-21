package jp.pizzafactory.model.asam.core.internal;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

    public static final String PLUGIN_ID = "jp.pizzafactory.model.asam.core";

    private static BundleContext context;

    @Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

    @Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}

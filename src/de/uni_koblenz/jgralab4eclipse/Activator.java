package de.uni_koblenz.jgralab4eclipse;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.uni_koblenz.jgralab.greql2.funlib.Greql2FunctionLibrary;

public class Activator implements BundleActivator {

	static {
		Greql2FunctionLibrary.eclipseFunctionLoader = new EclipseGreqlFunctionLoaderImpl();
	}

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}

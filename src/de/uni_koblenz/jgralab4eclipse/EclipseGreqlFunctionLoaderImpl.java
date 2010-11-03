/**
 * 
 */
package de.uni_koblenz.jgralab4eclipse;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;

import de.uni_koblenz.jgralab.greql2.funlib.Greql2FunctionLibrary;
import de.uni_koblenz.jgralab.greql2.funlib.Greql2FunctionLibrary.EclipseGreqlFunctionLoader;

/**
 * @author Tassilo Horn &lt;horn@uni-koblenz.de&gt;
 * 
 */
public class EclipseGreqlFunctionLoaderImpl implements
		EclipseGreqlFunctionLoader {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.uni_koblenz.jgralab.greql2.funlib.Greql2FunctionLibrary.
	 * EclipseGreqlFunctionLoader
	 * #registerFunctionsInResourceBundle(java.net.URL)
	 */
	@Override
	public void registerFunctionsInResourceBundle(URL res) {
		try {
			URL fileURL = FileLocator.toFileURL(res);
			// url.toURI() won't do the trick if there are spaces in the URL...
			URI uri = new URI(fileURL.toString().replace(" ", "%20"));
			// System.out.println("URI = " + uri);
			File mydirectory = new File(uri);
			Greql2FunctionLibrary.instance().registerFunctionsInDirectory(
					mydirectory.getCanonicalPath());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

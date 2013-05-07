
package org.universAAL.ontology;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.language.Language;

public class LanguageFactory extends ResourceFactoryImpl {

	public LanguageFactory(URL dataURL){
		super();
		tableURL = dataURL;
	}

	private URL tableURL;
	
	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {
		Resource ret = null;
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(tableURL.openStream(), Charset.forName("UTF-8")));
			int line = 0;
			String ll = "";
			while (line != factoryIndex + 1
					&& (ll = br.readLine()) != null){
				line++;
			}
			if (ll != null) {
				String[] props =  ll.split("\\|");
				if (props.length >= 4) {
					ret = new LanguageFactory.LanguageImpl(instanceURI, props[1], props[2], props[3]);					
				}
			}
			br.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	return ret;
  }
	/**
	 * @author amedrano
	 *
	 */
	public final class LanguageImpl extends Language {

		public LanguageImpl(String uri, String name, String nativeName, String code){
			super(uri);
			setEnglishLabel(name);
			setNativeLabel(nativeName);
			setIso639code(code);
		}
	}
}

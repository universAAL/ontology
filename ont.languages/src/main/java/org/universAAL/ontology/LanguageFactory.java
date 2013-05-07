
package org.universAAL.ontology;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.language.LanguageOntology;
import org.universAAL.ontology.language.impl.LanguageImpl;

public class LanguageFactory extends ResourceFactoryImpl {

	

	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {
		URL tableURL = getClass().getClassLoader().getResource(LanguageOntology.LANG_TABLE);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(tableURL.openStream(), Charset.forName("UTF-8")));
			int line = 0;
			String ll = "";
			while (line != factoryIndex + 1
					&& (ll = br.readLine()) != null){
				line++;
			}
			if (ll != null) {
				String[] props =  ll.split("\\|");
				if (props.length >= 4) {
					return new LanguageImpl(props[1], props[2], props[3]);
				}
				else {
					System.out.println(props.length);
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	return null;
  }
}

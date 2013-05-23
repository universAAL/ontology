/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * Licensed under both Apache License, Version 2.0 and MIT License.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.language.LanguageImpl;

/**
 * @author amedrano
 * @author eandgrg
 * 
 */
public class LanguageFactory extends ResourceFactoryImpl {

    public LanguageFactory(URL dataURL) {
	super();
	tableURL = dataURL;
    }

    private URL tableURL;

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	Resource ret = null;
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(
		    tableURL.openStream(), Charset.forName("UTF-8")));
	    int line = 0;
	    String ll = "";
	    while (line != factoryIndex + 1 && (ll = br.readLine()) != null) {
		line++;
	    }
	    if (ll != null) {
		String[] props = ll.split("\\|");
		if (props.length >= 4) {
			/*
			 * FIXME DIRTY TRICK to get over the init() in ManagedIndividual
			 */
			LanguageImpl.tempURI = classURI;
		    ret = new LanguageImpl(instanceURI,
			    props[1], props[2], props[3]);
		}
	    }
	    br.close();
	} catch (Exception e) {
	    // TODO: handle exception
		e.printStackTrace();
	}
	return ret;
    }
}

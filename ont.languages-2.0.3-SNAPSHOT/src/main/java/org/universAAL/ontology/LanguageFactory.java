/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
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

import org.universAAL.middleware.container.utils.LogUtils;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.language.LanguageImpl;

/**
 * @author amedrano
 * @author eandgrg
 * 
 */
public class LanguageFactory implements ResourceFactory {

    public LanguageFactory(URL dataURL) {
	tableURL = dataURL;
    }

    private URL tableURL;

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(
		    tableURL.openStream(), Charset.forName("UTF-8")));
	    int line = 0;
	    String ll = "";
	    while (line != factoryIndex + 1 && (ll = br.readLine()) != null) {
		line++;
	    }
	    br.close();
	    if (ll != null) {
		String[] props = ll.split("\\|");
		if (props.length >= 4) {
		    /*
		     * FIXME DIRTY TRICK to get over the init() in
		     * ManagedIndividual
		     */
		    LanguageImpl.tempURI = classURI;
		    return new LanguageImpl(instanceURI, props[1], props[2],
			    props[3]);
		} else {
		    LogUtils.logError(LanguageActivator.context,
			    LanguageFactory.class, "createInstance",
			    "No element found for classURI " + classURI
				    + ", instanceURI " + instanceURI
				    + ", factoryIndex: " + factoryIndex
				    + ": props.length too small.");
		}
	    } else {
		LogUtils.logError(LanguageActivator.context,
			LanguageFactory.class, "createInstance",
			"No element found for classURI " + classURI
				+ ", instanceURI " + instanceURI
				+ ", factoryIndex: " + factoryIndex
				+ ": index too big, line not found.");
	    }

	} catch (Exception e) {
	    e.printStackTrace();
	}
	return null;
    }
}

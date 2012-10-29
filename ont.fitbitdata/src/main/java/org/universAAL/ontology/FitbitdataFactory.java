/*
	Copyright 2011-2012 TSB, http://www.tsbtecnologias.es
	TSB - Tecnologías para la Salud y el Bienestar
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */

package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;


import org.universAAL.ontology.fitbitdata.Sleep;
import org.universAAL.ontology.fitbitdata.FitbitData;
import org.universAAL.ontology.fitbitdata.Activity;

public class FitbitdataFactory extends ResourceFactoryImpl {

	public static final int Sleep = 0;
	public static final int FitbitData = 1;
	public static final int Activity = 2;
	
  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case Sleep:
       return new Sleep(instanceURI);
     case FitbitData:
       return new FitbitData(instanceURI);
     case Activity:
       return new Activity(instanceURI);

	}
	return null;
  }
}

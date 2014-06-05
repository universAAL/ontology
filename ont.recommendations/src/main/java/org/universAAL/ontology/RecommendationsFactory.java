/*******************************************************************************
 * Copyright 2013 Universidad PolitĂ©cnica de Madrid
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

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.recommendations.CSSRecommendation;
import org.universAAL.ontology.recommendations.GridLayout;
import org.universAAL.ontology.recommendations.HorizontalAlignment;
import org.universAAL.ontology.recommendations.HorizontalLayout;
import org.universAAL.ontology.recommendations.MaximumSize;
import org.universAAL.ontology.recommendations.MinimumSize;
import org.universAAL.ontology.recommendations.PreferredSize;
import org.universAAL.ontology.recommendations.VerticalAlignment;
import org.universAAL.ontology.recommendations.VerticalLayout;

public class RecommendationsFactory implements ResourceFactory {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case 0:
       return new VerticalLayout(instanceURI);
     case 1:
       return new HorizontalLayout(instanceURI);
     case 2:
       return new HorizontalAlignment(instanceURI);
     case 3:
       return new GridLayout(instanceURI);
     case 4:
       return new VerticalAlignment(instanceURI);
     case 5:
    	 return new MaximumSize(instanceURI);
     case 6:
    	 return new MinimumSize(instanceURI);
     case 7:
    	 return new PreferredSize(instanceURI);
     case 8:
    	 return new CSSRecommendation(instanceURI);
	}
	return null;
  }
}

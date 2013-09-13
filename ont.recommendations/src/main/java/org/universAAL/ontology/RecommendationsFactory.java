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
import org.universAAL.ontology.recommendations.Alignment;
import org.universAAL.ontology.recommendations.AuditoryRecommendation;
import org.universAAL.ontology.recommendations.FillParent;
import org.universAAL.ontology.recommendations.Font;
import org.universAAL.ontology.recommendations.GridLayout;
import org.universAAL.ontology.recommendations.HorizontalAlignment;
import org.universAAL.ontology.recommendations.HorizontalLayout;
import org.universAAL.ontology.recommendations.Layout;
import org.universAAL.ontology.recommendations.Size;
import org.universAAL.ontology.recommendations.Text;
import org.universAAL.ontology.recommendations.TextAlignment;
import org.universAAL.ontology.recommendations.TextSize;
import org.universAAL.ontology.recommendations.VerticalAlignment;
import org.universAAL.ontology.recommendations.VerticalLayout;
import org.universAAL.ontology.recommendations.VisualRecommendation;
import org.universAAL.ontology.recommendations.WebRecommendation;

public class RecommendationsFactory implements ResourceFactory {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case 0:
       return new VerticalLayout(instanceURI);
     case 1:
       return new Text(instanceURI);
     case 2:
       return new HorizontalLayout(instanceURI);
     case 3:
       return new Size(instanceURI);
     case 4:
       return new FillParent(instanceURI);
     case 5:
       return new HorizontalAlignment(instanceURI);
     case 6:
       return new Font(instanceURI);
     case 7:
       return new GridLayout(instanceURI);
     case 8:
       return new WebRecommendation(instanceURI);
     case 10:
       return new VerticalAlignment(instanceURI);
     case 11:
       return new TextSize(instanceURI);
     case 12:
       return new Layout(instanceURI);
     case 13:
       return new VisualRecommendation(instanceURI);
     case 14:
       return new TextAlignment(instanceURI);
     case 15:
       return new Alignment(instanceURI);
     case 16:
       return new AuditoryRecommendation(instanceURI);

	}
	return null;
  }
}

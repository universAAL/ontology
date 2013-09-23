/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.universAAL.ontology.recommendations;

import org.universAAL.middleware.ui.rdf.FormControl;

/**
 * CSS Recommendation is the scripting recommendation in CSS. 
 * To be used in the furture by Hanlders, the idea is to provide the class 
 * and styles for each {@link FormControl}.
 * 
 * @author amedrano
 * 
 */
public class CSSRecommendation extends ScriptedRecommendation {
	  /**
	 * 
	 */
	public static final String CSS_LANG = "text/css";
	public static final String MY_URI = RecommendationsOntology.NAMESPACE
			    + "CSSScriptRecommendation";
	  
	/**
	 * 
	 */
	public CSSRecommendation() {
		changeProperty(PROP_LANGUAJE, CSS_LANG);
	}

	/**
	 * @param uri
	 */
	public CSSRecommendation(String uri) {
		super(uri);
		changeProperty(PROP_LANGUAJE, CSS_LANG);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return super.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return super.isWellFormed();
	}
}

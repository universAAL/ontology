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
 * Used to tell Handlers an element is not supposed to exeed certain dimensions.
 * The code:
 * <pre>
 * <code> 
 * {@link FormControl} f = ...;
 * f.addAppearanceRecommendation(new MaximumSize(100,33, SizeUnit.screenRelative));
 * </code></pre>
 * will set the maximum size of the component to be 100% of the screen wide, and 33% of the screen's height high-
 * @author amedrano
 * @see SizeUnit
 *
 */
public class MaximumSize extends Size {

	  public static final String MY_URI = RecommendationsOntology.NAMESPACE
			    + "MaximumSize";
	/**
	 * 
	 */
	public MaximumSize() {}

	/**
	 * @param width
	 * @param height
	 * @param unit
	 */
	public MaximumSize(int width, int height, SizeUnit unit) {
		super(width, height, unit); 
	}

	/**
	 * @param uri
	 */
	public MaximumSize(String uri) {
		super(uri);
	}

	
	  public String getClassURI() {
		    return MY_URI;
		  }
}

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

package org.universAAL.ontology.language;


/**
 * @author amedrano
 * 
 */
public final class LanguageImpl extends Language {

	public static String tempURI;
	
	private String uri;

	public LanguageImpl(String uri, String name, String nativeName,
			String code) {
		super(uri);
		props.put(Language.PROP_ENGLISH_LABEL, name);
		props.put(Language.PROP_NATIVE_LABEL, nativeName);
		props.put(Language.PROP_ISO639CODE, code);
		uri = LanguageOntology.NAMESPACE + LanguageOntology.getURIFromLabel(getEnglishLabel());
		
	}

	/** {@ inheritDoc}	 */
	public String getClassURI() {
		if (uri != null)
			return uri ;
		else
			return tempURI;
	}


}
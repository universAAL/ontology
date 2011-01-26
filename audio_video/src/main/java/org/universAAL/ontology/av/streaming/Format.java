/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung
	
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

package org.universAAL.ontology.av.streaming;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.phThing.Device;

/**
 * this class should be the representation of a media format and is used for streaming processes
 * 
 * 
 * @author climberg
 *
 */
public abstract class Format extends ManagedIndividual{
	
	public static final String MY_URI;
	
	public static final String PROP_ENCODING;
	
	static{
		MY_URI = Stream.STREAM_NAMESPACE + "format";
		PROP_ENCODING = Stream.STREAM_NAMESPACE + "encoding";
		register(Format.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_ENCODING.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					Compression.MY_URI, 1, 1);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = Device.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length + 1];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i] = PROP_ENCODING;
		return toReturn;
	}
	
	/**
	 * the default constructor
	 */
	public Format(){
		super();
	}
	
	/**
	 *
	 */
	public Format(String uri) {
		super(uri);
	}
	
	public Compression getCompression(){
		return (Compression)getProperty(PROP_ENCODING);
	}
	
	public static String getRDFSComment() {
		return "The class of all Formats.";
	}

	public static String getRDFSLabel() {
		return "Format";
	}

	
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
	
	public boolean isWellFormed() {
		return true;
	}

}

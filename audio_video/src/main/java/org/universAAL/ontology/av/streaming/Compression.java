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
 * 
 * @author climberg
 *
 */
public abstract class Compression extends ManagedIndividual{
	
    public static final String MY_URI;
	
	static{
		MY_URI = Stream.STREAM_NAMESPACE + "compression";
		register(Compression.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = Device.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length + 0];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		return toReturn;
	}
	
	/**
	 * the default constructor
	 */
	public Compression(){
		super();
	}
	
	/**
	 *
	 */
	public Compression(String uri) {
		super(uri);
	}
	
	public static String getRDFSComment() {
		return "The abstract class of compressions.";
	}

	public static String getRDFSLabel() {
		return "Compression";
	}

	
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
	
	public boolean isWellFormed() {
		return true;
	}

}

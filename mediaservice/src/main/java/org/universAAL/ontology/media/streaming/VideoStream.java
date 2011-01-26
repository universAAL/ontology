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

package org.universAAL.ontology.media.streaming;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;

/**
 * 
 * @author climberg
 *
 */
public class VideoStream extends Stream{

	public static final String MY_URI;
	
	static{
		MY_URI = Stream.STREAM_NAMESPACE + "VideoStream";
		register(VideoStream.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI){
		if (PROP_HAS_FORMAT.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
							VideoFormat.MY_URI, 1, 1);
		return Stream.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = ManagedIndividual.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		return toReturn;
	}
	
	public static String getRDFSComment() {
		return "The class of VideoStreams.";
	}
	
	public static String getRDFSLabel() {
		return "VideoStream";
	}
	
	/**
	 * default constructor
	 */
	public VideoStream() {
		super();
	}
	
	public VideoStream(String uri) {
		super(uri);
	}
	
	public int getPropSerializationType(String propURI){
			return PROP_SERIALIZATION_FULL;
	}
	
	//removed soon
	public boolean isWellFormed() {
		return true;
	}

}

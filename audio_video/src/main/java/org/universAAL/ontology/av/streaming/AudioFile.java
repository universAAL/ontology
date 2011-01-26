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


import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;

/**
 * 
 * @author climberg
 *
 */
public class AudioFile extends ManagedIndividual{
	
	public static final String MY_URI;
	public static final String PROP_HAS_URL;
	// content type should be replaced by format
	public static final String PROP_HAS_CONTENT_TYPE;
	public static final String PROP_HAS_FORMAT;
	
	static{
		MY_URI = Stream.STREAM_NAMESPACE + "AudioFile";
		PROP_HAS_URL = Stream.STREAM_NAMESPACE + "hasURL";
		PROP_HAS_CONTENT_TYPE = Stream.STREAM_NAMESPACE + "hasContentType";
		PROP_HAS_FORMAT = Stream.STREAM_NAMESPACE + "hasFormat";
	    register(AudioFile.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI){
		if (PROP_HAS_FORMAT.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, AudioFormat.MY_URI, 1, 1);
		if (PROP_HAS_URL.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(String.class), 1, 1);
		if (PROP_HAS_CONTENT_TYPE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
							TypeMapper.getDatatypeURI(String.class), 1, 1);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = ManagedIndividual.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length + 3];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
	
		toReturn[i++] = PROP_HAS_URL;
		toReturn[i++] = PROP_HAS_FORMAT;
		toReturn[i]   = PROP_HAS_CONTENT_TYPE;
		return toReturn;
	}
	
	public static String getRDFSComment() {
		return "The class of AudioFiles.";
	}
	
	public static String getRDFSLabel() {
		return "AudioFile";
	}
	
	public String getURL(){
		Object obj = getProperty(PROP_HAS_URL);
		if(obj instanceof String)
			return (String)obj;
		return null;
	}
	
	//TODO: perhaps it is better, if the parameter is checked for URL conventions
	public void setURL(String URL){
		setProperty(PROP_HAS_URL, URL);
	}
	
	/**
	 * the default constructor
	 */
	public AudioFile() {
		super();
	}
	
	public AudioFile(String uri) {
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

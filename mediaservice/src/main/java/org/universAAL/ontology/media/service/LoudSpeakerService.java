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

package org.universAAL.ontology.media.service;

import java.util.Hashtable;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.media.device.LoudSpeaker;
import org.universAAL.ontology.media.streaming.AudioFile;
import org.universAAL.ontology.media.streaming.AudioStream;

/**
 * 
 * @author climberg
 *
 */
public class LoudSpeakerService extends Service {

	
	//customizing necessary!!!!
	public static final String MY_URI;
	public static final String PROP_CONTROLS;
	public static final String PROP_HAS_TO_BROADCAST_AUDIO_FILE;
	public static final String PROP_HAS_TO_BROADCAST_AUDIO_STREAM;
	
	private static Hashtable loudSpeakerServiceRestrictions = new Hashtable(2);
	
	static {
		MY_URI = LoudSpeaker.LOUD_SPEAKER_NAMESPACE + "LoudSpeakerService";
		PROP_CONTROLS = LoudSpeaker.LOUD_SPEAKER_NAMESPACE + "controls";
		PROP_HAS_TO_BROADCAST_AUDIO_FILE = LoudSpeaker.LOUD_SPEAKER_NAMESPACE + "broadcastsAudioFile";
		PROP_HAS_TO_BROADCAST_AUDIO_STREAM = LoudSpeaker.LOUD_SPEAKER_NAMESPACE + "broadcastsAudioStream";
		
		register(LoudSpeakerService.class);
		
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_CONTROLS, LoudSpeaker.MY_URI),
				new String[] {PROP_CONTROLS},
				loudSpeakerServiceRestrictions);
		
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_HAS_TO_BROADCAST_AUDIO_FILE, AudioFile.MY_URI),
				new String[] {PROP_HAS_TO_BROADCAST_AUDIO_FILE},
				loudSpeakerServiceRestrictions);
		
		addRestriction(
				Restriction.getAllValuesRestriction(PROP_HAS_TO_BROADCAST_AUDIO_STREAM, AudioStream.MY_URI),
				new String[] {PROP_HAS_TO_BROADCAST_AUDIO_STREAM},
				loudSpeakerServiceRestrictions);
		
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (propURI == null)
			return null;
		Object r = loudSpeakerServiceRestrictions.get(propURI);
		if (r instanceof Restriction)
			return (Restriction) r;
		return Service.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = Service.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length+3];
		int i = 0;
		
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i++] = PROP_CONTROLS;
		toReturn[i++] = PROP_HAS_TO_BROADCAST_AUDIO_FILE;
		toReturn[i]   = PROP_HAS_TO_BROADCAST_AUDIO_STREAM;
		return toReturn;
	}
	
	public static String getRDFSComment() {
		return "The class of services controling LoudSpeakers.";
	}
	
	public static String getRDFSLabel() {
		return "LoudSpeakerService";
	}
	
	/**
	 * default constructor
	 */
	public LoudSpeakerService(){
		super();
	}
	
	public LoudSpeakerService(String uri) {
		super(uri);
	}

	protected Hashtable getClassLevelRestrictions() {
		return loudSpeakerServiceRestrictions;
	}

	//perhaps other settings
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	//removed soon
	public boolean isWellFormed() {
		return true;
	}
}

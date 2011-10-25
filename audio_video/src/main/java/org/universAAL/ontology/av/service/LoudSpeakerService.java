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

package org.universAAL.ontology.av.service;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.AVOntology;

/**
 * Ontological service that handles loudspeakers. Methods included in this class
 * are the mandatory ones for representing an ontological service in Java
 * classes for uAAL.
 * 
 * @author climberg
 * @author Carsten Stockloew
 */
public class LoudSpeakerService extends Service {

    // customizing necessary!!!!
    public static final String MY_URI;
    public static final String PROP_CONTROLS;
    public static final String PROP_HAS_TO_BROADCAST_AUDIO_FILE;
    public static final String PROP_HAS_TO_BROADCAST_AUDIO_STREAM;

    static {
	MY_URI = AVOntology.NAMESPACE + "LoudSpeakerService";
	PROP_CONTROLS = AVOntology.NAMESPACE + "controls";
	PROP_HAS_TO_BROADCAST_AUDIO_FILE = AVOntology.NAMESPACE
		+ "broadcastsAudioFile";
	PROP_HAS_TO_BROADCAST_AUDIO_STREAM = AVOntology.NAMESPACE
		+ "broadcastsAudioStream";
    }

    /** default constructor */
    public LoudSpeakerService() {
	super();
    }

    public LoudSpeakerService(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    // perhaps other settings
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }
}

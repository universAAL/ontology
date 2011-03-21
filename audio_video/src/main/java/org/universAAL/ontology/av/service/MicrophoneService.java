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

import java.util.Hashtable;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.av.device.Microphone;
import org.universAAL.ontology.av.streaming.AudioStream;

/**
 * 
 * @author climberg
 * 
 */
public class MicrophoneService extends Service {

    // customizing necessary!!!!
    public static final String MY_URI;
    public static final String PROP_CONTROLS;
    public static final String PROP_DELIVERS;

    private static Hashtable microphoneServiceRestrictions = new Hashtable(3);

    static {
	MY_URI = Microphone.MICROPHONE_NAMESPACE + "MicrophoneService";
	PROP_CONTROLS = Microphone.MICROPHONE_NAMESPACE + "controls";
	PROP_DELIVERS = Microphone.MICROPHONE_NAMESPACE + "delivers";
	register(MicrophoneService.class);

	addRestriction(Restriction.getAllValuesRestriction(PROP_CONTROLS,
		Microphone.MY_URI), new String[] { PROP_CONTROLS },
		microphoneServiceRestrictions);

	addRestriction(Restriction.getAllValuesRestriction(PROP_DELIVERS,
		AudioStream.MY_URI), new String[] { PROP_DELIVERS },
		microphoneServiceRestrictions);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (propURI == null)
	    return null;
	Object r = microphoneServiceRestrictions.get(propURI);
	if (r instanceof Restriction)
	    return (Restriction) r;
	return Service.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Service.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 2];
	int i = 0;

	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_CONTROLS;
	toReturn[i] = PROP_DELIVERS;
	return toReturn;
    }

    public static String getRDFSComment() {
	return "The class of services controling microphones.";
    }

    public static String getRDFSLabel() {
	return "MicrophoneService";
    }

    /**
     * default constructor
     */
    public MicrophoneService() {
	super();
    }

    public MicrophoneService(String uri) {
	super(uri);
    }

    protected Hashtable getClassLevelRestrictions() {
	return microphoneServiceRestrictions;
    }

    // perhaps other settings
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    // removed soon
    public boolean isWellFormed() {
	return true;
    }

}

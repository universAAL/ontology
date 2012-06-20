/*
	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research 
	
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
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.av.device.LoudSpeaker;
import org.universAAL.ontology.av.device.Microphone;
import org.universAAL.ontology.av.device.VideoCamera;
import org.universAAL.ontology.av.service.CameraService;
import org.universAAL.ontology.av.service.LoudSpeakerService;
import org.universAAL.ontology.av.service.MicrophoneService;
import org.universAAL.ontology.av.streaming.AudioFile;
import org.universAAL.ontology.av.streaming.AudioFormat;
import org.universAAL.ontology.av.streaming.AudioStream;
import org.universAAL.ontology.av.streaming.EndPoint;
import org.universAAL.ontology.av.streaming.VideoFormat;
import org.universAAL.ontology.av.streaming.VideoStream;

/**
 * 
 * @author Carsten Stockloew
 * 
 */
public class AVFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new LoudSpeaker(instanceURI);
	case 1:
	    return new Microphone(instanceURI);
	case 2:
	    return new AudioFormat(instanceURI);
	case 3:
	    return new VideoFormat(instanceURI);
	case 4:
	    return new EndPoint();
	case 5:
	    return new AudioFile(instanceURI);
	case 6:
	    return new AudioStream(instanceURI);
	case 7:
	    return new VideoStream(instanceURI);
	case 8:
	    return new VideoCamera(instanceURI);
	case 9:
	    return new CameraService(instanceURI);
	case 10:
	    return new LoudSpeakerService(instanceURI);
	case 11:
	    return new MicrophoneService(instanceURI);
	}

	return null;
    }
}

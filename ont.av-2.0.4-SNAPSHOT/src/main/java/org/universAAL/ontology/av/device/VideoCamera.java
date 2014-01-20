/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
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

package org.universAAL.ontology.av.device;

import org.universAAL.middleware.util.Constants;
import org.universAAL.ontology.av.AVOntology;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a video camera. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author climberg
 * @author Carsten Stockloew
 */
public class VideoCamera extends Device {

    public static final String MY_URI = AVOntology.NAMESPACE + "VideoCamera";

    // some properties offered by persona.streaming
    public static final String PROP_BACKLIGHTCOMPENSATION = AVOntology.NAMESPACE + "";
    public static final String PROP_BRIGHTNESS = AVOntology.NAMESPACE + "brightness";
    public static final String PROP_COLORENABLE = AVOntology.NAMESPACE + "colorenable";
    public static final String PROP_CONTRAST = AVOntology.NAMESPACE + "contrast";
    public static final String PROP_EXPOSURE = AVOntology.NAMESPACE + "exposure";
    public static final String PROP_FOCUS = AVOntology.NAMESPACE + "focus";
    public static final String PROP_GAIN = AVOntology.NAMESPACE + "gain";
    public static final String PROP_GAMMA = AVOntology.NAMESPACE + "gamma";
    public static final String PROP_HUE = AVOntology.NAMESPACE + "hue";
    public static final String PROP_IRIS = AVOntology.NAMESPACE + "iris";
    public static final String PROP_PAN = AVOntology.NAMESPACE + "pan";
    public static final String PROP_ROLL = AVOntology.NAMESPACE + "roll";
    public static final String PROP_SATURATION = AVOntology.NAMESPACE + "saturation";
    public static final String PROP_SHARPNESS = AVOntology.NAMESPACE + "sharpness";
    public static final String PROP_TILT = AVOntology.NAMESPACE + "tilt";
    public static final String PROP_WHITEBALANCE = AVOntology.NAMESPACE + "whitebalance";

    // perhaps it is better, to add a format attribute
    // concerning the format
    public static final String PROP_VIDEO_COMPRESSION = AVOntology.NAMESPACE + "videoCompression";
    public static final String PROP_FRAMES_PER_SECOND = AVOntology.NAMESPACE + "framesPerSecond"; // also offered by
    // persona.streaming
    public static final String PROP_PIXEL_SIZE_IN_MICRON_SQUARE = AVOntology.NAMESPACE
    		+ "pixelSizeInMicronSquare";
    public static final String PROP_DPI = AVOntology.NAMESPACE + "dpi";

    public static final String PROP_FOCUS_POINT = AVOntology.NAMESPACE + "focusPoint";
    public static final String PROP_X_RESOLUTION = AVOntology.NAMESPACE + "xResolution";
    public static final String PROP_Y_RESOLUTION = AVOntology.NAMESPACE + "yResolution";
    public static final String PROP_Z_RESOLUTION = AVOntology.NAMESPACE + "zResolution";
    public static final String PROP_ZOOM = AVOntology.NAMESPACE + "zoom"; // also offered by persona.streaming

    public static final String PROP_FOCAL_DISTANCE = AVOntology.NAMESPACE + "focalDistance";
    public static final String PROP_FIELD_OF_VIEW_HORIZONTAL = AVOntology.NAMESPACE
    		+ "fieldOfViewHorizontal";
    public static final String PROP_FIELD_OF_VIEW_VERTICAL = AVOntology.NAMESPACE
    		+ "fieldOfViewVertical";

    
    /** the default constructor */
    public VideoCamera() {
	super();
    }

    public VideoCamera(String uri) {
	super((uri == null || uri.lastIndexOf('#') > 0) ? uri
		: Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX + uri);
    }

    /**
     * numProps is a dummy parameter this constructor is needed for constructing
     * video cameras with an unique URI
     */
    public VideoCamera(int numProps) {
	super(Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX + "camera", numProps);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_DPI.equals(propURI) || PROP_FOCUS_POINT.equals(propURI)
		|| PROP_FRAMES_PER_SECOND.equals(propURI)
		|| PROP_PIXEL_SIZE_IN_MICRON_SQUARE.equals(propURI)
		|| PROP_X_RESOLUTION.equals(propURI)
		|| PROP_Y_RESOLUTION.equals(propURI)
		|| PROP_ZOOM.equals(propURI)
		|| PROP_VIDEO_COMPRESSION.equals(propURI))
	    return PROP_SERIALIZATION_FULL;
	return super.getPropSerializationType(propURI);
    }
}

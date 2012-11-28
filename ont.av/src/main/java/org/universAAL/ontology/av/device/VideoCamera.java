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

    public static final String MY_URI;

    // some properties offered by persona.streaming
    public static final String PROP_BACKLIGHTCOMPENSATION;
    public static final String PROP_BRIGHTNESS;
    public static final String PROP_COLORENABLE;
    public static final String PROP_CONTRAST;
    public static final String PROP_EXPOSURE;
    public static final String PROP_FOCUS;
    public static final String PROP_GAIN;
    public static final String PROP_GAMMA;
    public static final String PROP_HUE;
    public static final String PROP_IRIS;
    public static final String PROP_PAN;
    public static final String PROP_ROLL;
    public static final String PROP_SATURATION;
    public static final String PROP_SHARPNESS;
    public static final String PROP_TILT;
    public static final String PROP_WHITEBALANCE;

    // perhaps it is better, to add a format attribute
    // concerning the format
    public static final String PROP_VIDEO_COMPRESSION;
    public static final String PROP_FRAMES_PER_SECOND; // also offered by
    // persona.streaming
    public static final String PROP_PIXEL_SIZE_IN_MICRON_SQUARE;
    public static final String PROP_DPI;

    public static final String PROP_FOCUS_POINT;
    public static final String PROP_X_RESOLUTION;
    public static final String PROP_Y_RESOLUTION;
    public static final String PROP_Z_RESOLUTION;
    public static final String PROP_ZOOM; // also offered by persona.streaming

    public static final String PROP_FOCAL_DISTANCE;
    public static final String PROP_FIELD_OF_VIEW_HORIZONTAL;
    public static final String PROP_FIELD_OF_VIEW_VERTICAL;

    static {
	MY_URI = AVOntology.NAMESPACE + "VideoCamera";

	PROP_DPI = AVOntology.NAMESPACE + "dpi";
	PROP_FOCUS_POINT = AVOntology.NAMESPACE + "focusPoint";
	PROP_FRAMES_PER_SECOND = AVOntology.NAMESPACE + "framesPerSecond";
	PROP_PIXEL_SIZE_IN_MICRON_SQUARE = AVOntology.NAMESPACE
		+ "pixelSizeInMicronSquare";
	PROP_X_RESOLUTION = AVOntology.NAMESPACE + "xResolution";
	PROP_Y_RESOLUTION = AVOntology.NAMESPACE + "yResolution";
	PROP_Z_RESOLUTION = AVOntology.NAMESPACE + "zResolution";
	PROP_ZOOM = AVOntology.NAMESPACE + "zoom";
	PROP_VIDEO_COMPRESSION = AVOntology.NAMESPACE + "videoCompression";
	PROP_BACKLIGHTCOMPENSATION = AVOntology.NAMESPACE + "";
	PROP_BRIGHTNESS = AVOntology.NAMESPACE + "brightness";
	PROP_COLORENABLE = AVOntology.NAMESPACE + "colorenable";
	PROP_CONTRAST = AVOntology.NAMESPACE + "contrast";
	PROP_EXPOSURE = AVOntology.NAMESPACE + "exposure";
	PROP_FOCUS = AVOntology.NAMESPACE + "focus";
	PROP_GAIN = AVOntology.NAMESPACE + "gain";
	PROP_GAMMA = AVOntology.NAMESPACE + "gamma";
	PROP_HUE = AVOntology.NAMESPACE + "hue";
	PROP_IRIS = AVOntology.NAMESPACE + "iris";
	PROP_PAN = AVOntology.NAMESPACE + "pan";
	PROP_ROLL = AVOntology.NAMESPACE + "roll";
	PROP_SATURATION = AVOntology.NAMESPACE + "saturation";
	PROP_SHARPNESS = AVOntology.NAMESPACE + "sharpness";
	PROP_TILT = AVOntology.NAMESPACE + "tilt";
	PROP_WHITEBALANCE = AVOntology.NAMESPACE + "whitebalance";
	PROP_FOCAL_DISTANCE = AVOntology.NAMESPACE + "focalDistance";
	PROP_FIELD_OF_VIEW_HORIZONTAL = AVOntology.NAMESPACE
		+ "fieldOfViewHorizontal";
	PROP_FIELD_OF_VIEW_VERTICAL = AVOntology.NAMESPACE
		+ "fieldOfViewVertical";
    }

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

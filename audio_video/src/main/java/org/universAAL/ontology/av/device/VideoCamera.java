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
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OrderingRestriction;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.location.position.Point;
import org.universAAL.ontology.av.streaming.VideoCompression;
import org.universAAL.ontology.phThing.Device;

/**
 * @author climberg
 * 
 */
public class VideoCamera extends Device {
	
	public static final String VIDEO_CAMERA_NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/VideoCamera.owl#";
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
	public static final String PROP_FRAMES_PER_SECOND; // also offered by persona.streaming
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
		MY_URI = VIDEO_CAMERA_NAMESPACE + "VideoCamera";
		
		PROP_DPI = VIDEO_CAMERA_NAMESPACE + "dpi";
		PROP_FOCUS_POINT = VIDEO_CAMERA_NAMESPACE + "focusPoint";
		PROP_FRAMES_PER_SECOND = VIDEO_CAMERA_NAMESPACE + "framesPerSecond";
		PROP_PIXEL_SIZE_IN_MICRON_SQUARE = VIDEO_CAMERA_NAMESPACE + "pixelSizeInMicronSquare";
		PROP_X_RESOLUTION = VIDEO_CAMERA_NAMESPACE + "xResolution";
		PROP_Y_RESOLUTION = VIDEO_CAMERA_NAMESPACE + "yResolution";
		PROP_Z_RESOLUTION = VIDEO_CAMERA_NAMESPACE + "zResolution";
		PROP_ZOOM = VIDEO_CAMERA_NAMESPACE + "zoom";
		PROP_VIDEO_COMPRESSION = VIDEO_CAMERA_NAMESPACE + "videoCompression";
		PROP_BACKLIGHTCOMPENSATION = VIDEO_CAMERA_NAMESPACE + "";
		PROP_BRIGHTNESS = VIDEO_CAMERA_NAMESPACE + "brightness";
		PROP_COLORENABLE = VIDEO_CAMERA_NAMESPACE + "colorenable";
		PROP_CONTRAST = VIDEO_CAMERA_NAMESPACE + "contrast";
		PROP_EXPOSURE = VIDEO_CAMERA_NAMESPACE + "exposure";
		PROP_FOCUS = VIDEO_CAMERA_NAMESPACE + "focus";
		PROP_GAIN = VIDEO_CAMERA_NAMESPACE + "gain";
		PROP_GAMMA = VIDEO_CAMERA_NAMESPACE + "gamma";
		PROP_HUE = VIDEO_CAMERA_NAMESPACE + "hue";
		PROP_IRIS = VIDEO_CAMERA_NAMESPACE + "iris";
		PROP_PAN = VIDEO_CAMERA_NAMESPACE + "pan";
		PROP_ROLL = VIDEO_CAMERA_NAMESPACE + "roll";
		PROP_SATURATION = VIDEO_CAMERA_NAMESPACE + "saturation";
		PROP_SHARPNESS = VIDEO_CAMERA_NAMESPACE + "sharpness";
		PROP_TILT = VIDEO_CAMERA_NAMESPACE + "tilt";
		PROP_WHITEBALANCE = VIDEO_CAMERA_NAMESPACE + "whitebalance";
		
		PROP_FOCAL_DISTANCE = VIDEO_CAMERA_NAMESPACE + "focalDistance";
		PROP_FIELD_OF_VIEW_HORIZONTAL = VIDEO_CAMERA_NAMESPACE + "fieldOfViewHorizontal";
		PROP_FIELD_OF_VIEW_VERTICAL = VIDEO_CAMERA_NAMESPACE + "fieldOfViewVertical";
		
		register(VideoCamera.class);
	}

	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_DPI.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Integer.class), 1, 0);
		if (PROP_PHYSICAL_LOCATION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					Point.MY_URI, 1, 0);
		if (PROP_FOCUS_POINT.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					Point.MY_URI, 1, 0);
		if (PROP_FRAMES_PER_SECOND.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Integer.class), 1, 0);
		if (PROP_PIXEL_SIZE_IN_MICRON_SQUARE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Double.class), 1, 0);
		if (PROP_X_RESOLUTION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Integer.class), 1, 0);
		if (PROP_Y_RESOLUTION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Integer.class), 1, 0);
		if (PROP_Z_RESOLUTION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(Integer.class), 1, 0);
		
		// TODO: think about definition of properties offered by persona.streaming
		if (PROP_ZOOM.equals(propURI))
			return OrderingRestriction.newOrderingRestriction(new Float(1),
					new Float(0), true, true, Restriction
							.getAllValuesRestrictionWithCardinality(propURI,
									TypeMapper.getDatatypeURI(Float.class),
									1, 0));
		if (PROP_VIDEO_COMPRESSION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					VideoCompression.MY_URI, 1, 0);
		if (PROP_BACKLIGHTCOMPENSATION.equals(propURI))
			return OrderingRestriction.newOrderingRestriction(new Float(1),
					new Float(0), true, true, Restriction
							.getAllValuesRestrictionWithCardinality(propURI,
									TypeMapper.getDatatypeURI(Float.class),
									1, 0));
		if (PROP_BRIGHTNESS.equals(propURI))
			return OrderingRestriction.newOrderingRestriction(new Float(1),
					new Float(0), true, true, Restriction
							.getAllValuesRestrictionWithCardinality(propURI,
									TypeMapper.getDatatypeURI(Float.class),
									1, 0));
		if (PROP_COLORENABLE.equals(propURI))
			return OrderingRestriction.newOrderingRestriction(new Float(1),
					new Float(0), true, true, Restriction
							.getAllValuesRestrictionWithCardinality(propURI,
									TypeMapper.getDatatypeURI(Float.class),
									1, 0));
		
		//TODO: implementation for the other props
		
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}

	public static String[] getStandardPropertyURIs() {
		String[] inherited = Device.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length + 28];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i++] = PROP_BACKLIGHTCOMPENSATION;
		toReturn[i++] = PROP_BRIGHTNESS;
		toReturn[i++] = PROP_COLORENABLE;
		toReturn[i++] = PROP_CONTRAST;
		toReturn[i++] = PROP_EXPOSURE;
		toReturn[i++] = PROP_FOCUS;
		toReturn[i++] = PROP_GAIN;
		toReturn[i++] = PROP_GAMMA;
		toReturn[i++] = PROP_HUE;
		toReturn[i++] = PROP_IRIS;
		toReturn[i++] = PROP_PAN;
		toReturn[i++] = PROP_ROLL;
		toReturn[i++] = PROP_SATURATION;
		toReturn[i++] = PROP_SHARPNESS;
		toReturn[i++] = PROP_TILT;
		toReturn[i++] = PROP_WHITEBALANCE;
		toReturn[i++] = PROP_VIDEO_COMPRESSION;
		toReturn[i++] = PROP_FRAMES_PER_SECOND;
		toReturn[i++] = PROP_PIXEL_SIZE_IN_MICRON_SQUARE;
		toReturn[i++] = PROP_DPI;
		toReturn[i++] = PROP_FOCUS_POINT;
		toReturn[i++] = PROP_X_RESOLUTION;
		toReturn[i++] = PROP_Y_RESOLUTION;
		toReturn[i++] = PROP_Z_RESOLUTION;
		toReturn[i++] = PROP_ZOOM;
		toReturn[i++] = PROP_FOCAL_DISTANCE;
		toReturn[i++] = PROP_FIELD_OF_VIEW_HORIZONTAL;
		toReturn[i] = PROP_FIELD_OF_VIEW_VERTICAL;
		return toReturn;
	}

	public static String getRDFSComment() {
		return "The class of all VideoCameras.";
	}

	public static String getRDFSLabel() {
		return "VideoCamera";
	}

	/**
	 * the default constructor
	 */
	public VideoCamera() {
		super();
	}

	/**
	 *
	 */
	public VideoCamera(String uri) {
		super((uri == null  ||  uri.lastIndexOf('#') > 0)? uri
				: Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX + uri);
	}

	/**
	 * numProps is a dummy parameter
	 * this constructor is needed for constructing video cameras with an unique URI
	 */
	public VideoCamera(int numProps) {
		super(Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX + "camera", 8);
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

	public boolean isWellFormed() {
		return true;
	}

}

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
package org.universAAL.ontology.av;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.FloatRestriction;
import org.universAAL.middleware.owl.IntRestriction;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.AVFactory;
import org.universAAL.ontology.av.device.LoudSpeaker;
import org.universAAL.ontology.av.device.Microphone;
import org.universAAL.ontology.av.device.VideoCamera;
import org.universAAL.ontology.av.service.CameraService;
import org.universAAL.ontology.av.service.LoudSpeakerService;
import org.universAAL.ontology.av.service.MicrophoneService;
import org.universAAL.ontology.av.streaming.AudioCompression;
import org.universAAL.ontology.av.streaming.AudioFile;
import org.universAAL.ontology.av.streaming.AudioFormat;
import org.universAAL.ontology.av.streaming.AudioStream;
import org.universAAL.ontology.av.streaming.Compression;
import org.universAAL.ontology.av.streaming.EndPoint;
import org.universAAL.ontology.av.streaming.Format;
import org.universAAL.ontology.av.streaming.Stream;
import org.universAAL.ontology.av.streaming.VideoCompression;
import org.universAAL.ontology.av.streaming.VideoFormat;
import org.universAAL.ontology.av.streaming.VideoStream;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.position.Point;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.PhysicalThing;

/**
 * 
 * @author Carsten Stockloew
 */
public class AVOntology extends Ontology {

	private static AVFactory factory = new AVFactory();

	public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX + "av.owl#";

	public AVOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("The upper ontology defining the most general concepts from the audio and video world.");
		r.setResourceLabel("Audio-Video");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(PhThingOntology.NAMESPACE);

		OntClassInfoSetup oci;

		// -----------------------------------
		// streaming

		// load Compression
		oci = createNewAbstractOntClassInfo(Compression.MY_URI);
		oci.setResourceComment("The abstract class of compressions.");
		oci.setResourceLabel("Compression");
		oci.addSuperClass(ManagedIndividual.MY_URI);

		// load AudioCompression
		oci = createNewAbstractOntClassInfo(AudioCompression.MY_URI);
		oci.setResourceComment("The type of audio compressions.");
		oci.setResourceLabel("Audio Compression");
		oci.addSuperClass(Compression.MY_URI);
		oci.toEnumeration(new ManagedIndividual[] { AudioCompression.pcm, AudioCompression.mpeg1AudioLayer3,
				AudioCompression.oggVorbis });

		// load VideoCompression
		oci = createNewAbstractOntClassInfo(VideoCompression.MY_URI);
		oci.setResourceComment("The type of video compressions.");
		oci.setResourceLabel("Video Compression");
		oci.addSuperClass(Compression.MY_URI);
		oci.toEnumeration(new ManagedIndividual[] { VideoCompression.rgb, VideoCompression.bgr, VideoCompression.yuv,
				VideoCompression.jpeg, VideoCompression.mpeg1 });

		// load Format
		oci = createNewAbstractOntClassInfo(Format.MY_URI);
		oci.setResourceComment("The class of all Formats.");
		oci.setResourceLabel("Format");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addObjectProperty(Format.PROP_ENCODING).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Format.PROP_ENCODING,
				Compression.MY_URI, 1, 1));

		// load AudioFormat
		oci = createNewOntClassInfo(AudioFormat.MY_URI, factory, 2);
		oci.setResourceComment("The class of all AudioFormats.");
		oci.setResourceLabel("Audio Format");
		oci.addSuperClass(Format.MY_URI);
		// TODO: better restrictions, perhaps definition of permitted sets
		oci.addObjectProperty(AudioFormat.PROP_ENCODING).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFormat.PROP_ENCODING,
				AudioCompression.MY_URI, 1, 1));
		oci.addDatatypeProperty(AudioFormat.PROP_CHANNELS);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFormat.PROP_CHANNELS,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(AudioFormat.PROP_SAMPLES_PER_SECOND).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFormat.PROP_SAMPLES_PER_SECOND,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(AudioFormat.PROP_BITS_PER_SAMPLE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFormat.PROP_BITS_PER_SAMPLE,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(AudioFormat.PROP_BIG_ENDIAN).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFormat.PROP_BIG_ENDIAN,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
		oci.addDatatypeProperty(AudioFormat.PROP_SIGNED).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFormat.PROP_SIGNED,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));

		// load VideoFormat
		oci = createNewOntClassInfo(VideoFormat.MY_URI, factory, 3);
		oci.setResourceComment("The class of all VideoFormats.");
		oci.setResourceLabel("Video Format");
		oci.addSuperClass(Format.MY_URI);
		oci.addObjectProperty(VideoFormat.PROP_ENCODING).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoFormat.PROP_ENCODING,
				VideoCompression.MY_URI, 1, 1));
		oci.addDatatypeProperty(VideoFormat.PROP_FRAMES_PER_SECOND).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoFormat.PROP_FRAMES_PER_SECOND,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(VideoFormat.PROP_HEIGHT).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoFormat.PROP_HEIGHT,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(VideoFormat.PROP_WIDTH).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoFormat.PROP_WIDTH,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(VideoFormat.PROP_BITS_PER_PIXEL).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoFormat.PROP_BITS_PER_PIXEL,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));

		// load EndPoint
		oci = createNewOntClassInfo(EndPoint.MY_URI, factory, 4);
		oci.setResourceComment("The class of EndPoints.");
		oci.setResourceLabel("EndPoint");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(EndPoint.PROP_IP).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(EndPoint.PROP_IP,
				TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addDatatypeProperty(EndPoint.PROP_TCP_PORT).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(EndPoint.PROP_TCP_PORT,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));

		// load AudioFile
		oci = createNewOntClassInfo(AudioFile.MY_URI, factory, 5);
		oci.setResourceComment("The class of AudioFiles.");
		oci.setResourceLabel("AudioFile");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addObjectProperty(AudioFile.PROP_HAS_FORMAT).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFile.PROP_HAS_FORMAT,
				AudioFormat.MY_URI, 1, 1));
		oci.addDatatypeProperty(AudioFile.PROP_HAS_URL).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFile.PROP_HAS_URL,
				TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addDatatypeProperty(AudioFile.PROP_HAS_CONTENT_TYPE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AudioFile.PROP_HAS_CONTENT_TYPE,
				TypeMapper.getDatatypeURI(String.class), 1, 1));

		// load Stream
		oci = createNewAbstractOntClassInfo(Stream.MY_URI);
		oci.setResourceComment("The type of Streams.");
		oci.setResourceLabel("Stream");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addObjectProperty(Stream.PROP_HAS_FORMAT).setFunctional();
		oci.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(Stream.PROP_HAS_FORMAT, Format.MY_URI, 1, 1));
		oci.addObjectProperty(Stream.PROP_HAS_ENDPOINT).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Stream.PROP_HAS_ENDPOINT,
				EndPoint.MY_URI, 1, 1));

		// load AudioStream
		oci = createNewOntClassInfo(AudioStream.MY_URI, factory, 6);
		oci.setResourceComment("The class of AudioStreams.");
		oci.setResourceLabel("AudioStream");
		oci.addSuperClass(Stream.MY_URI);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Stream.PROP_HAS_FORMAT,
				AudioFormat.MY_URI, 1, 1));

		// load VideoStream
		oci = createNewOntClassInfo(VideoStream.MY_URI, factory, 7);
		oci.setResourceComment("The class of VideoStreams.");
		oci.setResourceLabel("VideoStream");
		oci.addSuperClass(Stream.MY_URI);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Stream.PROP_HAS_FORMAT,
				VideoFormat.MY_URI, 1, 1));

		// -----------------------------------
		// device

		// load LoudSpeaker
		oci = createNewOntClassInfo(LoudSpeaker.MY_URI, factory, 0);
		oci.setResourceComment("The class of all LoudSpeakers.");
		oci.setResourceLabel("LoudSpeaker");
		oci.addSuperClass(Device.MY_URI);
		oci.addDatatypeProperty(LoudSpeaker.PROP_VOLUME).setFunctional();
		oci.addDatatypeProperty(LoudSpeaker.PROP_EFFECTIVE_POWER_IN_WATT);
		oci.addDatatypeProperty(LoudSpeaker.PROP_BANDWIDTH_IN_HZ);
		oci.addDatatypeProperty(LoudSpeaker.PROP_IS_MUSIC_COMPATIBLE).setFunctional();
		oci.addDatatypeProperty(LoudSpeaker.PROP_UPPER_BOUND);
		oci.addDatatypeProperty(LoudSpeaker.PROP_IS_MUTED).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(LoudSpeaker.PROP_VOLUME,
				new IntRestriction(new Integer(0), true, new Integer(100), true), 1, 1));
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				LoudSpeaker.PROP_EFFECTIVE_POWER_IN_WATT, TypeMapper.getDatatypeURI(Double.class), 0, 1));
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(LoudSpeaker.PROP_BANDWIDTH_IN_HZ,
				TypeMapper.getDatatypeURI(Double.class), 0, 1));
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				LoudSpeaker.PROP_IS_MUSIC_COMPATIBLE, TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(LoudSpeaker.PROP_UPPER_BOUND,
				TypeMapper.getDatatypeURI(Double.class), 0, 1));
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(LoudSpeaker.PROP_IS_MUTED,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));

		// load Microphone
		oci = createNewOntClassInfo(Microphone.MY_URI, factory, 1);
		oci.setResourceComment("The class of all Microphones.");
		oci.setResourceLabel("Microphone");
		oci.addSuperClass(Device.MY_URI);
		oci.addDatatypeProperty(Microphone.PROP_VOLUME).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_VOLUME,
				new IntRestriction(new Integer(0), true, new Integer(100), true), 1, 1));
		oci.addDatatypeProperty(Microphone.PROP_AMPLIFICATION);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_AMPLIFICATION,
				new IntRestriction(new Integer(0), true, new Integer(100), true), 0, 1));
		oci.addDatatypeProperty(Microphone.PROP_BANDWIDTH_IN_HZ).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_BANDWIDTH_IN_HZ,
				TypeMapper.getDatatypeURI(Double.class), 1, 1));
		oci.addDatatypeProperty(Microphone.PROP_SAMPLINGRATE_IN_HZ).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_SAMPLINGRATE_IN_HZ,
				TypeMapper.getDatatypeURI(Double.class), 1, 1));
		oci.addObjectProperty(Microphone.PROP_AUDIO_COMPRESSION);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_AUDIO_COMPRESSION,
				AudioCompression.MY_URI, 0, 1));
		oci.addObjectProperty(Microphone.PROP_POINTS_TO);
		// TODO: decision needed, which object has to define the direction of a
		// microphone
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_POINTS_TO,
				Location.MY_URI, 0, 1));
		oci.addDatatypeProperty(Microphone.PROP_ACTIVITY).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_ACTIVITY,
				TypeMapper.getDatatypeURI(Double.class), 1, 1));
		oci.addDatatypeProperty(Microphone.PROP_SILENCE_LEVEL).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_SILENCE_LEVEL,
				TypeMapper.getDatatypeURI(Double.class), 1, 1));
		oci.addDatatypeProperty(Microphone.PROP_USE_ECHO_SUPRESSION).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_USE_ECHO_SUPRESSION,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
		oci.addDatatypeProperty(Microphone.PROP_IS_MUTED).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Microphone.PROP_IS_MUTED,
				TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
		// oci.addObjectProperty(PhysicalThing.PROP_PHYSICAL_LOCATION);
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_PHYSICAL_LOCATION, Point.MY_URI, 0, 1));

		// load VideoCamera
		oci = createNewOntClassInfo(VideoCamera.MY_URI, factory, 8);
		oci.setResourceComment("The class of all VideoCameras.");
		oci.setResourceLabel("VideoCamera");
		oci.addSuperClass(Device.MY_URI);
		oci.addDatatypeProperty(VideoCamera.PROP_DPI);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_DPI,
				TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_FRAMES_PER_SECOND);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_FRAMES_PER_SECOND,
				TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_PIXEL_SIZE_IN_MICRON_SQUARE);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				VideoCamera.PROP_PIXEL_SIZE_IN_MICRON_SQUARE, TypeMapper.getDatatypeURI(Double.class), 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_X_RESOLUTION);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_X_RESOLUTION,
				TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_Y_RESOLUTION);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_Y_RESOLUTION,
				TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_Z_RESOLUTION);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_Z_RESOLUTION,
				TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci.addObjectProperty(PhysicalThing.PROP_PHYSICAL_LOCATION);
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(PhysicalThing.PROP_PHYSICAL_LOCATION, Point.MY_URI, 0, 1));
		oci.addObjectProperty(VideoCamera.PROP_FOCUS_POINT);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_FOCUS_POINT,
				Point.MY_URI, 0, 1));
		// TODO: think about definition of properties offered by
		// persona.streaming
		oci.addObjectProperty(VideoCamera.PROP_VIDEO_COMPRESSION);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_VIDEO_COMPRESSION,
				VideoCompression.MY_URI, 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_ZOOM);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_ZOOM,
				new FloatRestriction(new Float(0), true, new Float(1), true), 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_BACKLIGHTCOMPENSATION);
		oci.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_BACKLIGHTCOMPENSATION,
						new FloatRestriction(new Float(0), true, new Float(1), true), 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_BRIGHTNESS);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_BRIGHTNESS,
				new FloatRestriction(new Float(0), true, new Float(1), true), 0, 1));
		oci.addDatatypeProperty(VideoCamera.PROP_COLORENABLE);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(VideoCamera.PROP_COLORENABLE,
				new FloatRestriction(new Float(0), true, new Float(1), true), 0, 1));
		// TODO: implementation for the other props

		// -----------------------------------
		// service

		// load CameraService
		oci = createNewOntClassInfo(CameraService.MY_URI, factory, 9);
		oci.setResourceComment("The class of services controling cameras.");
		oci.setResourceLabel("CameraService");
		oci.addSuperClass(Service.MY_URI);
		oci.addObjectProperty(CameraService.PROP_CONTROLS);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(CameraService.PROP_CONTROLS, VideoCamera.MY_URI));
		oci.addObjectProperty(CameraService.PROP_DELIVERS);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(CameraService.PROP_DELIVERS, VideoStream.MY_URI));

		// load LoudSpeakerService
		oci = createNewOntClassInfo(LoudSpeakerService.MY_URI, factory, 10);
		oci.setResourceComment("The class of services controling LoudSpeakers.");
		oci.setResourceLabel("LoudSpeakerService");
		oci.addSuperClass(Service.MY_URI);
		oci.addObjectProperty(LoudSpeakerService.PROP_CONTROLS);
		oci.addRestriction(
				MergedRestriction.getAllValuesRestriction(LoudSpeakerService.PROP_CONTROLS, LoudSpeaker.MY_URI));
		oci.addObjectProperty(LoudSpeakerService.PROP_HAS_TO_BROADCAST_AUDIO_FILE);
		oci.addRestriction(MergedRestriction
				.getAllValuesRestriction(LoudSpeakerService.PROP_HAS_TO_BROADCAST_AUDIO_FILE, AudioFile.MY_URI));
		oci.addObjectProperty(LoudSpeakerService.PROP_HAS_TO_BROADCAST_AUDIO_STREAM);
		oci.addRestriction(MergedRestriction
				.getAllValuesRestriction(LoudSpeakerService.PROP_HAS_TO_BROADCAST_AUDIO_STREAM, AudioStream.MY_URI));

		// load MicrophoneService
		oci = createNewOntClassInfo(MicrophoneService.MY_URI, factory, 11);
		oci.setResourceComment("The class of services controling microphones.");
		oci.setResourceLabel("MicrophoneService");
		oci.addSuperClass(Service.MY_URI);
		oci.addObjectProperty(MicrophoneService.PROP_CONTROLS);
		oci.addRestriction(
				MergedRestriction.getAllValuesRestriction(MicrophoneService.PROP_CONTROLS, Microphone.MY_URI));
		oci.addObjectProperty(MicrophoneService.PROP_DELIVERS);
		oci.addRestriction(
				MergedRestriction.getAllValuesRestriction(MicrophoneService.PROP_DELIVERS, AudioStream.MY_URI));

	}
}
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
package org.universAAL.ontology.location.indoor;

import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.shape.Shape;

/**
 * Ontological representation of a room in a house. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 */
public class Room extends HomeArea {

    public static final String MY_URI = LocationOntology.NAMESPACE + "Room";
    public static final String PROP_ROOM_FUNCTION = LocationOntology.NAMESPACE + "roomFunction";

    /**
     * Creates a Room object
     * 
     * @param uri
     *            the object URI
     */
    public Room(String uri) {
	super(uri);
    }

    /**
     * Creates a Room object
     */
    public Room() {
	super();
    }

    /**
     * Creates a StairWay object
     * 
     * @param uri
     *            this value can also be a null object
     * @param func
     *            the function of the room.
     */
    public Room(String uri, RoomFunction func) {
	super(uri);
	props.put(PROP_ROOM_FUNCTION, func);
    }

    public Room(RoomFunction func) {
	super();
	props.put(PROP_ROOM_FUNCTION, func);
    }

    public Room(String uri, String name, RoomFunction func, Shape shape) {
	super(uri, name, shape);
	props.put(PROP_ROOM_FUNCTION, func);
    }

    public Room(String uri, RoomFunction func, Shape shape) {
	super(uri, shape);
	props.put(PROP_ROOM_FUNCTION, func);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public RoomFunction getRoomFunction() {
	return (RoomFunction) props.get(PROP_ROOM_FUNCTION);
    }

    public void setRoomFunction(RoomFunction function) {
	if (function == null)
	    throw new IllegalArgumentException();
	props.put(PROP_ROOM_FUNCTION, function);
    }

    public void clearRoomFunction() {
	props.remove(PROP_ROOM_FUNCTION);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_ROOM_FUNCTION.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }
}

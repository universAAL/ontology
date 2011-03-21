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
package org.universAAL.ontology.location.indoor;

import org.universAAL.middleware.owl.Restriction;

import org.universAAL.ontology.shape.Shape;

public class Room extends HomeArea {

    public static final String MY_URI;
    public static final String PROP_ROOM_FUNCTION;

    static {
	MY_URI = uAAL_LOCATION_NAMESPACE + "Room";
	PROP_ROOM_FUNCTION = uAAL_LOCATION_NAMESPACE + "roomFunction";
	register(Room.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_ROOM_FUNCTION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    RoomFunction.MY_URI, 1, 0);
	return HomeArea.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = HomeArea.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_ROOM_FUNCTION;
	return toReturn;
    }

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

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "A room with a specialized function.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "Room";
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
	props.put(PROP_ROOM_FUNCTION, null);
    }

    public int getPropSerializationType(String propURI) {
	if (super.getPropSerializationType(propURI) != PROP_SERIALIZATION_OPTIONAL)
	    return super.getPropSerializationType(propURI);
	if (PROP_ROOM_FUNCTION.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }
}

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

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OntClassInfo;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.location.LocationOntology;

/**
 * Ontological enumeration of possible functions of a room in a house. Methods
 * included in this class are the mandatory ones for representing an ontological
 * enumeration in Java classes for uAAL.
 * 
 */
public class RoomFunction extends ManagedIndividual {

    public static final String MY_URI = LocationOntology.NAMESPACE
	    + "RoomFunction";

    public static final int BATHROOM = 0;
    public static final int CELLAR = 1;
    public static final int GUESTROOM = 2;
    public static final int GUESTWC = 3;
    public static final int HOBBYROOM = 4;
    public static final int KITCHEN = 5;
    public static final int LIVINGROOM = 6;
    public static final int SLEEPINGROOM = 7;
    public static final int STORAGEROOM = 8;
    public static final int STUDIO = 9;
    public static final int WORKROOM = 10;
    public static final int WARDROBE = 11;

    private int order;

    private static final String[] names = { "BathRoom", "Cellar", "GuestRoom",
	    "GuestWC", "HobbyRoom", "Kitchen", "LivingRoom", "SleepingRoom",
	    "StorageRoom", "Studio", "WorkRoom", "Wardrobe" };

    public static final RoomFunction BathRoom = new RoomFunction(BATHROOM);
    public static final RoomFunction Cellar = new RoomFunction(CELLAR);
    public static final RoomFunction GuestRoom = new RoomFunction(GUESTROOM);
    public static final RoomFunction GuestWC = new RoomFunction(GUESTWC);
    public static final RoomFunction HobbyRoom = new RoomFunction(HOBBYROOM);
    public static final RoomFunction Kitchen = new RoomFunction(KITCHEN);
    public static final RoomFunction LivingRoom = new RoomFunction(LIVINGROOM);
    public static final RoomFunction SleepingRoom = new RoomFunction(
	    SLEEPINGROOM);
    public static final RoomFunction StorageRoom = new RoomFunction(STORAGEROOM);
    public static final RoomFunction Studio = new RoomFunction(STUDIO);
    public static final RoomFunction WorkRoom = new RoomFunction(WORKROOM);
    public static final RoomFunction Wardrobe = new RoomFunction(WARDROBE);

    public static final RoomFunction valueOf(String name) {
	for (int i = 0; i <= 10; i++)
	    if (names[i].equals(name)){
//		return getLevelByOrder(i);
		// getLevelByOrder can NPE if getInstances is still null
		return getRoomFunctionByOrder(i);
	    }
	return null;
    }

    public static RoomFunction getLevelByOrder(int order) {
	OntClassInfo info = OntologyManagement.getInstance().getOntClassInfo(
		MY_URI);
	return info == null ? null : (RoomFunction) info.getInstances()[order];
    }
    
    public static RoomFunction getRoomFunctionByOrder(int order){
	switch (order) {
	case BATHROOM:
	    return BathRoom;
	case CELLAR:
	    return Cellar;
	case GUESTROOM:
	    return GuestRoom;
	case GUESTWC:
	    return GuestWC;
	case HOBBYROOM:
	    return HobbyRoom;
	case KITCHEN:
	    return Kitchen;
	case LIVINGROOM:
	    return LivingRoom;
	case SLEEPINGROOM:
	    return SleepingRoom;
	case STORAGEROOM:
	    return StorageRoom;
	case STUDIO:
	    return Studio;
	case WORKROOM:
	    return WorkRoom;
	case WARDROBE:
	    return Wardrobe;
	default:
	    return null;
	}
    }

    /**
     * Creates a RoomFunction object
     */
    public RoomFunction() {
	super();
    }

    /**
     * Creates a RoomFunction object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The function number. A null object is not allowed
     */
    public RoomFunction(int function) {
	super(LocationOntology.NAMESPACE + names[function]);
	this.order = function;
    }

    public String getClassURI() {
	return MY_URI;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_OPTIONAL;
    }
}

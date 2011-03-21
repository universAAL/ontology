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

import org.universAAL.middleware.owl.ManagedIndividual;

import org.universAAL.ontology.location.Location;

public class RoomFunction extends ManagedIndividual {

    public static final String MY_URI;

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

    static {
	MY_URI = Location.uAAL_LOCATION_NAMESPACE + "RoomFunction";
	register(RoomFunction.class);
    }

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

    /**
     * Returns the list of all class members guaranteeing that no other members
     * will be created after a call to this method.
     */
    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] { BathRoom, Cellar, GuestRoom, GuestWC,
		HobbyRoom, Kitchen, LivingRoom, SleepingRoom, StorageRoom,
		Studio, WorkRoom, Wardrobe };
    }

    /**
     * Returns the modality with the given URI.
     */
    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null && instanceURI
		.startsWith(Location.uAAL_LOCATION_NAMESPACE)) ? valueOf(instanceURI
		.substring(Location.uAAL_LOCATION_NAMESPACE.length()))
		: null;
    }

    public static final RoomFunction valueOf(String name) {
	for (int i = 0; i <= 10; i++)
	    if (names[i].equals(name))
		return getLevelByOrder(i);
	return null;
    }

    public static RoomFunction getLevelByOrder(int order) {
	return (RoomFunction) getEnumerationMembers()[order];
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
    public RoomFunction(int Function) {
	super();
	this.order = Function;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "Describes the function of a room.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "RoomFunction";
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_OPTIONAL;
    }
}

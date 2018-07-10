/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class InstallationLocationValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "InstallationLocationValue";
	
	public static final int LIVING_ROOM = 0;
	public static final int DINNING_ROOM = 1;
	public static final int KITCHEN = 2;
	public static final int BATHROOM = 3;
	public static final int LAVATORY = 4;
	public static final int WASHROOM_CHANGINGROOM = 5;
	public static final int PASSAGEWAY = 6;
	public static final int ROOM = 7;
	public static final int STAIRWAY = 8;
	public static final int FRONT_DOOR = 9;
	public static final int STOREROOM = 10;
	public static final int GARDEN_PERIMETER = 11;
	public static final int GARAGE = 12;
	public static final int VERANDA_BALCONY = 13;
	public static final int OTHERS = 14;
	public static final int FREE_DEFINITION = 15;
	public static final int INSTALLATION_LOCATION_NOT_SPECIFIED = 16;
	public static final int INSTALLATION_LOCATION_INDEFINITE = 17;
	
	
	private static final String[] names = {"livingRoom", "dinningRoom", "kitchen", "bathroom", "lavatory","washroom_ChangingRoom",
										   "passageway", "room", "stairway","frontDoor", "storeroom", "garden_Perimeter", "garare",
										   "veranda_Balcony", "others", "freeDefinition", "installationLocationNotSpecified",
										   "installationLocationIndefinited"};
	
	public static final InstallationLocationValue LivingRoom = new InstallationLocationValue(LIVING_ROOM);
	public static final InstallationLocationValue DinningRoom = new InstallationLocationValue(DINNING_ROOM);
	public static final InstallationLocationValue Kitchen = new InstallationLocationValue(KITCHEN);
	public static final InstallationLocationValue Bathroom = new InstallationLocationValue(BATHROOM);
	public static final InstallationLocationValue Lavatory = new InstallationLocationValue(LAVATORY);
	public static final InstallationLocationValue Washroom_ChangingRoom = new InstallationLocationValue(WASHROOM_CHANGINGROOM);
	public static final InstallationLocationValue Passageway = new InstallationLocationValue(PASSAGEWAY);
	public static final InstallationLocationValue Room = new InstallationLocationValue(ROOM);
	public static final InstallationLocationValue Stairway = new InstallationLocationValue(STAIRWAY);
	public static final InstallationLocationValue FrontDoor = new InstallationLocationValue(FRONT_DOOR);
	public static final InstallationLocationValue Storeroom = new InstallationLocationValue(STOREROOM);
	public static final InstallationLocationValue Garden_Perimeter = new InstallationLocationValue(GARDEN_PERIMETER);
	public static final InstallationLocationValue Garare = new InstallationLocationValue(GARAGE);
	public static final InstallationLocationValue Veranda_Balcony = new InstallationLocationValue(VERANDA_BALCONY);
	public static final InstallationLocationValue Others = new InstallationLocationValue(OTHERS);
	public static final InstallationLocationValue FreeDefinition = new InstallationLocationValue(FREE_DEFINITION);
	public static final InstallationLocationValue InstallationLocationNotSpecified = new InstallationLocationValue(INSTALLATION_LOCATION_NOT_SPECIFIED);
	public static final InstallationLocationValue InstallationLocationIndefinited = new InstallationLocationValue(INSTALLATION_LOCATION_INDEFINITE);
	private int order;

	private InstallationLocationValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static InstallationLocationValue getInstallationLocationValueByOrder(int order) {
		switch (order) {
		case LIVING_ROOM:
			return LivingRoom;
		case DINNING_ROOM:
			return DinningRoom;
		case KITCHEN:
			return Kitchen;
		case BATHROOM:
			return Bathroom;
		case LAVATORY:
			return Lavatory;
		case WASHROOM_CHANGINGROOM:
			return Washroom_ChangingRoom;
		case PASSAGEWAY:
			return Passageway;
		case ROOM:
			return Room;
		case STAIRWAY:
			return Stairway;
		case FRONT_DOOR:
			return FrontDoor;
		case STOREROOM:
			return Storeroom;
		case GARDEN_PERIMETER:
			return Garden_Perimeter;
		case GARAGE:
			return Garare;
		case VERANDA_BALCONY:
			return Veranda_Balcony;
		case OTHERS:
			return Others;			
		case FREE_DEFINITION:
			return FreeDefinition;
		case INSTALLATION_LOCATION_NOT_SPECIFIED:
			return InstallationLocationNotSpecified;
		case INSTALLATION_LOCATION_INDEFINITE:
			return InstallationLocationIndefinited;	
		default:
			return null;
		}
	}

	public static final InstallationLocationValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = LIVING_ROOM; i <= INSTALLATION_LOCATION_INDEFINITE; i++)
			if (names[i].equals(name))
				return getInstallationLocationValueByOrder(i);
		return null;
	}

	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public String getClassURI() {
		return MY_URI;
	}
}

/*
	Copyright 2007-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology.location;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.supply.AbsLocation;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.LocationFactory;
import org.universAAL.ontology.location.address.Address;
import org.universAAL.ontology.location.address.MailBox;
import org.universAAL.ontology.location.address.PhysicalAddress;
import org.universAAL.ontology.location.indoor.BuildingLevel;
import org.universAAL.ontology.location.indoor.Corridor;
import org.universAAL.ontology.location.indoor.EntranceHall;
import org.universAAL.ontology.location.indoor.Hall;
import org.universAAL.ontology.location.indoor.Home;
import org.universAAL.ontology.location.indoor.HomeArea;
import org.universAAL.ontology.location.indoor.IndoorPlace;
import org.universAAL.ontology.location.indoor.Room;
import org.universAAL.ontology.location.indoor.RoomFunction;
import org.universAAL.ontology.location.indoor.StairCase;
import org.universAAL.ontology.location.indoor.StairWay;
import org.universAAL.ontology.location.outdoor.Building;
import org.universAAL.ontology.location.outdoor.City;
import org.universAAL.ontology.location.outdoor.CityPlace;
import org.universAAL.ontology.location.outdoor.CityQuarter;
import org.universAAL.ontology.location.outdoor.CityRegion;
import org.universAAL.ontology.location.outdoor.Country;
import org.universAAL.ontology.location.outdoor.OutdoorPlace;
import org.universAAL.ontology.location.outdoor.Region;
import org.universAAL.ontology.location.outdoor.State;
import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.OriginedMetric;
import org.universAAL.ontology.location.position.Point;
import org.universAAL.ontology.phThing.PhysicalThing;
import org.universAAL.ontology.shape.Path;
import org.universAAL.ontology.shape.Shape;

/**
 *
 * @author Carsten Stockloew
 *
 */
public class LocationOntology extends Ontology {

	public static final String NAMESPACE = "http://ontology.universAAL.org/Location.owl#";

	private static LocationFactory factory = new LocationFactory();

	public LocationOntology() {
		super(NAMESPACE);
		Resource r = getInfo();
		r.setResourceComment("Ontology for locations. "
				+ "It is part of the Physical World upper ontology concept, "
				+ "which defines the most general concepts from the physical "
				+ "world as opposed to the virtual realm.");
		r.setResourceLabel("Location");
	}

	public void create() {

		OntClassInfoSetup oci;

		// -----------------------------------
		// Declaration
		// Some classes are used here that are defined in other ontologies
		// (or are used before they are defined).
		// We need to declare them here to so that the BDRM is able to
		// determine the type of the URI, i.e. this regards the class URIs
		// used in the AllValuesRestrictions.

		oci = extendExistingOntClassInfo(Shape.MY_URI);
		oci = extendExistingOntClassInfo(PhysicalThing.MY_URI);
		oci = extendExistingOntClassInfo(Address.MY_URI);
		oci = extendExistingOntClassInfo(Path.MY_URI);

		// -----------------------------------
		// location

		// load Location
		oci = createNewOntClassInfo(Location.MY_URI, factory, 0);
		oci.setResourceComment("The root class for all locations.");
		oci.setResourceLabel("Location");
		oci.addSuperClass(AbsLocation.MY_URI);
		oci.addDatatypeProperty(Location.PROP_HAS_NAME).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Location.PROP_HAS_NAME,
						TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci.addObjectProperty(Location.PROP_IS_ADJACENT_TO);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Location.PROP_IS_ADJACENT_TO, Location.MY_URI));
		oci.addObjectProperty(Location.PROP_IS_CONNECTED_TO);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Location.PROP_IS_CONNECTED_TO, Location.MY_URI));
		oci.addObjectProperty(Location.PROP_IS_CONTAINED_IN);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Location.PROP_IS_CONTAINED_IN, Location.MY_URI));
		oci.addObjectProperty(Location.PROP_CONTAINS);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Location.PROP_CONTAINS, Location.MY_URI));

		// load Place
		oci = createNewOntClassInfo(Place.MY_URI, factory, 1);
		oci.setResourceComment("The root class for all places.");
		oci.setResourceLabel("Place");
		oci.addSuperClass(Location.MY_URI);
		oci.addObjectProperty(Place.PROP_HAS_SHAPE).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Place.PROP_HAS_SHAPE,
						Shape.MY_URI, 1, 1));
		oci.addObjectProperty(Place.PROP_LOCATION_OF_PHYSICAL_THING)
				.setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Place.PROP_LOCATION_OF_PHYSICAL_THING,
						PhysicalThing.MY_URI, 0, 1));
		oci.addObjectProperty(Place.PROP_HAS_ADDRESS).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Place.PROP_HAS_ADDRESS,
						Address.MY_URI, 0, 1));

		// load Way
		oci = createNewOntClassInfo(Way.MY_URI, factory, 2);
		oci.setResourceComment("A way.");
		oci.setResourceLabel("Way");
		oci.addSuperClass(Place.MY_URI);
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Place.PROP_HAS_SHAPE,
						Path.MY_URI, 0, 1));

		// -----------------------------------
		// outdoor

		// load OutdoorPlace
		oci = createNewOntClassInfo(OutdoorPlace.MY_URI, factory, 15);
		oci.setResourceComment("The root class for all outdoor places.");
		oci.setResourceLabel("OutdoorPlace");
		oci.addSuperClass(Place.MY_URI);

		// load State
		oci = createNewOntClassInfo(State.MY_URI, factory, 16);
		oci.setResourceComment("A state in the meaning of an sovereign area.");
		oci.setResourceLabel("State");
		oci.addSuperClass(OutdoorPlace.MY_URI);

		// load Region
		oci = createNewOntClassInfo(Region.MY_URI, factory, 17);
		oci.setResourceComment("A region.");
		oci.setResourceLabel("Region");
		oci.addSuperClass(OutdoorPlace.MY_URI);

		// load Country
		oci = createNewOntClassInfo(Country.MY_URI, factory, 18);
		oci.setResourceComment("A country.");
		oci.setResourceLabel("Country");
		oci.addSuperClass(OutdoorPlace.MY_URI);

		// load City
		oci = createNewOntClassInfo(City.MY_URI, factory, 19);
		oci.setResourceComment("A city.");
		oci.setResourceLabel("City");
		oci.addSuperClass(OutdoorPlace.MY_URI);

		// load CityPlace
		oci = createNewOntClassInfo(CityPlace.MY_URI, factory, 20);
		oci.setResourceComment("A place in a city.");
		oci.setResourceLabel("CityPlace");
		oci.addSuperClass(OutdoorPlace.MY_URI);

		// load CityQuarter
		oci = createNewOntClassInfo(CityQuarter.MY_URI, factory, 21);
		oci.setResourceComment("A quarter in a city.");
		oci.setResourceLabel("CityQuarter");
		oci.addSuperClass(OutdoorPlace.MY_URI);

		// load Building
		oci = createNewOntClassInfo(Building.MY_URI, factory, 22);
		oci.setResourceComment("The class for all buildings.");
		oci.setResourceLabel("Building");
		oci.addSuperClass(CityPlace.MY_URI);

		// load CityRegion
		oci = createNewOntClassInfo(CityRegion.MY_URI, factory, 23);
		oci.setResourceComment("A class for a city region that can be described by a ZIP code.");
		oci.setResourceLabel("CityRegion");
		oci.addSuperClass(OutdoorPlace.MY_URI);
		oci.addDatatypeProperty(CityRegion.PROP_HAS_ZIP_CODE).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						CityRegion.PROP_HAS_ZIP_CODE,
						TypeMapper.getDatatypeURI(String.class), 0, 1));

		// -----------------------------------
		// address

		// load Address
		oci = createNewOntClassInfo(Address.MY_URI, factory, 3);
		oci.setResourceComment("A basic address for a place or entity");
		oci.setResourceLabel("Address");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addObjectProperty(Address.PROP_HAS_REGION).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Address.PROP_HAS_REGION, Region.MY_URI, 0, 1));
		oci.addObjectProperty(Address.PROP_HAS_COUNTRY).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Address.PROP_HAS_COUNTRY, Country.MY_URI, 0, 1));
		oci.addObjectProperty(Address.PROP_HAS_STATE).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Address.PROP_HAS_STATE,
						State.MY_URI, 0, 1));
		oci.addObjectProperty(Address.PROP_HAS_CITY).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Address.PROP_HAS_CITY,
						City.MY_URI, 0, 1));
		oci.addObjectProperty(Address.PROP_HAS_CITYQUARTER).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Address.PROP_HAS_CITYQUARTER, CityQuarter.MY_URI, 0, 1));
		oci.addObjectProperty(Address.PROP_HAS_CITYREGION).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Address.PROP_HAS_CITYREGION, CityRegion.MY_URI, 0, 1));
		oci.addObjectProperty(Address.PROP_HAS_CITYPLACE).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Address.PROP_HAS_CITYPLACE, CityPlace.MY_URI, 0, 1));
		oci.addDatatypeProperty(Address.PROP_HAS_POSTALCODE).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Address.PROP_HAS_POSTALCODE,
						TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci.addDatatypeProperty(Address.PROP_HAS_EXTENDEDADDRESS)
				.setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Address.PROP_HAS_EXTENDEDADDRESS,
						TypeMapper.getDatatypeURI(String.class), 0, 1));

		// load MailBox
		oci = createNewOntClassInfo(MailBox.MY_URI, factory, 4);
		oci.setResourceComment("A mail box in a post office");
		oci.setResourceLabel("Mail Box");
		oci.addSuperClass(Address.MY_URI);
		oci.addDatatypeProperty(MailBox.PROP_POST_OFFICE_BOX).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						MailBox.PROP_POST_OFFICE_BOX,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

		// load PhysicalAddress
		oci = createNewOntClassInfo(PhysicalAddress.MY_URI, factory, 5);
		oci.setResourceComment("An extended address for a physical place");
		oci.setResourceLabel("Physical Address");
		oci.addSuperClass(Address.MY_URI);
		oci.addDatatypeProperty(PhysicalAddress.PROP_HAS_BUILDING_ID)
				.setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						PhysicalAddress.PROP_HAS_BUILDING_ID,
						TypeMapper.getDatatypeURI(String.class), 0, 1));// Building
		oci.addDatatypeProperty(PhysicalAddress.PROP_HAS_HALL_ID)
				.setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						PhysicalAddress.PROP_HAS_HALL_ID,
						TypeMapper.getDatatypeURI(String.class), 0, 1));// Hall
		oci.addDatatypeProperty(PhysicalAddress.PROP_HAS_FLOOR_ID)
				.setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						PhysicalAddress.PROP_HAS_FLOOR_ID,
						TypeMapper.getDatatypeURI(String.class), 0, 1));// BuildingLevel
		oci.addDatatypeProperty(PhysicalAddress.PROP_HAS_DOOR_ID)
				.setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						PhysicalAddress.PROP_HAS_DOOR_ID,
						TypeMapper.getDatatypeURI(String.class), 0, 1));// Home
		oci.addDatatypeProperty(PhysicalAddress.PROP_HAS_DESK_ID)
				.setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						PhysicalAddress.PROP_HAS_DESK_ID,
						TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci.addDatatypeProperty(PhysicalAddress.PROP_HAS_OFFICE_ID)
				.setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						PhysicalAddress.PROP_HAS_OFFICE_ID,
						TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci.addDatatypeProperty(PhysicalAddress.PROP_HAS_ADDITIONAL_ID)
				.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				PhysicalAddress.PROP_HAS_ADDITIONAL_ID,
				TypeMapper.getDatatypeURI(String.class)));// IndoorPlace
		// if (PROP_HAS_STREET.equals(propURI))
		// return
		// Restriction.getAllValuesRestrictionWithCardinality(propURI,
		// Street.MY_URI, 1, 1);
		// if (PROP_HAS_NUMBER.equals(propURI))
		// return
		// Restriction.getAllValuesRestrictionWithCardinality(propURI,
		// TypeMapper.getDatatypeURI(Integer.class), 1, 0);

		// -----------------------------------
		// indoor

		// load IndoorPlace
		oci = createNewAbstractOntClassInfo(IndoorPlace.MY_URI);
		oci.setResourceComment("The root class for all indoor places.");
		oci.setResourceLabel("IndoorPlace");
		oci.addSuperClass(Place.MY_URI);

		// load BuildingLevel
		oci = createNewOntClassInfo(BuildingLevel.MY_URI, factory, 6);
		oci.setResourceComment("A level of a building.");
		oci.setResourceLabel("BuildingLevel");
		oci.addSuperClass(IndoorPlace.MY_URI);

		// load HomeArea
		oci = createNewOntClassInfo(HomeArea.MY_URI, factory, 7);
		oci.setResourceComment("An indoor place.");
		oci.setResourceLabel("HomeArea");
		oci.addSuperClass(IndoorPlace.MY_URI);

		// load Home
		oci = createNewOntClassInfo(Home.MY_URI, factory, 8);
		oci.setResourceComment("A home of some sorts.");
		oci.setResourceLabel("Home");
		oci.addSuperClass(IndoorPlace.MY_URI);

		// load Corridor
		oci = createNewOntClassInfo(Corridor.MY_URI, factory, 9);
		oci.setResourceComment("A corridor.");
		oci.setResourceLabel("Corridor");
		oci.addSuperClass(HomeArea.MY_URI);

		// load EntranceHall
		oci = createNewOntClassInfo(EntranceHall.MY_URI, factory, 10);
		oci.setResourceComment("The entrance hall of a building.");
		oci.setResourceLabel("EntranceHall");
		oci.addSuperClass(HomeArea.MY_URI);

		// load Hall
		oci = createNewOntClassInfo(Hall.MY_URI, factory, 11);
		oci.setResourceComment("Any hall, except an entrance hall.");
		oci.setResourceLabel("Hall");
		oci.addSuperClass(HomeArea.MY_URI);

		// load StairCase
		oci = createNewOntClassInfo(StairCase.MY_URI, factory, 12);
		oci.setResourceComment("Contains the StairWays.");
		oci.setResourceLabel("StairCase");
		oci.addSuperClass(IndoorPlace.MY_URI);

		// load RoomFunction
		oci = createNewAbstractOntClassInfo(RoomFunction.MY_URI);
		oci.setResourceComment("Describes the function of a room.");
		oci.setResourceLabel("RoomFunction");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.toEnumeration(new ManagedIndividual[] { RoomFunction.BathRoom,
				RoomFunction.Cellar, RoomFunction.GuestRoom,
				RoomFunction.GuestWC, RoomFunction.HobbyRoom,
				RoomFunction.Kitchen, RoomFunction.LivingRoom,
				RoomFunction.SleepingRoom, RoomFunction.StorageRoom,
				RoomFunction.Studio, RoomFunction.WorkRoom,
				RoomFunction.Wardrobe });

		// load Room
		oci = createNewOntClassInfo(Room.MY_URI, factory, 13);
		oci.setResourceComment("A room with a specialized function.");
		oci.setResourceLabel("Room");
		oci.addSuperClass(HomeArea.MY_URI);
		oci.addObjectProperty(Room.PROP_ROOM_FUNCTION).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Room.PROP_ROOM_FUNCTION, RoomFunction.MY_URI, 0, 1));

		// load StairWay
		oci = createNewOntClassInfo(StairWay.MY_URI, factory, 14);
		oci.setResourceComment("Connects to BuildingLevels.");
		oci.setResourceLabel("StairWay");
		oci.addSuperClass(IndoorPlace.MY_URI);
		oci.addObjectProperty(StairWay.PROP_TO_LEVEL).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(StairWay.PROP_TO_LEVEL,
						BuildingLevel.MY_URI, 1, 1));
		oci.addObjectProperty(StairWay.PROP_FROM_LEVEL).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						StairWay.PROP_FROM_LEVEL, BuildingLevel.MY_URI, 1, 1));

		// -----------------------------------
		// position

		// load CoordinateSystem
		oci = createNewOntClassInfo(CoordinateSystem.MY_URI, factory, 24);
		oci.setResourceComment("Rootclass for all coordinate systems.");
		oci.setResourceLabel("CoordinateSystem");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addInstance(CoordinateSystem.WGS84);

		// load Point
		oci = createNewOntClassInfo(Point.MY_URI, factory, 26);
		oci.setResourceComment("The class of all points");
		oci.setResourceLabel("Point");
		oci.addSuperClass(Location.MY_URI);
		oci.addObjectProperty(Point.PROP_COORDINATE_SYSTEM).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Point.PROP_COORDINATE_SYSTEM, CoordinateSystem.MY_URI,
						1, 1));
		oci.addDatatypeProperty(Point.PROP_X).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Point.PROP_X,
						TypeMapper.getDatatypeURI(Double.class), 1, 1));
		oci.addDatatypeProperty(Point.PROP_Y).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Point.PROP_Y,
						TypeMapper.getDatatypeURI(Double.class), 1, 1));
		oci.addDatatypeProperty(Point.PROP_Z).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Point.PROP_Z,
						TypeMapper.getDatatypeURI(Double.class), 0, 1));

		// load OriginedMetric
		oci = createNewOntClassInfo(OriginedMetric.MY_URI, factory, 25);
		oci.setResourceComment("A coordinate system with an origin point.");
		oci.setResourceLabel("OriginedMetric");
		oci.addSuperClass(CoordinateSystem.MY_URI);
		oci.addObjectProperty(OriginedMetric.PROP_ORIGIN).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						OriginedMetric.PROP_ORIGIN, Point.MY_URI, 1, 1));
		oci.addDatatypeProperty(OriginedMetric.PROP_ROTATE_X).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						OriginedMetric.PROP_ROTATE_X,
						TypeMapper.getDatatypeURI(Float.class), 0, 1));
		oci.addDatatypeProperty(OriginedMetric.PROP_ROTATE_Y).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						OriginedMetric.PROP_ROTATE_Y,
						TypeMapper.getDatatypeURI(Float.class), 0, 1));
		oci.addDatatypeProperty(OriginedMetric.PROP_ROTATE_Z).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						OriginedMetric.PROP_ROTATE_Z,
						TypeMapper.getDatatypeURI(Float.class), 0, 1));
	}
}

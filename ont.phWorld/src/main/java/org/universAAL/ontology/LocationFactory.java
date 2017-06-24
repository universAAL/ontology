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
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.Place;
import org.universAAL.ontology.location.Way;
import org.universAAL.ontology.location.address.Address;
import org.universAAL.ontology.location.address.MailBox;
import org.universAAL.ontology.location.address.PhysicalAddress;
import org.universAAL.ontology.location.indoor.BuildingLevel;
import org.universAAL.ontology.location.indoor.Corridor;
import org.universAAL.ontology.location.indoor.EntranceHall;
import org.universAAL.ontology.location.indoor.Hall;
import org.universAAL.ontology.location.indoor.Home;
import org.universAAL.ontology.location.indoor.HomeArea;
import org.universAAL.ontology.location.indoor.Room;
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

public class LocationFactory implements ResourceFactory {

	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

		switch (factoryIndex) {
		case 0:
			return new Location(instanceURI);
		case 1:
			return new Place(instanceURI);
		case 2:
			return new Way(instanceURI);
		case 3:
			return new Address(instanceURI);
		case 4:
			return new MailBox(instanceURI);
		case 5:
			return new PhysicalAddress(instanceURI);
		case 6:
			return new BuildingLevel(instanceURI);
		case 7:
			return new HomeArea(instanceURI);
		case 8:
			return new Home(instanceURI);
		case 9:
			return new Corridor(instanceURI);
		case 10:
			return new EntranceHall(instanceURI);
		case 11:
			return new Hall(instanceURI);
		case 12:
			return new StairCase(instanceURI);
		case 13:
			return new Room(instanceURI);
		case 14:
			return new StairWay(instanceURI);
		case 15:
			return new OutdoorPlace(instanceURI);
		case 16:
			return new State(instanceURI);
		case 17:
			return new Region(instanceURI);
		case 18:
			return new Country(instanceURI);
		case 19:
			return new City(instanceURI);
		case 20:
			return new CityPlace(instanceURI);
		case 21:
			return new CityQuarter(instanceURI);
		case 22:
			return new Building(instanceURI);
		case 23:
			return new CityRegion(instanceURI);
		case 24:
			return new CoordinateSystem(instanceURI);
		case 25:
			return new OriginedMetric(instanceURI);
		case 26:
			return new Point(instanceURI);
		}

		return null;
	}
}

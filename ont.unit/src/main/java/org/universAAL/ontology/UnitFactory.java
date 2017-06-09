/*******************************************************************************
 * Copyright 2012 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.unit.DividedUnit;
import org.universAAL.ontology.unit.MultipliedUnit;
import org.universAAL.ontology.unit.Prefix;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitSystem;
import org.universAAL.ontology.unit.services.UnitConversionService;
import org.universAAL.ontology.unit.services.UnitService;

public class UnitFactory implements ResourceFactory {

	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {
		switch (factoryIndex) {
		case 1:
			return new Unit(instanceURI);
		case 2:
			return new UnitSystem(instanceURI);
		case 3:
			return new Prefix(instanceURI);
		case 4:
			return new MultipliedUnit(instanceURI);
		case 5:
			return new DividedUnit(instanceURI);
		case 6:
			return new UnitService(instanceURI);
		case 7:
			return new UnitConversionService(instanceURI);
		}
		return null;
	}

}

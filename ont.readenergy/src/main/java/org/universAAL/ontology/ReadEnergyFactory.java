/*
	Copyright 2011-2012 TSB, http://www.tsbtecnologias.es
	TSB - Tecnologías para la Salud y el Bienestar
	
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
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.energy.reader.*;

public class ReadEnergyFactory extends ResourceFactoryImpl{
	
	public static final int EnergyReader = 0;
	public static final int EnergyReaderDevice = 1;
	public static final int EnergyReaderMeassurement = 2;

	public Resource createInstance(String classURI, String instanceURI,
			int factoryIndex) {
		switch (factoryIndex) {
		case EnergyReader:
			return new ReadEnergy(instanceURI);
		case EnergyReaderDevice:
			return new ReadEnergyDevice(instanceURI);
		case EnergyReaderMeassurement:
			return new EnergyMeasurement(instanceURI);

		}
		return null;
	}
}

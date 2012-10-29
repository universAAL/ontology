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
import org.universAAL.ontology.aalfficiency.scores.*;

public class AalfficiencyScoresFactory extends ResourceFactoryImpl {
	
	public static final int Advice = 0;
	public static final int AalfficiencyAdvices = 1;
	public static final int Challenge = 2;
	public static final int ActivityData = 3;
	public static final int ElectricityData=4;
	public static final int AalfficiencyScoresService = 5;
	
	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {
		switch (factoryIndex) {
		case Advice:
			return new Advice(instanceURI);
		case AalfficiencyAdvices:
			return new AalfficiencyAdvices(instanceURI);
		case Challenge:
			return new Challenge(instanceURI);
		case ActivityData:
			return new ActivityScore(instanceURI);
		case ElectricityData:
			return new ElectricityScore(instanceURI);
		case AalfficiencyScoresService:
			return new AalfficiencyScores(instanceURI);
		}
		return null;
	}
}

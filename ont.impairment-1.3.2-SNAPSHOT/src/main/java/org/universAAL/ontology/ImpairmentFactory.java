/*	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research

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
import org.universAAL.ontology.impairment.Astigmatism;
import org.universAAL.ontology.impairment.ColorBlindness;
import org.universAAL.ontology.impairment.FarSightedness;
import org.universAAL.ontology.impairment.HearingImpairment;
import org.universAAL.ontology.impairment.LightSensitivity;
import org.universAAL.ontology.impairment.NearSightedness;
import org.universAAL.ontology.impairment.PhysicalImpairment;
import org.universAAL.ontology.impairment.SightImpairment;
import org.universAAL.ontology.impairment.SpeakingImpairment;

/**
 * The factory for instantiating objects of the ontology classes.
 * 
 * @author Carsten Stockloew
 */

public class ImpairmentFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new SightImpairment();
	case 1:
	    return new FarSightedness();
	case 2:
	    return new SpeakingImpairment();
	case 3:
	    return new HearingImpairment();
	case 4:
	    return new ColorBlindness();
	case 5:
	    return new NearSightedness();
	case 6:
	    return new Astigmatism();
	case 7:
	    return new PhysicalImpairment();
	case 8:
	    return new LightSensitivity();
	}

	return null;
    }
}
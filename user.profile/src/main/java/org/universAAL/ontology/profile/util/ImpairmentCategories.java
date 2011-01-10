/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
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
/**
 *
 */
package org.universAAL.ontology.profile.util;

import org.universAAL.ontology.profile.Astigmatism;
import org.universAAL.ontology.profile.ColorBlindness;
import org.universAAL.ontology.profile.FarSightedness;
import org.universAAL.ontology.profile.HearingImpairment;
import org.universAAL.ontology.profile.LightSensitivity;
import org.universAAL.ontology.profile.NearSightedness;
import org.universAAL.ontology.profile.PhysicalImpairment;
import org.universAAL.ontology.profile.SightImpairment;
import org.universAAL.ontology.profile.SpeakingImpairment;

/**
 * @author KAgnantis
 *
 */
public class ImpairmentCategories {
	public static void loadClass() {
		try {
		Class.forName(Astigmatism.class.getName());
		Class.forName(ColorBlindness.class.getName());
		Class.forName(FarSightedness.class.getName());
		Class.forName(LightSensitivity.class.getName());
		Class.forName(NearSightedness.class.getName());
		Class.forName(HearingImpairment.class.getName());
		Class.forName(PhysicalImpairment.class.getName());
		Class.forName(SpeakingImpairment.class.getName());
		Class.forName(SightImpairment.class.getName());
		} catch (Exception e) {
			
		}
	}

}

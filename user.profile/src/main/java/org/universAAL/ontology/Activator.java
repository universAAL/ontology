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
package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.Activator;
import org.universAAL.ontology.profile.Astigmatism;
import org.universAAL.ontology.profile.ColorBlindness;
import org.universAAL.ontology.profile.ElderlyProfile;
import org.universAAL.ontology.profile.ElderlyUser;
import org.universAAL.ontology.profile.FarSightedness;
import org.universAAL.ontology.profile.HealthProfile;
import org.universAAL.ontology.profile.HearingImpairment;
import org.universAAL.ontology.profile.LightSensitivity;
import org.universAAL.ontology.profile.NearSightedness;
import org.universAAL.ontology.profile.PersonalPreferenceProfile;
import org.universAAL.ontology.profile.PhysicalImpairment;
import org.universAAL.ontology.profile.SightImpairment;
import org.universAAL.ontology.profile.SpeakingImpairment;
import org.universAAL.ontology.profile.UserIdentificationProfile;

public class Activator implements BundleActivator {

	static BundleContext context = null;
	
	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		Class.forName(ElderlyUser.class.getName());
		Class.forName(HealthProfile.class.getName());
		Class.forName(ElderlyProfile.class.getName());
		Class.forName(UserIdentificationProfile.class.getName());
		Class.forName(PersonalPreferenceProfile.class.getName());
		
		// Impairments
		Class.forName(Astigmatism.class.getName());
		Class.forName(ColorBlindness.class.getName());
		Class.forName(FarSightedness.class.getName());
		Class.forName(LightSensitivity.class.getName());
		Class.forName(NearSightedness.class.getName());
		Class.forName(HearingImpairment.class.getName());
		Class.forName(PhysicalImpairment.class.getName());
		Class.forName(SpeakingImpairment.class.getName());
		Class.forName(SightImpairment.class.getName());
	}
	
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

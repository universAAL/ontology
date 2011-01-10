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
package org.universAAL.ontology.profile.service;

import java.util.Hashtable;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.profile.Profile;
import org.universAAL.ontology.profile.User;


/**
 * @author kagnantis
 *
 */
public class ProfilingEditorService extends Service {
	public static final String MY_URI;
	public static final String PROP_CONTROLS;
	
	private static Hashtable profilingRestrictions = new Hashtable(1);
	static {
		MY_URI = Profile.PROFILING_NAMESPACE + "ProfilingEditorService";
		PROP_CONTROLS = Profile.PROFILING_NAMESPACE + "editorControls";
		register(ProfilingEditorService.class);
		
		addRestriction(Restriction.getAllValuesRestriction(
				PROP_CONTROLS, User.MY_URI), new String[] {PROP_CONTROLS}, profilingRestrictions);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (propURI == null)
			return null;
		Object r = profilingRestrictions.get(propURI);
		if (r instanceof Restriction)
			return (Restriction) r;
		return Service.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String getRDFSComment() {
		return "The class of services controling Profile Editor.";
	}
	
	public static String getRDFSLabel() {
		return "Profile Editor Service Controller";
	}
	
	public ProfilingEditorService(String uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.Service#getClassLevelRestrictions()
	 */
	protected Hashtable getClassLevelRestrictions() {
		return profilingRestrictions;
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}
}

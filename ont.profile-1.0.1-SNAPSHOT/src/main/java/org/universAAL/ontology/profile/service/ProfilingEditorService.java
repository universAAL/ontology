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

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.profile.Profile;

/**
 * Ontological service that handles and edits profile-related information.
 * Methods included in this class are the mandatory ones for representing an
 * ontological service in Java classes for uAAL.
 * 
 * @author kagnantis
 * @author Carsten Stockloew
 */
public class ProfilingEditorService extends Service {
    public static final String MY_URI;
    public static final String PROP_CONTROLS;

    static {
	MY_URI = Profile.PROFILING_NAMESPACE + "ProfilingEditorService";
	PROP_CONTROLS = Profile.PROFILING_NAMESPACE + "editorControls";
    }

    public ProfilingEditorService(String uri) {
	super(uri);
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }
}

/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *	
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.handgestures;

import org.universAAL.middleware.service.owl.Service;

/**
 * 
 * @author eandgrg
 * 
 */

public class HandGestureService extends Service {
    public static final String MY_URI = HandgesturesOntology.NAMESPACE
	    + "HandGestureService";
    public static final String PROP_PROP_CONTROLS = HandgesturesOntology.NAMESPACE
	    + "propControls";

    public HandGestureService() {
	super();
    }

    public HandGestureService(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return propURI == PROP_PROP_CONTROLS ? PROP_SERIALIZATION_FULL : super
		.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_PROP_CONTROLS);
    }

    public String getPropControls() {
	return (String) getProperty(PROP_PROP_CONTROLS);
    }

    public void setPropControls(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_PROP_CONTROLS, newPropValue);
    }
}

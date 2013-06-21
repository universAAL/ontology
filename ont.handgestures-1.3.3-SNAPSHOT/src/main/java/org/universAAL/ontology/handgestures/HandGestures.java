/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * Licensed under both Apache License, Version 2.0 and MIT License.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.handgestures;

import org.universAAL.middleware.owl.ManagedIndividual;

public class HandGestures extends ManagedIndividual {
    public static final String MY_URI = HandgesturesOntology.NAMESPACE
	    + "HandGestures";
    public static final String PROP_USER = HandgesturesOntology.NAMESPACE
	    + "user";
    public static final String PROP_TIMESTAMP = HandgesturesOntology.NAMESPACE
	    + "timestamp";
    public static final String PROP_GESTURE_TYPE = HandgesturesOntology.NAMESPACE
	    + "gestureType";

    public HandGestures() {
	super();
    }

    public HandGestures(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove
	return 0;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_USER) && hasProperty(PROP_TIMESTAMP)
		&& hasProperty(PROP_GESTURE_TYPE);
    }

    public HandGestureType getGestureType() {
	return (HandGestureType) getProperty(PROP_GESTURE_TYPE);
    }

    public void setGestureType(HandGestureType newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_GESTURE_TYPE, newPropValue);
    }

    public String getUser() {
	return (String) getProperty(PROP_USER);
    }

    public void setUser(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_USER, newPropValue);
    }

    public String getTimestamp() {
	return (String) getProperty(PROP_TIMESTAMP);
    }

    public void setTimestamp(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_TIMESTAMP, newPropValue);
    }
}

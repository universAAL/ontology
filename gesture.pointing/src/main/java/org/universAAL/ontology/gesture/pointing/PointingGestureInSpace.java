/*
	Copyright 2007-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut für Graphische Datenverarbeitung 
	
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
package org.universAAL.ontology.gesture.pointing;

/*
Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
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


import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.phThing.PhysicalThing;

/**
* @author mtazari
*
*/
public class PointingGestureInSpace extends GestureRecognition {

public static final String MY_URI;
public static final String PROP_ADDRESSED_THINGS;
public static final String PROP_TIMESTAMP;

static {
	MY_URI = GESTURE_RECOGNITION_NAMESPACE + "PointingGestureInSpace";
	PROP_ADDRESSED_THINGS = GESTURE_RECOGNITION_NAMESPACE + "addressedThings";
	PROP_TIMESTAMP = GESTURE_RECOGNITION_NAMESPACE + "timeStamp";
	register(PointingGestureInSpace.class);
}

public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (propURI == null)
		return null;
	if (propURI.equals(PROP_ADDRESSED_THINGS))
		return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				PhysicalThing.MY_URI, 1, 0);
	if (propURI.equals(PROP_TIMESTAMP))
		return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				TypeMapper.getDatatypeURI(Long.class), 1, 0);
	
	return GestureRecognition.getClassRestrictionsOnProperty(propURI);
}

public static String getRDFSComment() {
	return "Assuming that pointing gesture in space is equivalent to addressing physical things in that space," +
			"represents the result of interpreting such a gesture by providing a list of addressed things.";
}

public static String getRDFSLabel() {
	return "Pointing Gesture";
}

public static String[] getStandardPropertyURIs() {
	String[] inherited = GestureRecognition.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length+2];
	for (int i = 0;  i < inherited.length;  i++)
		toReturn[i] = inherited[i];
	toReturn[inherited.length] = PROP_ADDRESSED_THINGS;
	toReturn[inherited.length+1] = PROP_TIMESTAMP;
	return toReturn;
}

public PointingGestureInSpace() {
	super(GESTURE_TYPE_POINTING);
}

public PointingGestureInSpace(PhysicalThing[] addressedThings) {
	super(GESTURE_TYPE_POINTING);
	if (!setAddressedThings(addressedThings))
		throw new IllegalArgumentException("No addressed things specified!");
}

public PointingGestureInSpace(PhysicalThing[] addressedThings, long timestamp) {
	super(GESTURE_TYPE_POINTING);
	if (!setAddressedThings(addressedThings))
		throw new IllegalArgumentException("No addressed things specified!");
	setTimeStamp(timestamp);
}

public PhysicalThing[] getAddressedThings() {
	Object o = props.get(PROP_ADDRESSED_THINGS);
	if (o instanceof PhysicalThing)
		return new PhysicalThing[]{(PhysicalThing) o};
	if (o instanceof List)
		return (PhysicalThing[]) ((List) o).toArray(new PhysicalThing[((List) o).size()]);
	return null;
}

/**
 * @see org.persona.ontology.GestureRecognition#getPropSerializationType(java.lang.String)
 */
public int getPropSerializationType(String propURI) {
	return PROP_ADDRESSED_THINGS.equals(propURI)? PROP_SERIALIZATION_REDUCED
			: super.getPropSerializationType(propURI);
}

public boolean setAddressedThings(PhysicalThing[] addressedThings) {
	if (addressedThings == null  ||  addressedThings.length == 0  ||  props.containsKey(PROP_ADDRESSED_THINGS))
		return false;
	ArrayList al = new ArrayList(addressedThings.length);
	for (int i=0; i<addressedThings.length; i++)
		if (addressedThings[i] != null  &&  !al.contains(addressedThings[i]))
			al.add(addressedThings[i]);
	if (al.isEmpty())
		return false;
	props.put(PROP_ADDRESSED_THINGS, al);
	return true;
}

private void setTimeStamp(long timestamp){
	setProperty(PROP_TIMESTAMP, new Long(timestamp));
}

public long getTimeStamp(){
	Long timestamp = (Long)getProperty(PROP_TIMESTAMP);
	if(timestamp == null)
		return 0;
	return timestamp.longValue();
}

}

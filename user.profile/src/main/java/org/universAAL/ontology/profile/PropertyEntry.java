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
package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.PropertyPath;
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * 
 * Ontological representation of a Property of a Profile. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties. (to be removed)
 * 
 * @author KAgnantis
 * 
 */
public class PropertyEntry extends ManagedIndividual {
    public static final String MY_URI;
    public static final String PROP_PATH;
    public static final String PROP_IS_LITERAL;
    // public static final String PROP_VALUE;

    static {
	MY_URI = Profile.PROFILING_NAMESPACE + "OldPropertyEntry";
	PROP_PATH = Profile.PROFILING_NAMESPACE + "PropertyEntryPath";
	PROP_IS_LITERAL = Profile.PROFILING_NAMESPACE + "PropertyIsLiteral";
	// PROP_VALUE = Profile.PROFILING_NAMESPACE + "PropertyEntryValue";
	register(PropertyEntry.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_PATH.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), -1, 0);
	if (PROP_IS_LITERAL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	// if(PROP_VALUE.equals(propURI))
	// return Restriction.getAllValuesRestrictionWithCardinality(propURI,
	// TypeMapper.getDatatypeURI(String.class), 1, 0);

	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] toReturn = new String[2];
	toReturn[0] = PROP_PATH;
	// toReturn[1] = PROP_VALUE;
	toReturn[1] = PROP_IS_LITERAL;

	return toReturn;
    }

    public static String RDFSComment() {
	return "The class of a OldPropertyEntry";
    }

    public static String getRDFSLabel() {
	return "Property Definition";
    }

    public PropertyEntry() {
	super();
    }

    public PropertyEntry(String uri) {
	super(uri);
    }

    public PropertyEntry(String uri, String[] path) {
	this(uri, path, false);
    }

    public PropertyEntry(String uri, String[] path, boolean isLiteral) {
	super(uri);
	if (path == null || path.length == 0)
	    throw new IllegalArgumentException(
		    "You can't have a null or empty path");

	props.put(PROP_PATH, path);
	props.put(PROP_IS_LITERAL, new Boolean(isLiteral));

    }

    public PropertyEntry(PropertyPath pp) {
	this(pp.getURI(), pp.getThePath(), pp.serializesAsXMLLiteral());
    }

    public String[] getPath() {
	Object o = props.get(PROP_PATH);
	return (o instanceof String[]) ? (String[]) o : null;
    }

    public void setPath(String[] path) {
	if (path != null)
	    props.put(PROP_PATH, path);
    }

    public boolean getIsLiteral() {
	Object o = props.get(PROP_IS_LITERAL);
	return (o instanceof Boolean) ? ((Boolean) o).booleanValue() : false;
    }

    public void setIsLiteral(boolean isLiteral) {
	props.put(PROP_IS_LITERAL, new Boolean(isLiteral));
    }

    // public String getValue(){
    // Object o = props.get(PROP_VALUE);
    // return (o == null ? null : (String) o);
    // }
    //	
    //	
    // public void setValue(String value){
    // if (value != null)
    // props.put(PROP_VALUE, value);
    // }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;

    }

    public boolean isWellFormed() {
	return true;
    }

    // if o is a OldPropertyEntry object and o.path is the same as this.path
    // then returns true, otherwise returns false
    public boolean equals(Object o) {
	PropertyEntry other = null;
	if (!(o instanceof PropertyEntry))
	    return false;

	other = (PropertyEntry) o;
	String[] otherPath = other.getPath();
	String[] thisPath = this.getPath();

	if (otherPath.length != thisPath.length)
	    return false;

	for (int i = 0; i < thisPath.length; ++i)
	    if (thisPath[i].equals(otherPath[i]))
		return false;

	return true;
    }

}

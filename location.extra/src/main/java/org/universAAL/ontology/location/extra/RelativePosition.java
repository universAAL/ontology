/*
	Copyright 2008-2010 Vodafone Italy, http://www.vodafone.it
	Vodafone Omnitel N.V.
	
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
package org.universAAL.ontology.location.extra;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * A RelativePosition represents a point position in the current referring
 * system
 * 
 * @author smazzei
 * 
 */
public class RelativePosition extends ManagedIndividual implements Position {

    public static final String MY_URI;
    public static final String PROP_X;
    public static final String PROP_Y;
    public static final String PROP_Z;

    static {
	MY_URI = uAAL_VOCABULARY_NAMESPACE + "RelativePosition";
	PROP_X = uAAL_VOCABULARY_NAMESPACE + "X";
	PROP_Y = uAAL_VOCABULARY_NAMESPACE + "Y";
	PROP_Z = uAAL_VOCABULARY_NAMESPACE + "Z";
	register(RelativePosition.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_X.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 1);
	if (PROP_Y.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 1);
	if (PROP_Z.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 0);
	if (PROP_ACCURACY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 0);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_ACCURACY, PROP_X, PROP_Y, PROP_Z };
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public RelativePosition() {
	super();
    }

    /**
     * Constructor just for usage by de-serializers. Do not use this constructor
     * within applications as it may lead to incomplete instances that cause
     * exceptions.
     */
    public RelativePosition(String uri) {
	super(uri);
    }

    /**
     * Create a new RelativePosition
     * 
     * @param uri
     *            The object URI
     * @param x
     * @param y
     * @param z
     */
    public RelativePosition(String uri, Double x, Double y, Double z) {
	super(uri);
	if (x == null || y == null || z == null)
	    throw new IllegalArgumentException();

	props.put(PROP_X, x);
	props.put(PROP_Y, y);
	props.put(PROP_Z, z);
    }

    /**
     * Create a new RelativePosition
     * 
     * @param x
     * @param y
     * @param z
     */
    public RelativePosition(Double x, Double y, Double z) {
	super();
	if (x == null || y == null || z == null)
	    throw new IllegalArgumentException();

	props.put(PROP_X, x);
	props.put(PROP_Y, y);
	props.put(PROP_Z, z);
    }

    /**
     * Create a new RelativePosition
     * 
     * @param uri
     *            The object URI
     * @param x
     * @param y
     */
    public RelativePosition(String uri, Double x, Double y) {
	super(uri);
	if (x == null || y == null)
	    throw new IllegalArgumentException();

	props.put(PROP_X, x);
	props.put(PROP_Y, y);
    }

    /**
     * Create a new RelativePosition
     * 
     * @param x
     * @param y
     */
    public RelativePosition(Double x, Double y) {
	super();
	if (x == null || y == null)
	    throw new IllegalArgumentException();

	props.put(PROP_X, x);
	props.put(PROP_Y, y);
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_X.equals(propURI) || PROP_Y.equals(propURI)
		|| PROP_Z.equals(propURI) || PROP_ACCURACY.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;

	return PROP_SERIALIZATION_OPTIONAL;
    }

    /**
     * 
     * @return the double array {X, Y, Z}.If the point Z property is missing the
     *         method assumes that it is zero. For a well formed relative
     *         position this method doesn't return a null object.
     */
    public double[] get3DCoordinates() {
	if (!props.containsKey(PROP_X) || !props.containsKey(PROP_Y))
	    return null;
	double altitude = 0;
	if (props.containsKey(PROP_Z))
	    altitude = ((Double) props.get(PROP_Z)).doubleValue();
	double[] get3DCoordinates = {
		((Double) props.get(PROP_X)).doubleValue(),
		((Double) props.get(PROP_Y)).doubleValue(), altitude };
	return get3DCoordinates;
    }

    /**
     * 
     * @return the double array {X, Y}. For a well formed relative position this
     *         method doesn't return a null object.
     */
    public double[] get2DCoordinates() {
	if (!props.containsKey(PROP_X) || !props.containsKey(PROP_Y))
	    return null;
	double[] get2DCoordinates = {
		((Double) props.get(PROP_X)).doubleValue(),
		((Double) props.get(PROP_Y)).doubleValue() };
	return get2DCoordinates;
    }

    public static String getRDFSComment() {
	return "The class of relative position. A relative position can be represented in a 2D system (with x and y coordinates) or in a 3D system (with x, y, and z coordinates)";
    }

    public static String getRDFSLabel() {
	return "Relative Position";
    }

    /**
     * A RelativePosition is well formed if at least X and Y coordinates are
     * present.
     */
    public boolean isWellFormed() {
	return props.containsKey(PROP_X) && props.containsKey(PROP_Y);
    }

    /**
     * @return the relative position accuracy (i.e. X/Y/Z accuracy). If this
     *         property is not present a null value is returned.
     */
    public Double getAccuracy() {
	if (!props.containsKey(PROP_ACCURACY))
	    return null;
	return (Double) props.get(PROP_ACCURACY);
    }

    /**
     * Set the relative position accuracy.
     */
    public void setAccuracy(double acc) {
	props.put(PROP_ACCURACY, new Double(acc));
    }

}

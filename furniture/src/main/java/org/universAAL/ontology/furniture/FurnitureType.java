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
package org.universAAL.ontology.furniture;

import org.universAAL.middleware.owl.ManagedIndividual;

public class FurnitureType extends ManagedIndividual {

    public static final String MY_URI;

    public static final int CHAIR = 0;
    public static final int TABLE = 1;
    public static final int SHELF = 2;
    public static final int LOCKER = 3;
    public static final int SOFA = 4;
    public static final int BED = 5;
    public static final int OTHER = 6;

    private int order;

    private static final String[] names = { "Chair", "Table", "Shelf",
	    "Locker", "Sofa", "Bed", "Other" };

    static {
	MY_URI = Furniture.PERSONA_FURNITURE_NAMESPACE + "FurnitureType";
	register(FurnitureType.class);
    }

    public static final FurnitureType Chair = new FurnitureType(CHAIR);
    public static final FurnitureType Table = new FurnitureType(TABLE);
    public static final FurnitureType Shelf = new FurnitureType(SHELF);
    public static final FurnitureType Locker = new FurnitureType(LOCKER);
    public static final FurnitureType Sofa = new FurnitureType(SOFA);
    public static final FurnitureType Bed = new FurnitureType(BED);
    public static final FurnitureType Other = new FurnitureType(OTHER);

    /**
     * Returns the list of all class members guaranteeing that no other members
     * will be created after a call to this method.
     */
    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] { Chair, Table, Shelf, Locker, Sofa,
		Bed, Other };
    }

    /**
     * Returns the modality with the given URI.
     */
    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null && instanceURI
		.startsWith(Furniture.PERSONA_FURNITURE_NAMESPACE)) ? valueOf(instanceURI
		.substring(Furniture.PERSONA_FURNITURE_NAMESPACE.length()))
		: null;
    }

    public static final FurnitureType valueOf(String name) {
	for (int i = 0; i <= 10; i++)
	    if (names[i].equals(name))
		return getLevelByOrder(i);
	return null;
    }

    public static FurnitureType getLevelByOrder(int order) {
	return (FurnitureType) getEnumerationMembers()[order];
    }

    /**
     * Creates a RoomFunction object
     */
    public FurnitureType() {
	super();
    }

    /**
     * Creates a RoomFunction object
     * 
     * @param uri
     *            this value can also be a null object
     * @param name
     *            The function number. A null object is not allowed
     */
    public FurnitureType(int Function) {
	super();
	this.order = Function;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    /**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
	return "Describes the type of a furniture.";
    }

    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
	return "FurnitureType";
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_OPTIONAL;
    }
}

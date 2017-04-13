/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
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

/**
 * Ontological enumeration of possible furniture types. Methods included in this
 * class are the mandatory ones for representing an ontological enumeration in
 * Java classes for uAAL.
 * 
 * @author Carsten Stockloew
 */
public class FurnitureType extends ManagedIndividual {

    public static final String MY_URI = FurnitureOntology.NAMESPACE
	    + "FurnitureType";

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

    public static final FurnitureType Chair = new FurnitureType(CHAIR);
    public static final FurnitureType Table = new FurnitureType(TABLE);
    public static final FurnitureType Shelf = new FurnitureType(SHELF);
    public static final FurnitureType Locker = new FurnitureType(LOCKER);
    public static final FurnitureType Sofa = new FurnitureType(SOFA);
    public static final FurnitureType Bed = new FurnitureType(BED);
    public static final FurnitureType Other = new FurnitureType(OTHER);

    private static FurnitureType[] members = new FurnitureType[] { Chair,
	    Table, Shelf, Locker, Sofa, Bed, Other };

    public static final FurnitureType valueOf(String name) {
	for (int i = 0; i <= 10; i++)
	    if (names[i].equals(name))
		return getLevelByOrder(i);
	return null;
    }

    public static FurnitureType getLevelByOrder(int order) {
	return members[order];
    }

    /** Creates a FurnitureType object. */
    public FurnitureType() {
	super();
    }

    /** Creates a FurnitureType object. */
    public FurnitureType(int Function) {
	super(FurnitureOntology.NAMESPACE + names[Function]);
	this.order = Function;
    }

    public String getClassURI() {
	return MY_URI;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_OPTIONAL;
    }
}

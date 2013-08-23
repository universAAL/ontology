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
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ColorType extends ManagedIndividual {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "ColorType";

    public static final int WHITE = 0;
    public static final int BLACK = 1;
    public static final int LIGHT_GRAY = 2;
    public static final int DARK_GREY = 3;
    public static final int LIGHT_BLUE = 4;
    public static final int DARK_BLUE = 5;
    public static final int LIGHT_GREEN = 6;
    public static final int DARK_GREEN = 7;
    public static final int LIGHT_RED = 8;
    public static final int DARK_RED = 9;
    public static final int ORANGE = 10;
    public static final int YELLOW = 11;
    public static final int CYAN = 12;
    public static final int PURPLE = 13;
    public static final int MAGENTA = 14;
    public static final int PINK = 15;

    private static final String[] names = { "white", "black", "lightGray",
	    "darkGrey", "lightBlue", "darkBlue", "lightGreen", "darkGreen",
	    "lightRed", "darkRed", "orange", "yellow", "cyan", "purple",
	    "magenta", "pink" };

    public static final ColorType white = new ColorType(WHITE);
    public static final ColorType black = new ColorType(BLACK);
    public static final ColorType lightGray = new ColorType(LIGHT_GRAY);
    public static final ColorType darkGrey = new ColorType(DARK_GREY);
    public static final ColorType lightBlue = new ColorType(LIGHT_BLUE);
    public static final ColorType darkBlue = new ColorType(DARK_BLUE);
    public static final ColorType lightGreen = new ColorType(LIGHT_GREEN);
    public static final ColorType darkGreen = new ColorType(DARK_GREEN);
    public static final ColorType lightRed = new ColorType(LIGHT_RED);
    public static final ColorType darkRed = new ColorType(DARK_RED);
    public static final ColorType orange = new ColorType(ORANGE);
    public static final ColorType yellow = new ColorType(YELLOW);
    public static final ColorType cyan = new ColorType(CYAN);
    public static final ColorType purple = new ColorType(PURPLE);
    public static final ColorType magenta = new ColorType(MAGENTA);
    public static final ColorType pink = new ColorType(PINK);

    private int order;

    private ColorType(int order) {
	super(UIPreferencesProfileOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean isWellFormed() {
	return true;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    /**
     * @return number of defined types
     */
    public static int getSize() {
	return names.length;
    }

    public String getClassURI() {
	return MY_URI;
    }

    public static ColorType getColorTypeByOrder(int order) {
	switch (order) {
	case WHITE:
	    return white;
	case BLACK:
	    return black;
	case LIGHT_GRAY:
	    return lightGray;
	case DARK_GREY:
	    return darkGrey;
	case LIGHT_BLUE:
	    return lightBlue;
	case DARK_BLUE:
	    return darkBlue;
	case LIGHT_GREEN:
	    return lightGreen;
	case DARK_GREEN:
	    return darkGreen;
	case LIGHT_RED:
	    return lightRed;
	case DARK_RED:
	    return darkRed;
	case ORANGE:
	    return orange;
	case YELLOW:
	    return yellow;
	case CYAN:
	    return cyan;
	case PURPLE:
	    return purple;
	case MAGENTA:
	    return magenta;
	case PINK:
	    return pink;
	default:
	    return null;
	}
    }

    public static final ColorType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE
		    .length());

	for (int i = WHITE; i <= PINK; i++)
	    if (names[i].equals(name))
		return getColorTypeByOrder(i);

	return null;
    }
}

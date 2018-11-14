/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonetontology.values;


import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonetontology.EchonetOntology;

public class ShapeValue extends ManagedIndividual{

	protected ShapeValue(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ShapeValue";
	
	public static final int BOX_TYPE = 0;
	public static final int DESKTOP_TYPE = 1;
	public static final int TRIPLE_GLASS_TYPE = 2;
	public static final int QUADRUPLE_GLASS_TYPE = 3;
	public static final int REACH_IN = 4;
	public static final int GLASS_TOP_TYPE = 5;
	public static final int MULTISTAGE_OPEN_CEILING_BLOWOFF_TYPE = 6;
	public static final int MULTISTAGE_OPEN_BACKSIDE_BLOWOFF_TYPE = 7;
	public static final int FLAT_TYPE = 8;
	public static final int WALK_IN_TYPE = 9;
	public static final int OTHER = 10;
	private static final String[] names = { "boxType", "desktopType","tripleGlassType","quadrupleGlassType","reachIn",
											"glassTopType","multiStageOpenCeilingBlowoffType","multiStageOpenBacksideBlowoffType",
											"flatType","walkInType","other"};
	
	public static final ShapeValue BoxType = new ShapeValue(BOX_TYPE);
	public static final ShapeValue DesktopType = new ShapeValue(DESKTOP_TYPE);
	public static final ShapeValue TripleGlassType = new ShapeValue(TRIPLE_GLASS_TYPE);
	public static final ShapeValue QuadrupleGlassType = new ShapeValue(QUADRUPLE_GLASS_TYPE);
	public static final ShapeValue ReachIn = new ShapeValue(REACH_IN);
	public static final ShapeValue GlassTopType = new ShapeValue(GLASS_TOP_TYPE);
	public static final ShapeValue MultiStageOpenCeilingBlowoffType = new ShapeValue(MULTISTAGE_OPEN_CEILING_BLOWOFF_TYPE);
	public static final ShapeValue MultiStageOpenBacksideBlowoffType = new ShapeValue(MULTISTAGE_OPEN_BACKSIDE_BLOWOFF_TYPE);
	public static final ShapeValue FlatType = new ShapeValue(FLAT_TYPE);
	public static final ShapeValue WalkInType = new ShapeValue(WALK_IN_TYPE);
	public static final ShapeValue Other = new ShapeValue(OTHER);
	
	private int order;

	private ShapeValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static ShapeValue getColorValueByOrder(int order) {
		switch (order) {
		case BOX_TYPE:
			return BoxType;
		case DESKTOP_TYPE:
			return DesktopType;
		case TRIPLE_GLASS_TYPE:
			return TripleGlassType;
		case QUADRUPLE_GLASS_TYPE:
			return QuadrupleGlassType;
		case REACH_IN:
			return ReachIn;
		case GLASS_TOP_TYPE:
			return GlassTopType;
		case MULTISTAGE_OPEN_BACKSIDE_BLOWOFF_TYPE:
			return MultiStageOpenBacksideBlowoffType;
		case MULTISTAGE_OPEN_CEILING_BLOWOFF_TYPE:
			return MultiStageOpenCeilingBlowoffType;
		case FLAT_TYPE:
			return FlatType;
		case WALK_IN_TYPE:
			return WalkInType;
		case OTHER:
			return Other;
		default:
			return null;
		}
	}

	public static final ShapeValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = BOX_TYPE; i <= OTHER; i++)
			if (names[i].equals(name))
				return getColorValueByOrder(i);
		return null;
	}
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public String getClassURI() {
		return MY_URI;
	}

}

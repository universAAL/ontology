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

public class FaultDesciptionValue extends ManagedIndividual{
	
	protected FaultDesciptionValue(String uri) {
		super(uri);
	}
	
	public static final String MY_URI = EchonetOntology.NAMESPACE + "FaultDescriptionValue";
	//public static final String HAS_FAULT_DESCRIPTION_DETAIL = EchonetOntology.NAMESPACE + "FaultDescriptionValueDetail";
	
	public static final int NO_FAULT = 0;
	public static final int RECOVERBLE_FAULT_1 = 1;
	public static final int RECOVERBLE_FAULT_2 = 2;
	public static final int RECOVERBLE_FAULT_3 = 3;
	public static final int RECOVERBLE_FAULT_4 = 4;
	public static final int RECOVERBLE_FAULT_5 = 5;
	public static final int RECOVERBLE_FAULT_6 = 6;
	public static final int RECOVERBLE_FAULT_7 = 7;
	public static final int REQUIRE_REPAIR_FAULT_1 = 8;
	public static final int REQUIRE_REPAIR_FAULT_2 = 9;
	public static final int REQUIRE_REPAIR_FAULT_3 = 10;
	public static final int REQUIRE_REPAIR_FAULT_4 = 11;
	public static final int REQUIRE_REPAIR_FAULT_5 = 12;
	public static final int REQUIRE_REPAIR_FAULT_6 = 13;
	public static final int UNKNOWN_FAULT = 14;
	
	
	private static final String[] names = {"noFault", "recoverableFaultType1", "recoverableFaultType2", "recoverableFaultType3", 
										   "recoverableFaultType4", "recoverableFaultType5", "recoverableFaultType6", "recoverableFaultType7",
										   "requireRepairFaultType1", "requireRepairFaultType2", "requireRepairFaultType3","requireRepairFaultType4", 
										   "requireRepairFaultType5", "requireRepairFaultType6", "unknownFault"};
	
	public static final FaultDesciptionValue NoFault = new FaultDesciptionValue(NO_FAULT);
	public static final FaultDesciptionValue RecoverableFaultType1 = new FaultDesciptionValue(RECOVERBLE_FAULT_1);
	public static final FaultDesciptionValue RecoverableFaultType2 = new FaultDesciptionValue(RECOVERBLE_FAULT_2);
	public static final FaultDesciptionValue RecoverableFaultType3 = new FaultDesciptionValue(RECOVERBLE_FAULT_3);
	public static final FaultDesciptionValue RecoverableFaultType4 = new FaultDesciptionValue(RECOVERBLE_FAULT_4);
	public static final FaultDesciptionValue RecoverableFaultType5 = new FaultDesciptionValue(RECOVERBLE_FAULT_5);
	public static final FaultDesciptionValue RecoverableFaultType6 = new FaultDesciptionValue(RECOVERBLE_FAULT_6);
	public static final FaultDesciptionValue RecoverableFaultType7 = new FaultDesciptionValue(RECOVERBLE_FAULT_7);
	public static final FaultDesciptionValue RequireRepairFaultType1 = new FaultDesciptionValue(REQUIRE_REPAIR_FAULT_1);
	public static final FaultDesciptionValue RequireRepairFaultType2 = new FaultDesciptionValue(REQUIRE_REPAIR_FAULT_2);
	public static final FaultDesciptionValue RequireRepairFaultType3 = new FaultDesciptionValue(REQUIRE_REPAIR_FAULT_3);
	public static final FaultDesciptionValue RequireRepairFaultType4 = new FaultDesciptionValue(REQUIRE_REPAIR_FAULT_4);
	public static final FaultDesciptionValue RequireRepairFaultType5 = new FaultDesciptionValue(REQUIRE_REPAIR_FAULT_5);
	public static final FaultDesciptionValue RequireRepairFaultType6 = new FaultDesciptionValue(REQUIRE_REPAIR_FAULT_6);
	public static final FaultDesciptionValue UnknownFault = new FaultDesciptionValue(UNKNOWN_FAULT);
	private int order;
	
	private FaultDesciptionValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
		/*
		String msg ="";
		switch (order) {
		case NO_FAULT:
			msg ="No fault";
			break;
		case RECOVERBLE_FAULT_1:
			msg ="Faults that can be recovered from by turning off the power witch and" +
			     "turning it on again or withdrawing and re-inserting the power plug.";
			break;
		case RECOVERBLE_FAULT_2:
			msg ="Faults that can be recovered from by pressing the reset button.";
			break;
		case RECOVERBLE_FAULT_3:
			msg ="Faults that can be recovered from by changing the way the device is" + 
				 "mounted or opening/closing a lid or door.";
			break;
		case RECOVERBLE_FAULT_4:
			msg ="Faults that can be recovered from by supplying fuel, water, air, etc.";
			break;
		case RECOVERBLE_FAULT_5:
			msg ="Faults that can be recovered from by cleaning the device (filter etc.)";
			break;
		case RECOVERBLE_FAULT_6:
			msg ="Faults that can be recovered from by changing the battery or cell";
			break;
		case RECOVERBLE_FAULT_7:
			msg ="User-definable domain";
			break;
		case REQUIRE_REPAIR_FAULT_1:
			msg ="Abnormal event or the tripping of a safety device";
			break;
		case REQUIRE_REPAIR_FAULT_2:
			msg ="Fault in a switch";
			break;
		case REQUIRE_REPAIR_FAULT_3:
			msg ="Fault in the sensor system";
			break;
		case REQUIRE_REPAIR_FAULT_4:
			msg ="Fault in a component such as an actuator";
			break;
		case REQUIRE_REPAIR_FAULT_5:
			msg ="Fault in a control circuit board";
			break;
		case REQUIRE_REPAIR_FAULT_6:
			msg ="User-definable domain";
			break;
		case UNKNOWN_FAULT:
			msg ="A fault has occurred but the recovery method or fault location cannot be determined.";
			break;
		}
		setDescriptionsDetail(msg);
		*/
	}

	public static FaultDesciptionValue getFaultDesciptionValueByOrder(int order) {
		switch (order) {
		case NO_FAULT:
			return NoFault;
		case RECOVERBLE_FAULT_1:
			return RecoverableFaultType1;
		case RECOVERBLE_FAULT_2:
			return RecoverableFaultType2;
		case RECOVERBLE_FAULT_3:
			return RecoverableFaultType3;
		case RECOVERBLE_FAULT_4:
			return RecoverableFaultType4;
		case RECOVERBLE_FAULT_5:
			return RecoverableFaultType5;
		case RECOVERBLE_FAULT_6:
			return RecoverableFaultType6;
		case RECOVERBLE_FAULT_7:
			return RecoverableFaultType7;
		case REQUIRE_REPAIR_FAULT_1:
			return RequireRepairFaultType1;
		case REQUIRE_REPAIR_FAULT_2:
			return RequireRepairFaultType2;
		case REQUIRE_REPAIR_FAULT_3:
			return RequireRepairFaultType3;
		case REQUIRE_REPAIR_FAULT_4:
			return RequireRepairFaultType4;
		case REQUIRE_REPAIR_FAULT_5:
			return RequireRepairFaultType5;
		case REQUIRE_REPAIR_FAULT_6:
			return RequireRepairFaultType6;
		case UNKNOWN_FAULT:
			return UnknownFault;			
		default:
			return null;
		}
	}

	public static final FaultDesciptionValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NO_FAULT; i <= UNKNOWN_FAULT; i++)
			if (names[i].equals(name))
				return getFaultDesciptionValueByOrder(i);
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
	/*
	public void setDescriptionsDetail(String des) {
		changeProperty(HAS_FAULT_DESCRIPTION_DETAIL, des);
	}
	public String getDescriptionsDetail() {
		Object pp = getProperty(HAS_FAULT_DESCRIPTION_DETAIL);
		if(pp!= null) {
			return pp.toString();
		} else {
			return null;
		}
	} */

}

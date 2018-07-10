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
package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class IntervalSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "IntervalSettingValue";
	private int order;
	public static final int OFF = 0;
	public static final int DAILY = 1;
	public static final int EVERY_OTHER_DAY = 2;
	public static final int EVERY_3_DAY = 3;
	public static final int ONCE_A_WEEK = 4;
	
	private static final String[] names = {"off","daily","everyOtherDay","every3Day", "onceAWeek"};
	public static final IntervalSettingValue Off = new IntervalSettingValue(OFF);
	public static final IntervalSettingValue Daily = new IntervalSettingValue(DAILY);
	public static final IntervalSettingValue EveryOtherDay = new IntervalSettingValue(EVERY_OTHER_DAY);
	public static final IntervalSettingValue Every3Day = new IntervalSettingValue(EVERY_3_DAY);
	public static final IntervalSettingValue OnceAWeek = new IntervalSettingValue(ONCE_A_WEEK);
	
	private IntervalSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static IntervalSettingValue getIntervalSettingValueByOrder(int order) {
		switch (order) {
		case OFF:
			return Off;
		case DAILY:
			return Daily;	
		case EVERY_OTHER_DAY:
			return EveryOtherDay;	
		case EVERY_3_DAY:
			return Every3Day;	
		case ONCE_A_WEEK:
			return OnceAWeek;	
		default:
			return null;
		}
	}

	public static final IntervalSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = OFF; i <= ONCE_A_WEEK; i++)
			if (names[i].equals(name))
				return getIntervalSettingValueByOrder(i);
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

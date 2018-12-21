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

public class TransferingMethods extends ManagedIndividual{

	protected TransferingMethods(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TransferingMethods";
	
	public static final int LOCAL_STORAGE_TRANSFER = 0;
	public static final int REMOTE_STORAGE_TRANSFER = 1;
	public static final int MAIL_TRANSFER = 2;
	public static final int NOT_SET = 3;
	private static final String[] names = { "localStorageTransger", "remoteStorageTransger","mailTransfer","notSet"};
	
	public static final TransferingMethods LocalStorageTransger = new TransferingMethods(LOCAL_STORAGE_TRANSFER);
	public static final TransferingMethods RemoteStorageTransger = new TransferingMethods(REMOTE_STORAGE_TRANSFER);
	public static final TransferingMethods MailTransfer = new TransferingMethods(MAIL_TRANSFER);
	public static final TransferingMethods NotSet = new TransferingMethods(NOT_SET);
	
	private int order;

	private TransferingMethods(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static TransferingMethods getTransferingMethodsByOrder(int order) {
		switch (order) {
		case LOCAL_STORAGE_TRANSFER:
			return LocalStorageTransger;
		case REMOTE_STORAGE_TRANSFER:
			return RemoteStorageTransger;
		case MAIL_TRANSFER:
			return MailTransfer;
		case NOT_SET:
			return NotSet;
		default:
			return null;
		}
	}

	public static final TransferingMethods valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = LOCAL_STORAGE_TRANSFER; i <= NOT_SET; i++)
			if (names[i].equals(name))
				return getTransferingMethodsByOrder(i);
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

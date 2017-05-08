/*******************************************************************************
 * Copyright 2016 2011 Universidad Politécnica de Madrid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.test;

import java.security.Provider;
import java.security.Security;
import java.util.Iterator;
import java.util.Set;

/**
 * @author amedrano
 *
 */
public class DigestList {
    
	public static void main(String[] args) {
		Provider[] providers = Security.getProviders();
		
		for (int i = 0; i < providers.length; i++) {
			System.out.println(providers[i]);
			Set ks = providers[i].keySet();
			for (Iterator j = ks.iterator(); j.hasNext();) {
				String s = j.next().toString();
				if (s.contains("MessageDigest")) {
					System.out.println("\t" + s);
				}
				
			}
		}
    }
}

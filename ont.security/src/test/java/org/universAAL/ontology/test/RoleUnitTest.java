/*******************************************************************************
 * Copyright 2016 Universidad Politécnica de Madrid UPM
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

import org.universAAL.middleware.bus.junit.OntTestCase;
import org.universAAL.ontology.security.AccessRight;
import org.universAAL.ontology.security.Role;

/**
 * @author amedrano
 *
 */
public class RoleUnitTest extends OntTestCase {


	public void test() {
		Role role = new Role("test1");
		assertEquals(0, role.getAllAccessRights().size());
		AccessRight ar = new AccessRight("testar1");
		role.addAccessRight(ar);
		assertEquals(1, role.getAllAccessRights().size());
		role.addAccessRight(ar);
		ar = new AccessRight("testar2");
		assertEquals(2, role.getAllAccessRights().size());
		
		Role role2 = new Role("rol2");
		role.addSubRole(role2);
		assertEquals(2, role.getAllAccessRights().size());
		role2.addAccessRight(new AccessRight("testar4r2"));
		assertEquals(3, role.getAllAccessRights().size());
		
		Role role3 = new Role("rol3");
		role.addSubRole(role3);
		role2.addAccessRight(new AccessRight("testar4r3"));
		assertEquals(4, role.getAllAccessRights().size());
		
		role3.addSubRole(role);
		role2.addSubRole(role3);
		assertEquals(4, role.getAllAccessRights().size());
		
	}
}

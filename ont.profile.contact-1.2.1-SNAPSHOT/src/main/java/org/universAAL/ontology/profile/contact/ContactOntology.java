/*******************************************************************************
 * Copyright 2012 Universidad Politécnica de Madrid
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
package org.universAAL.ontology.profile.contact;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.profile.ContactFactory;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.SubProfile;
import org.universAAL.ontology.vcard.VCard;
import org.universAAL.ontology.vcard.VCardOntology;
//import the factory for this ontology


/**
 * @author AAL Studio: UML2Java transformation
 */
public final class ContactOntology extends Ontology {

  private static ContactFactory factory = new ContactFactory();
  public static final String NAMESPACE ="http://ontology.universAAL.org/profile.contact#";
	
  public ContactOntology() {
    super(NAMESPACE);
  }

  public void create() {
    Resource r = getInfo();
    r.setResourceComment("");
    r.setResourceLabel("contact");
    addImport(DataRepOntology.NAMESPACE);
    addImport(ServiceBusOntology.NAMESPACE);
    addImport(ProfileOntology.NAMESPACE);
    addImport(VCardOntology.NAMESPACE);
		
    


    // ******* Declaration of regular classes of the ontology ******* //
    OntClassInfoSetup oci_ContactManagementService = createNewOntClassInfo(ContactManagementService.MY_URI, factory, 0);
    OntClassInfoSetup oci_ContactListSubProfile = createNewOntClassInfo(ContactListSubProfile.MY_URI, factory, 1);


    // ******* Add content to regular classes of the ontology ******* //
    oci_ContactManagementService.setResourceComment("The service to add edit remove or other operations over contact list.");
    oci_ContactManagementService.setResourceLabel("ContactManagementService");
    oci_ContactManagementService.addSuperClass(Service.MY_URI); 
    oci_ContactManagementService.addObjectProperty(ContactManagementService.PROP_MANAGES_CONTACT_LIST_SUB_PROFILE).setFunctional();
    oci_ContactManagementService.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(ContactManagementService.PROP_MANAGES_CONTACT_LIST_SUB_PROFILE, 
      ContactListSubProfile.MY_URI, 1, 1));
    oci_ContactManagementService.addObjectProperty(ContactManagementService.PROP_CONTACT).setFunctional();
    oci_ContactManagementService.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(ContactManagementService.PROP_CONTACT, 
      ContactListSubProfile.MY_URI, 1, 1));
    
    oci_ContactListSubProfile.setResourceComment("The contact list");
    oci_ContactListSubProfile.setResourceLabel("ContactListSubProfile");
    oci_ContactListSubProfile.addSuperClass(SubProfile.MY_URI); 
    oci_ContactListSubProfile.addObjectProperty(ContactListSubProfile.PROP_CONTACT_LIST).setFunctional();
    oci_ContactListSubProfile.addRestriction(MergedRestriction
    		.getAllValuesRestrictionWithCardinality(ContactListSubProfile.PROP_CONTACT_LIST, VCard.MY_URI, 0, -1));
  }
}

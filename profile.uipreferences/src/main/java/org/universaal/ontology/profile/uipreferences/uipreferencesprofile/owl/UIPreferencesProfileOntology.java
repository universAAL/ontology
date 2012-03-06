
package org.universaal.ontology.profile.uipreferences.uipreferencesprofile.owl;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.profile.AssistedPersonProfile;
import org.universAAL.ontology.profile.SubProfile;
import org.universaal.ontology.profile.uipreferences.uipreferencesprofile.UIPreferencesProfileFactory;



/**
 * @author eandgrg
 *
 */
public final class UIPreferencesProfileOntology extends Ontology {

  private static UIPreferencesProfileFactory factory = new UIPreferencesProfileFactory();
  public static final String NAMESPACE ="http://uipreferences.profile.ontology.universaal.org/UIPreferencesProfile#";
  
  public static final String PROP_INTERACTION_PREF_PROFILE = AssistedPersonProfile.PROP_HAS_SUB_PROFILE
  + "UIPreferences";
	
  public UIPreferencesProfileOntology() {
    super(NAMESPACE);
  }

  public void create() {
    Resource r = getInfo();
    r.setResourceComment("User preferences related to user interaction");
    r.setResourceLabel("UIPreferencesProfile");
    addImport(DataRepOntology.NAMESPACE);
    addImport(ServiceBusOntology.NAMESPACE);
    addImport(LocationOntology.NAMESPACE);
		
    


    // ******* Declaration of regular classes of the ontology ******* //
    OntClassInfoSetup oci_InteractionPreferencesProfile = createNewOntClassInfo(InteractionPreferencesProfile.MY_URI, factory, 0);


    // ******* Add content to regular classes of the ontology ******* //
    oci_InteractionPreferencesProfile.setResourceComment("Interaction preferences");
    oci_InteractionPreferencesProfile.setResourceLabel("InteractionPreferencesProfile");
    oci_InteractionPreferencesProfile.addSuperClass(SubProfile.MY_URI); 
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__X).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__X, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addObjectProperty(InteractionPreferencesProfile.PROP__A_U_D_I_O).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction.getCardinalityRestriction(InteractionPreferencesProfile.PROP__A_U_D_I_O, 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__I_N_T_E_R_A_C_T_I_O_N__M_O_D_A_L_I_T_Y).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__I_N_T_E_R_A_C_T_I_O_N__M_O_D_A_L_I_T_Y, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__V_O_I_C_E__G_E_N_D_E_R).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__V_O_I_C_E__G_E_N_D_E_R, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__I_N_S_E_N_S_I_B_L_E__V_O_L_U_M_E__L_E_V_E_L).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__I_N_S_E_N_S_I_B_L_E__V_O_L_U_M_E__L_E_V_E_L, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__I_N_S_E_N_S_I_B_L_E).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__I_N_S_E_N_S_I_B_L_E, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__P_E_R_S_O_N_A_L__V_O_L_U_M_E__L_E_V_E_L).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__P_E_R_S_O_N_A_L__V_O_L_U_M_E__L_E_V_E_L, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__Y).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__Y, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__X).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__X, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__P_E_R_S_O_N_A_L).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__P_E_R_S_O_N_A_L, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));
    
    oci_InteractionPreferencesProfile.addDatatypeProperty(InteractionPreferencesProfile.PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__Y).setFunctional();
    oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
      .getAllValuesRestrictionWithCardinality(InteractionPreferencesProfile.PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__Y, 
      TypeMapper.getDatatypeURI(String.class), 1, 1));

	// Extend UserProfile
	OntClassInfoSetup oci = extendExistingOntClassInfo(AssistedPersonProfile.MY_URI);
	oci.addObjectProperty(PROP_INTERACTION_PREF_PROFILE).addSuperProperty(
		AssistedPersonProfile.PROP_HAS_SUB_PROFILE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PROP_INTERACTION_PREF_PROFILE,
			InteractionPreferencesProfile.MY_URI, 0, 1));
  }
}

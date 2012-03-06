package org.universaal.ontology.profile.uipreferences.uipreferencesprofile.owl;

import org.universAAL.ontology.profile.SubProfile;

/**
 * @author eandgrg
 * 
 */
public class InteractionPreferencesProfile extends SubProfile {
	public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
			+ "InteractionPreferencesProfile";
	public static final String PROP__I_N_T_E_R_A_C_T_I_O_N__M_O_D_A_L_I_T_Y = UIPreferencesProfileOntology.NAMESPACE
			+ "INTERACTION_MODALITY";
	public static final String PROP__V_O_I_C_E__G_E_N_D_E_R = UIPreferencesProfileOntology.NAMESPACE
			+ "VOICE_GENDER";
	public static final String PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__P_E_R_S_O_N_A_L = UIPreferencesProfileOntology.NAMESPACE
			+ "PRIVACY_LEVELS_MAPPED_TO_PERSONAL";
	public static final String PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__I_N_S_E_N_S_I_B_L_E = UIPreferencesProfileOntology.NAMESPACE
			+ "PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE";

	// //TODO below properties are not used in DM for now (will be decided in
	// future what will be with them)
	public static final String PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__X = UIPreferencesProfileOntology.NAMESPACE
			+ "INSENSIBLE_MAX_RESOLUTION_X";
	public static final String PROP__A_U_D_I_O = UIPreferencesProfileOntology.NAMESPACE
			+ "AUDIO";
	public static final String PROP__I_N_S_E_N_S_I_B_L_E__V_O_L_U_M_E__L_E_V_E_L = UIPreferencesProfileOntology.NAMESPACE
			+ "INSENSIBLE_VOLUME_LEVEL";

	public static final String PROP__P_E_R_S_O_N_A_L__V_O_L_U_M_E__L_E_V_E_L = UIPreferencesProfileOntology.NAMESPACE
			+ "PERSONAL_VOLUME_LEVEL";
	public static final String PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__Y = UIPreferencesProfileOntology.NAMESPACE
			+ "PERSONAL_MIN_RESOLUTION_Y";
	public static final String PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__X = UIPreferencesProfileOntology.NAMESPACE
			+ "PERSONAL_MIN_RESOLUTION_X";

	public static final String PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__Y = UIPreferencesProfileOntology.NAMESPACE
			+ "INSENSIBLE_MAX_RESOLUTION_Y";

	public InteractionPreferencesProfile() {
		super();
	}

	public InteractionPreferencesProfile(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		// TODO Implement or if for Device subclasses: remove
		return 0;
	}

	public boolean isWellFormed() {
		return true
				&& hasProperty(PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__X)
				&& hasProperty(PROP__A_U_D_I_O)
				&& hasProperty(PROP__I_N_T_E_R_A_C_T_I_O_N__M_O_D_A_L_I_T_Y)
				&& hasProperty(PROP__V_O_I_C_E__G_E_N_D_E_R)
				&& hasProperty(PROP__I_N_S_E_N_S_I_B_L_E__V_O_L_U_M_E__L_E_V_E_L)
				&& hasProperty(PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__I_N_S_E_N_S_I_B_L_E)
				&& hasProperty(PROP__P_E_R_S_O_N_A_L__V_O_L_U_M_E__L_E_V_E_L)
				&& hasProperty(PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__Y)
				&& hasProperty(PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__X)
				&& hasProperty(PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__P_E_R_S_O_N_A_L)
				&& hasProperty(PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__Y);
	}

	public String getINTERACTION_MODALITY() {
		return (String) getProperty(PROP__I_N_T_E_R_A_C_T_I_O_N__M_O_D_A_L_I_T_Y);
	}

	public void setINTERACTION_MODALITY(String newPropValue) {
		if (newPropValue != null)
			setProperty(PROP__I_N_T_E_R_A_C_T_I_O_N__M_O_D_A_L_I_T_Y,
					newPropValue);
	}

	public String getPRIVACY_LEVELS_MAPPED_TO_INSENSIBLE() {
		return (String) getProperty(PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__I_N_S_E_N_S_I_B_L_E);
	}

	public void setPRIVACY_LEVELS_MAPPED_TO_INSENSIBLE(String newPropValue) {
		if (newPropValue != null)
			setProperty(
					PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__I_N_S_E_N_S_I_B_L_E,
					newPropValue);
	}

	public String getPRIVACY_LEVELS_MAPPED_TO_PERSONAL() {
		return (String) getProperty(PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__P_E_R_S_O_N_A_L);
	}

	public void setPRIVACY_LEVELS_MAPPED_TO_PERSONAL(String newPropValue) {
		if (newPropValue != null)
			setProperty(
					PROP__P_R_I_V_A_C_Y__L_E_V_E_L_S__M_A_P_P_E_D__T_O__P_E_R_S_O_N_A_L,
					newPropValue);
	}

	public String getVOICE_GENDER() {
		return (String) getProperty(PROP__V_O_I_C_E__G_E_N_D_E_R);
	}

	public void setVOICE_GENDER(String newPropValue) {
		if (newPropValue != null)
			setProperty(PROP__V_O_I_C_E__G_E_N_D_E_R, newPropValue);
	}

	public String getINSENSIBLE_VOLUME_LEVEL() {
		return (String) getProperty(PROP__I_N_S_E_N_S_I_B_L_E__V_O_L_U_M_E__L_E_V_E_L);
	}

	public void setINSENSIBLE_VOLUME_LEVEL(String newPropValue) {
		if (newPropValue != null)
			setProperty(PROP__I_N_S_E_N_S_I_B_L_E__V_O_L_U_M_E__L_E_V_E_L,
					newPropValue);
	}

	public String getPERSONAL_VOLUME_LEVEL() {
		return (String) getProperty(PROP__P_E_R_S_O_N_A_L__V_O_L_U_M_E__L_E_V_E_L);
	}

	public void setPERSONAL_VOLUME_LEVEL(String newPropValue) {
		if (newPropValue != null)
			setProperty(PROP__P_E_R_S_O_N_A_L__V_O_L_U_M_E__L_E_V_E_L,
					newPropValue);
	}

	public String getINSENSIBLE_MAX_RESOLUTION_X() {
		return (String) getProperty(PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__X);
	}

	public void setINSENSIBLE_MAX_RESOLUTION_X(String newPropValue) {
		if (newPropValue != null)
			setProperty(
					PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__X,
					newPropValue);
	}

	public String getINSENSIBLE_MAX_RESOLUTION_Y() {
		return (String) getProperty(PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__Y);
	}

	public void setINSENSIBLE_MAX_RESOLUTION_Y(String newPropValue) {
		if (newPropValue != null)
			setProperty(
					PROP__I_N_S_E_N_S_I_B_L_E__M_A_X__R_E_S_O_L_U_T_I_O_N__Y,
					newPropValue);
	}

	public String getPERSONAL_MIN_RESOLUTION_X() {
		return (String) getProperty(PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__X);
	}

	public void setPERSONAL_MIN_RESOLUTION_X(String newPropValue) {
		if (newPropValue != null)
			setProperty(PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__X,
					newPropValue);
	}

	public String getPERSONAL_MIN_RESOLUTION_Y() {
		return (String) getProperty(PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__Y);
	}

	public void setPERSONAL_MIN_RESOLUTION_Y(String newPropValue) {
		if (newPropValue != null)
			setProperty(PROP__P_E_R_S_O_N_A_L__M_I_N__R_E_S_O_L_U_T_I_O_N__Y,
					newPropValue);
	}

	public String getAUDIO() {
		return (String) getProperty(PROP__A_U_D_I_O);
	}

	public void setAUDIO(String newPropValue) {
		if (newPropValue != null)
			setProperty(PROP__A_U_D_I_O, newPropValue);
	}
}

/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package org.universAAL.ontology.profile;

import java.util.Arrays;
import java.util.List;

import org.universAAL.middleware.io.owl.AccessImpairment;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.owl.supply.LevelRating;
import org.universAAL.middleware.rdf.TypeMapper;


public class HealthProfile extends ManagedIndividual implements PropertyPublisher {

	public static final String PROFILING_NAMESPACE = "http://ontology.persona.ratio.it/HealthProfile.owl#";
	public static final String MY_URI;
	public static final String PROP_S_AGE;
	public static final String PROP_S_DOCTOR_REFERENCE;
	public static final String PROP_S_NUTRITIONAL_REFERENCE;
	public static final String PROP_S_SOCIAL_CARE_CENTER;
	public static final String PROP_S_HOSPITAL;
	public static final String PROP_S_HEIGHT;
	public static final String PROP_S_ALCOHOL;
	public static final String PROP_S_TOBACCO;
	public static final String PROP_S_DRUGS;
	public static final String PROP_S_RECOMMENDED_WEIGHT;

	public static final String PROP_HAS_ILLNESS;
	public static final String PROP_HAS_DISABILITY;
	public static final String PROP_HAS_MEDICINE;

	static {
		MY_URI = PROFILING_NAMESPACE + "HealthProfile";
		PROP_HAS_MEDICINE = PROFILING_NAMESPACE + "HasMedicine"; 
		PROP_HAS_DISABILITY  = PROFILING_NAMESPACE + "HasDisability";
		PROP_HAS_ILLNESS  = PROFILING_NAMESPACE + "HasIlleness";
		PROP_S_RECOMMENDED_WEIGHT  = PROFILING_NAMESPACE + "dWeight";
		PROP_S_AGE = PROFILING_NAMESPACE + "sAge"; 
		PROP_S_ALCOHOL = PROFILING_NAMESPACE + "sAlcohol"; 
		PROP_S_DOCTOR_REFERENCE = PROFILING_NAMESPACE + "sDoctorReference"; 
		PROP_S_DRUGS = PROFILING_NAMESPACE + "sDrugs"; 
		PROP_S_HEIGHT = PROFILING_NAMESPACE + "sHeight"; 
		PROP_S_HOSPITAL = PROFILING_NAMESPACE + "sHospital"; 
		PROP_S_NUTRITIONAL_REFERENCE = PROFILING_NAMESPACE + "sNutrionalReference"; 
		PROP_S_SOCIAL_CARE_CENTER = PROFILING_NAMESPACE + "sSocialCareCenter"; 
		PROP_S_TOBACCO = PROFILING_NAMESPACE + "sTobacco"; 
		register(HealthProfile.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_HAS_MEDICINE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, Medicine.MY_URI, -1, 0);
		if (PROP_HAS_DISABILITY.equals(propURI))
			return Restriction.getAllValuesRestriction(propURI, AccessImpairment.MY_URI);
		if (PROP_HAS_ILLNESS.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, Illness.MY_URI, 1, 1);
		if (PROP_S_RECOMMENDED_WEIGHT.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1);
		if (PROP_S_AGE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1);
		if (PROP_S_ALCOHOL.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1); 
		if (PROP_S_DOCTOR_REFERENCE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1);
		if (PROP_S_DRUGS.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1);
		if (PROP_S_HEIGHT.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1); 
		if (PROP_S_HOSPITAL.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1);
		if (PROP_S_NUTRITIONAL_REFERENCE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1);
		if (PROP_S_SOCIAL_CARE_CENTER.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1);
		if (PROP_S_TOBACCO.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Integer.class), 1, 1);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public void setProperty(String propURI, Object o) {
		if (PROP_HAS_MEDICINE.equals(propURI)  &&  o instanceof Medicine)
			setMedicine((Medicine)o);
		else if (PROP_HAS_DISABILITY.equals(propURI) && o instanceof AccessImpairment[])
			setDisability((AccessImpairment[])o);
		else if (PROP_HAS_ILLNESS.equals(propURI) && o instanceof Illness)
			setIllness((Illness)o);
		else if (PROP_S_RECOMMENDED_WEIGHT.equals(propURI) && o instanceof Integer)
			setWeight((Integer)o);
		else if (PROP_S_AGE.equals(propURI) && o instanceof Integer)
			setAge((Integer)o);
		else if (PROP_S_ALCOHOL.equals(propURI) && o instanceof Integer)
			setAlcohol((Integer)o);
		else if (PROP_S_DOCTOR_REFERENCE.equals(propURI) && o instanceof Integer)
			setDoctorReference((Integer)o);
		else if (PROP_S_DRUGS.equals(propURI) && o instanceof Integer)
			setDrugs((Integer)o);
		else if (PROP_S_HEIGHT.equals(propURI) && o instanceof Integer)
			setHeight((Integer)o);
		else if (PROP_S_HOSPITAL.equals(propURI) && o instanceof Integer)
			setHospital((Integer)o);
		else if (PROP_S_NUTRITIONAL_REFERENCE.equals(propURI) && o instanceof Integer)
			setNutrionalReference((Integer)o);
		else if (PROP_S_SOCIAL_CARE_CENTER.equals(propURI) && o instanceof Integer)
			setSocialCareCenter((Integer)o);
		else if (PROP_S_TOBACCO.equals(propURI) && o instanceof Integer)
			setTobacco((Integer)o);		
		else
			super.setProperty(propURI, o);
	}
	
	public static String[] getStandardPropertyURIs() {
		return new String[] {
				PROP_S_AGE,
				PROP_S_ALCOHOL,
				PROP_S_DOCTOR_REFERENCE,
				PROP_S_DRUGS,
				PROP_HAS_DISABILITY,
				PROP_HAS_ILLNESS,
				PROP_HAS_MEDICINE,
				PROP_S_HEIGHT,
				PROP_S_HOSPITAL,
				PROP_S_NUTRITIONAL_REFERENCE,
				PROP_S_SOCIAL_CARE_CENTER,
				PROP_S_TOBACCO,
				PROP_S_RECOMMENDED_WEIGHT
		};
	}
	
	public static String getRDFSComment() {
		return "The value of health profile.";
	}

	public static String getRDFSLabel() {
		return "Health Profile";
	}
	
	public HealthProfile(){
		super();
	}
	
	public HealthProfile(String uri){
		super(uri);
	}
	
	
	public Medicine getMedicine() {
		Object o = props.get(PROP_HAS_MEDICINE);
		return (o == null) ? null : (Medicine) o;	
	}
	
	public void setMedicine(Medicine medicine) {
		if (medicine != null)
			props.put(PROP_HAS_MEDICINE, medicine);
	}
	
	public AccessImpairment[] getDisability() {
		Object o = props.get(PROP_HAS_DISABILITY);
		if (o instanceof AccessImpairment)
			return new AccessImpairment[]{ (AccessImpairment) o };
		if (o instanceof List)
			return (AccessImpairment[]) ((List) o).toArray(new AccessImpairment[((List) o).size()]);
		return null;
	}
	
	public void setDisability(AccessImpairment[] disability) {
		if (disability != null)
			props.put(PROP_HAS_DISABILITY, Arrays.asList(disability));
	}
	
	public Illness getIllness() {
		Object o = props.get(PROP_HAS_ILLNESS);
		return (o == null) ? null : (Illness) o;	
	}
	
	public void setIllness(Illness illness) {
		if (illness != null)
			props.put(PROP_HAS_ILLNESS, illness);
	}

	public Integer getWeight() {
		Integer i = (Integer) props.get(PROP_S_RECOMMENDED_WEIGHT);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setWeight(Integer dWeight) {
			props.put(PROP_S_RECOMMENDED_WEIGHT, dWeight);
	}
	
	public Integer getAge() {
		Integer i = (Integer) props.get(PROP_S_AGE);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setAge(Integer sAge) {
			props.put(PROP_S_AGE, sAge);
	}
	
	public Integer getAlcohol() {
		Integer i = (Integer) props.get(PROP_S_ALCOHOL);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setAlcohol(Integer sAlcohol) {
			props.put(PROP_S_ALCOHOL, sAlcohol);
	}
	
	public Integer getDoctorReference() {
		Integer i = (Integer) props.get(PROP_S_DOCTOR_REFERENCE);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setDoctorReference(Integer sDoctorReference) {
			props.put(PROP_S_DOCTOR_REFERENCE, sDoctorReference);
	}
	
	public Integer getDrugs() {
		Integer i = (Integer) props.get(PROP_S_DRUGS);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setDrugs(Integer sDrugs) {
			props.put(PROP_S_DRUGS, sDrugs);
	}
	
	public Integer getHeight() {
		Integer i = (Integer) props.get(PROP_S_HEIGHT);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setHeight(Integer sHeight) {
			props.put(PROP_S_HEIGHT, sHeight);
	}
	
	public Integer getHospital() {
		Integer i = (Integer) props.get(PROP_S_HOSPITAL);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setHospital(Integer sHospital) {
			props.put(PROP_S_HOSPITAL, sHospital);
	}
	
	public Integer getNutrionalReference() {
		Integer i = (Integer) props.get(PROP_S_NUTRITIONAL_REFERENCE);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setNutrionalReference(Integer sNutrionalReference) {
			props.put(PROP_S_NUTRITIONAL_REFERENCE, sNutrionalReference);
	}
	
	public Integer getSocialCareCenter() {
		Integer i = (Integer) props.get(PROP_S_SOCIAL_CARE_CENTER);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setSocialCareCenter(Integer sSocialCareCenter) {
			props.put(PROP_S_SOCIAL_CARE_CENTER, sSocialCareCenter);
	}
	
	public Integer getTobacco() {
		Integer i = (Integer) props.get(PROP_S_TOBACCO);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setTobacco(Integer sTobacco) {
			props.put(PROP_S_TOBACCO, sTobacco);
	}
	
	
	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#isWellFormed()
	 */
	public boolean isWellFormed() {
		return props.containsKey(PROP_HAS_MEDICINE)
		&& props.containsKey(PROP_HAS_DISABILITY)
		&& props.containsKey(PROP_HAS_ILLNESS)
		&& props.containsKey(PROP_S_RECOMMENDED_WEIGHT)
		&& props.containsKey(PROP_S_AGE)
		&& props.containsKey(PROP_S_ALCOHOL)
		&& props.containsKey(PROP_S_DOCTOR_REFERENCE)
		&& props.containsKey(PROP_S_DRUGS)
		&& props.containsKey(PROP_S_HEIGHT)
		&& props.containsKey(PROP_S_HOSPITAL)
		&& props.containsKey(PROP_S_NUTRITIONAL_REFERENCE)
		&& props.containsKey(PROP_S_SOCIAL_CARE_CENTER)
		&& props.containsKey(PROP_S_TOBACCO);
	}
	
	public ProfileProperty[] getAllProperties() {
		ProfileProperty[] staticProperties = getStaticProperties();
		ProfileProperty[] dynamicProperties = getDynamicProperties();

		int staticLength = staticProperties.length;
		int dynamicLength = dynamicProperties.length;
		int allLength = staticLength + dynamicLength; 
		
		ProfileProperty[] allProperties = 
			new ProfileProperty[allLength];
		
		
		for (int i = 0; i < staticLength; ++i) {
			allProperties[i] = staticProperties[i];			
		}
		for (int i = staticLength; i < allLength; ++i) {
			allProperties[i] = dynamicProperties[staticLength - i];
		}
		
		return allProperties;
	}
	
	public ProfileProperty[] getDynamicProperties() {
		return new ProfileProperty[0];
	}

	public ProfileProperty[] getStaticProperties() {
		ProfileProperty[] propArray = new ProfileProperty[13];
		propArray[0] = new ProfileProperty(getAge(), PROP_S_AGE, "Age", true);
		propArray[1] = new ProfileProperty(getDoctorReference(), PROP_S_DOCTOR_REFERENCE, "Doctor reference", true);
		propArray[2] = new ProfileProperty(getNutrionalReference(), PROP_S_NUTRITIONAL_REFERENCE, "Nutritional reference", true);
		propArray[3] = new ProfileProperty(getSocialCareCenter(), PROP_S_SOCIAL_CARE_CENTER, "Social care center", true);
		propArray[4] = new ProfileProperty(getHospital(), PROP_S_HOSPITAL, "Hospital", true);
		propArray[5] = new ProfileProperty(getHeight(), PROP_S_HEIGHT, "Height", true);
		propArray[6] = new ProfileProperty(getAlcohol(), PROP_S_ALCOHOL, "Alcohol quantity", true);
		propArray[7] = new ProfileProperty(getTobacco(), PROP_S_TOBACCO, "Tobacco quantity", true);
		propArray[8] = new ProfileProperty(getDrugs(), PROP_S_DRUGS, "Drugs quantity", true);
		propArray[9] = new ProfileProperty(getWeight(), PROP_S_RECOMMENDED_WEIGHT, "Recommended Weight", true);
		//TODO: returns array -- find a way to handle this
		propArray[10] = new ProfileProperty(
				((getDisability() == null) ? 
						new AccessImpairment[] { new AccessImpairment(LevelRating.none)} : getDisability()), 
				PROP_HAS_DISABILITY, "Disability", true);
		propArray[11] = new ProfileProperty(
				((getIllness() == null) ? new Illness() : getIllness()), 
				PROP_HAS_ILLNESS, "Illness", true);
		propArray[12] = new ProfileProperty(
				((getMedicine() == null) ? new Medicine() : getMedicine()), 
				PROP_HAS_MEDICINE, "Medicine", true);
		
		return propArray;
	}

	/**
	 * @return
	 */
	public static HealthProfile loadInstance() {
		HealthProfile hp = new HealthProfile();
		hp.setIllness(Illness.loadInstance());
		hp.setMedicine(Medicine.loadInstance());
		return hp;
	}
	
}

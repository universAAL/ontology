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
package org.universAAL.ontology.profile.health;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological representation of any illness. Methods included in this class are
 * the mandatory ones for representing an ontological concept in Java classes
 * for uAAL. Usually it includes getters and setters for most of its properties.
 * 
 * @author
 * @author Carsten Stockloew
 */
public class Illness extends ManagedIndividual {

    public static final String PROFILING_NAMESPACE = "http://ontology.persona.ratio.it/Illness.owl#";
    public static final String MY_URI;
    public static final String PROP_S_ANEMIA;
    public static final String PROP_S_ASTHMA;
    public static final String PROP_S_CANCER;
    public static final String PROP_S_CHOLESTEROL;
    public static final String PROP_S_HYPERTENSION;
    public static final String PROP_S_DIGESTION_PROB;
    public static final String PROP_S_ALLERGY;
    public static final String PROP_S_ARTERIOPATHY;
    public static final String PROP_S_DIABETES;
    public static final String PROP_S_ISCHEMIC_CARDIOPATHY;
    public static final String PROP_S_DEMENTIA;
    public static final String PROP_S_MALNUTRITION;
    public static final String PROP_S_OSTEOPOROSIS;
    public static final String PROP_S_OVERWEIGHT;
    public static final String PROP_S_METABOLIC_SYNDROME;

    static {
	MY_URI = PROFILING_NAMESPACE + "sIllness";
	PROP_S_ALLERGY = PROFILING_NAMESPACE + "allergy";
	PROP_S_ANEMIA = PROFILING_NAMESPACE + "anemia";
	PROP_S_ARTERIOPATHY = PROFILING_NAMESPACE + "arteriopathy";
	PROP_S_ASTHMA = PROFILING_NAMESPACE + "asthma";
	PROP_S_CANCER = PROFILING_NAMESPACE + "cancer";
	PROP_S_CHOLESTEROL = PROFILING_NAMESPACE + "cholesterol";
	PROP_S_DEMENTIA = PROFILING_NAMESPACE + "dementia";
	PROP_S_DIABETES = PROFILING_NAMESPACE + "diabetes";
	PROP_S_DIGESTION_PROB = PROFILING_NAMESPACE + "digestionProb";
	PROP_S_HYPERTENSION = PROFILING_NAMESPACE + "hypertension";
	PROP_S_MALNUTRITION = PROFILING_NAMESPACE + "malnutrition";
	PROP_S_OSTEOPOROSIS = PROFILING_NAMESPACE + "osteoporosis";
	PROP_S_OVERWEIGHT = PROFILING_NAMESPACE + "overweight";
	PROP_S_METABOLIC_SYNDROME = PROFILING_NAMESPACE + "metabolicSyndrome";
	PROP_S_ISCHEMIC_CARDIOPATHY = PROFILING_NAMESPACE
		+ "ischemicCardiopathy";
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_S_ALLERGY.equals(propURI) && o instanceof Boolean)
	    setAllergy((Boolean) o);
	else if (PROP_S_ANEMIA.equals(propURI) && o instanceof Boolean)
	    setAnemia((Boolean) o);
	else if (PROP_S_ARTERIOPATHY.equals(propURI) && o instanceof Boolean)
	    setArteriopathy((Boolean) o);
	else if (PROP_S_ASTHMA.equals(propURI) && o instanceof Boolean)
	    setAsthma((Boolean) o);
	else if (PROP_S_CANCER.equals(propURI) && o instanceof Boolean)
	    setCancer((Boolean) o);
	else if (PROP_S_CHOLESTEROL.equals(propURI) && o instanceof Boolean)
	    setCholesterol((Boolean) o);
	else if (PROP_S_DEMENTIA.equals(propURI) && o instanceof Boolean)
	    setDementia((Boolean) o);
	else if (PROP_S_DIABETES.equals(propURI) && o instanceof Boolean)
	    setDiabetes((Boolean) o);
	else if (PROP_S_DIGESTION_PROB.equals(propURI) && o instanceof Boolean)
	    setDigestionProb((Boolean) o);
	else if (PROP_S_HYPERTENSION.equals(propURI) && o instanceof Boolean)
	    setHypertension((Boolean) o);
	else if (PROP_S_ISCHEMIC_CARDIOPATHY.equals(propURI)
		&& o instanceof Boolean)
	    setIschemicCardiopathy((Boolean) o);
	else if (PROP_S_MALNUTRITION.equals(propURI) && o instanceof Boolean)
	    setMalnutrition((Boolean) o);
	else if (PROP_S_OSTEOPOROSIS.equals(propURI) && o instanceof Boolean)
	    setOsteoporosis((Boolean) o);
	else if (PROP_S_OVERWEIGHT.equals(propURI) && o instanceof Boolean)
	    setOverweight((Boolean) o);
	else if (PROP_S_METABOLIC_SYNDROME.equals(propURI)
		&& o instanceof Boolean)
	    setMetabolicSyndrome((Boolean) o);
	else
	    super.setProperty(propURI, o);
    }

    public Illness() {
	super();
    }

    public Illness(String uri) {
	super(uri);
    }

    public Boolean getAllergy() {
	Object o = props.get(PROP_S_ALLERGY);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setAllergy(Boolean allergy) {
	props.put(PROP_S_ALLERGY, allergy);
    }

    public Boolean getAnemia() {
	Object o = props.get(PROP_S_ANEMIA);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setAnemia(Boolean anemia) {
	props.put(PROP_S_ANEMIA, anemia);
    }

    public Boolean getArteriopathy() {
	Object o = props.get(PROP_S_ARTERIOPATHY);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setArteriopathy(Boolean arteriopathy) {
	props.put(PROP_S_ARTERIOPATHY, arteriopathy);
    }

    public Boolean getAsthma() {
	Object o = props.get(PROP_S_ASTHMA);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setAsthma(Boolean asthma) {
	props.put(PROP_S_ASTHMA, asthma);
    }

    public Boolean getCancer() {
	Object o = props.get(PROP_S_CANCER);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setCancer(Boolean cancer) {
	props.put(PROP_S_CANCER, cancer);
    }

    public Boolean getCholesterol() {
	Object o = props.get(PROP_S_CHOLESTEROL);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setCholesterol(Boolean cholesterol) {
	props.put(PROP_S_CHOLESTEROL, cholesterol);
    }

    public Boolean getDementia() {
	Object o = props.get(PROP_S_DEMENTIA);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setDementia(Boolean dementia) {
	props.put(PROP_S_DEMENTIA, dementia);
    }

    public Boolean getDiabetes() {
	Object o = props.get(PROP_S_DIABETES);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setDiabetes(Boolean diabetes) {
	props.put(PROP_S_DIABETES, diabetes);
    }

    public Boolean getDigestionProb() {
	Object o = props.get(PROP_S_DIGESTION_PROB);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setDigestionProb(Boolean digestionProb) {
	props.put(PROP_S_DIGESTION_PROB, digestionProb);
    }

    public Boolean getHypertension() {
	Object o = props.get(PROP_S_HYPERTENSION);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setHypertension(Boolean hypertension) {
	props.put(PROP_S_HYPERTENSION, hypertension);
    }

    public Boolean getIschemicCardiopathy() {
	Object o = props.get(PROP_S_ISCHEMIC_CARDIOPATHY);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setIschemicCardiopathy(Boolean ischemicCardiopathy) {
	props.put(PROP_S_ISCHEMIC_CARDIOPATHY, ischemicCardiopathy);
    }

    public Boolean getMalnutrition() {
	Object o = props.get(PROP_S_MALNUTRITION);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setMalnutrition(Boolean isMalnutrition) {
	props.put(PROP_S_MALNUTRITION, isMalnutrition);
    }

    public Boolean getOsteoporosis() {
	Object o = props.get(PROP_S_OSTEOPOROSIS);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setOsteoporosis(Boolean hasOsteoporosis) {
	props.put(PROP_S_OSTEOPOROSIS, hasOsteoporosis);
    }

    public Boolean getOverweiht() {
	Object o = props.get(PROP_S_OVERWEIGHT);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setOverweight(Boolean isOverWeight) {
	props.put(PROP_S_OVERWEIGHT, isOverWeight);
    }

    public Boolean getMetabolicSyndrome() {
	Object o = props.get(PROP_S_METABOLIC_SYNDROME);
	return (o == null) ? Boolean.FALSE : (Boolean) o;
    }

    public void setMetabolicSyndrome(Boolean isMetabolicSyndrome) {
	props.put(PROP_S_METABOLIC_SYNDROME, isMetabolicSyndrome);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.persona.ontology.ManagedIndividual#getPropSerializationType(java.
     * lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.persona.ontology.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return true;
    }

}

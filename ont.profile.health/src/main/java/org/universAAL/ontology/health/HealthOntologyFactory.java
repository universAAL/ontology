/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es - Universidad Politécnica de Madrid
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
package org.universAAL.ontology.health;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.health.owl.ActivityHeartRateRequirement;
import org.universAAL.ontology.health.owl.BloodPressureMeasurementTreatment;
import org.universAAL.ontology.health.owl.BloodPressureRequirement;
import org.universAAL.ontology.health.owl.Diet;
import org.universAAL.ontology.health.owl.HealthProfile;
import org.universAAL.ontology.health.owl.HeartRateMeasurementTreatment;
import org.universAAL.ontology.health.owl.HeartRateRequirement;
import org.universAAL.ontology.health.owl.MeasuredPhysicalActivity;
import org.universAAL.ontology.health.owl.MeasurementRequirements;
import org.universAAL.ontology.health.owl.PerformedMeasurementSession;
import org.universAAL.ontology.health.owl.PerformedSession;
import org.universAAL.ontology.health.owl.PlannedSession;
import org.universAAL.ontology.health.owl.ReposeHeartRateRequirement;
import org.universAAL.ontology.health.owl.TakeMeasurementActivity;
import org.universAAL.ontology.health.owl.TreatmentPlanning;
import org.universAAL.ontology.health.owl.Walking;
import org.universAAL.ontology.health.owl.WeightMeasurementTreatment;
import org.universAAL.ontology.health.owl.WeightRequirement;
import org.universAAL.ontology.health.owl.services.DisplayTreatmentService;
import org.universAAL.ontology.health.owl.services.HealthService;
import org.universAAL.ontology.health.owl.services.PerformedSessionManagementService;
import org.universAAL.ontology.health.owl.services.PlannedSessionManagementService;
import org.universAAL.ontology.health.owl.services.ProfileManagementService;
import org.universAAL.ontology.health.owl.services.TreatmentManagementService;

public class HealthOntologyFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new BloodPressureRequirement(instanceURI);
	case 1:
	    return new MeasuredPhysicalActivity(instanceURI);
	case 2:
	    return new MeasurementRequirements(instanceURI);
	case 3:
	    return new WeightRequirement(instanceURI);
	case 4:
	    return new PlannedSession(instanceURI);
	case 5:
	    return new PerformedMeasurementSession(instanceURI);
	case 8:
	    return new HeartRateRequirement(instanceURI);
	case 9:
	    return new TakeMeasurementActivity(instanceURI);
	case 11:
	    return new TreatmentPlanning(instanceURI);
	case 12:
	    return new HealthProfile(instanceURI);
	case 13:
	    return new PerformedSession(instanceURI);
	case 14:
//	    return new DiastolicBloodPressureRequirement(instanceURI);
	case 15:
//	    return new SystolicBloodPressureRequirement(instanceURI);
	case 16:
	    return new ActivityHeartRateRequirement(instanceURI);
	case 17:
	    return new ReposeHeartRateRequirement(instanceURI);
	case 20:
	    return new PerformedSessionManagementService(instanceURI);
	case 32:
	    return new Diet(instanceURI);
	case 33:
	    return new WeightMeasurementTreatment(instanceURI);
	case 34:
	    return new Walking(instanceURI);
	case 35:
	    return new BloodPressureMeasurementTreatment(instanceURI);
	case 36:
	    return new HeartRateMeasurementTreatment(instanceURI);
	case 41:
	    return new HealthService(instanceURI);
	case 42:
	    return new TreatmentManagementService(instanceURI);
	case 43:
	    return new PlannedSessionManagementService(instanceURI);
	case 44:
	    return new PerformedSessionManagementService(instanceURI);
	case 45:
	    return new ProfileManagementService(instanceURI);
	case 46:
	    return new DisplayTreatmentService(instanceURI);
	}
	return null;
    }
}

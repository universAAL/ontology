package org.universAAL.ontology;

/**Copyright [2011-2014] [University of Siegen, Embedded System Instiute]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

 * @author <a href="mailto:abu.sadat@uni-siegen.de">Rubaiyat Sadat</a>
 *	       ©2012
 */


import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.dependability.Symptom;
import org.universAAL.ontology.dependability.DirectFault;
import org.universAAL.ontology.dependability.ErrorDetector;
import org.universAAL.ontology.dependability.NonParametricFault;
import org.universAAL.ontology.dependability.SoftwareFault;
import org.universAAL.ontology.dependability.InteractionFault;
import org.universAAL.ontology.dependability.StructuralFault;
import org.universAAL.ontology.dependability.InternalCauseFault;
import org.universAAL.ontology.dependability.PermanentFault;
import org.universAAL.ontology.dependability.IntermittentFault;
import org.universAAL.ontology.dependability.EarlyTimingFault;
import org.universAAL.ontology.dependability.ContinuedFault;
import org.universAAL.ontology.dependability.RecoveryAction;
import org.universAAL.ontology.dependability.Fault;
import org.universAAL.ontology.dependability.ShapeFault;
import org.universAAL.ontology.dependability.ExternalFault;
import org.universAAL.ontology.dependability.Sensor;
import org.universAAL.ontology.dependability.ParametricFault;
import org.universAAL.ontology.dependability.ValueFault;
import org.universAAL.ontology.dependability.OperationalFault;
import org.universAAL.ontology.dependability.PhysicalFault;
import org.universAAL.ontology.dependability.FCR;
import org.universAAL.ontology.dependability.TimingFault;
import org.universAAL.ontology.dependability.IndirectFault;
import org.universAAL.ontology.dependability.LateTimingFault;
import org.universAAL.ontology.dependability.PropertyFault;
import org.universAAL.ontology.dependability.DevelopmentFault;
import org.universAAL.ontology.dependability.TransientFault;
import org.universAAL.ontology.dependability.NonMaliciousFault;

public class DependabilityFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new Symptom(instanceURI);
	case 1:
	    return new DirectFault(instanceURI);
	case 2:
	    return new ErrorDetector(instanceURI);
	case 3:
	    return new NonParametricFault(instanceURI);
	case 4:
	    return new SoftwareFault(instanceURI);
	case 5:
	    return new InteractionFault(instanceURI);
	case 6:
	    return new StructuralFault(instanceURI);
	case 7:
	    return new InternalCauseFault(instanceURI);
	case 8:
	    return new PermanentFault(instanceURI);
	case 9:
	    return new IntermittentFault(instanceURI);
	case 10:
	    return new EarlyTimingFault(instanceURI);
	case 11:
	    return new ContinuedFault(instanceURI);
	case 12:
	    return new RecoveryAction(instanceURI);
	case 13:
	    return new Fault(instanceURI);
	case 14:
	    return new ShapeFault(instanceURI);
	case 15:
	    return new ExternalFault(instanceURI);
	case 16:
	    return new Sensor(instanceURI);
	case 17:
	    return new ParametricFault(instanceURI);
	case 18:
	    return new ValueFault(instanceURI);
	case 19:
	    return new OperationalFault(instanceURI);
	case 20:
	    return new PhysicalFault(instanceURI);
	case 21:
	    return new FCR(instanceURI);
	case 22:
	    return new TimingFault(instanceURI);
	case 23:
	    return new IndirectFault(instanceURI);
	case 24:
	    return new LateTimingFault(instanceURI);
	case 25:
	    return new PropertyFault(instanceURI);
	case 26:
	    return new DevelopmentFault(instanceURI);
	case 27:
	    return new TransientFault(instanceURI);
	case 28:
	    return new NonMaliciousFault(instanceURI);

	}
	return null;
    }
}

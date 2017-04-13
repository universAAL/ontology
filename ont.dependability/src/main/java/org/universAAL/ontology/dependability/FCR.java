package org.universAAL.ontology.dependability;
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
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;

public class FCR extends ManagedIndividual {
    public static final String MY_URI = DependabilityOntology.NAMESPACE + "FCR";
    public static final String PROP_LOCATION = DependabilityOntology.NAMESPACE
	    + "location";
    public static final String PROP_FAULT = DependabilityOntology.NAMESPACE
	    + "fault";

    public FCR() {
	super();
    }

    public FCR(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_LOCATION.equals(propURI) || PROP_FAULT.equals(propURI))
	    return Resource.PROP_SERIALIZATION_FULL;
	return Resource.PROP_SERIALIZATION_UNDEFINED;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_LOCATION) && hasProperty(PROP_FAULT);
    }

    public Fault getFault() {
	return (Fault) getProperty(PROP_FAULT);
    }

    public void setFault(Fault newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_FAULT, newPropValue);
    }

    public String getLocation() {
	return (String) getProperty(PROP_LOCATION);
    }

    public void setLocation(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_LOCATION, newPropValue);
    }
}

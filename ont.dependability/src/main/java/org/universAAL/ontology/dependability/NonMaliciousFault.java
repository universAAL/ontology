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
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class NonMaliciousFault extends Fault {
    public static final String MY_URI = DependabilityOntology.NAMESPACE
	    + "NonMaliciousFault";

    public NonMaliciousFault() {
	super();
    }

    public NonMaliciousFault(String uri) {
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
	return true;
    }
}

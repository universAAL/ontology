
package org.universAAL.ontology.osgi;
/**Copyright [2011-2012] [University of Siegen, Embedded System Instiute]

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

/**
 * The activator class for Dependability Ontology
 */
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.dependability.*;


public class Activator implements BundleActivator {

  static BundleContext context = null;
  
  DependabilityOntology _dependabilityontology = new DependabilityOntology();
  
  

  public void start(BundleContext context) throws Exception {
    Activator.context = context;
    
    OntologyManagement.getInstance().register(_dependabilityontology);
    
  }

  public void stop(BundleContext arg0) throws Exception {
    
    OntologyManagement.getInstance().unregister(_dependabilityontology);
    
  }
}	

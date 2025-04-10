/**
 * 
 */
package org.universAAL.ontology.lddi.config.valueMapping;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OntClassInfo;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.lddi.config.datapoints.LDDIDatapointsOntology;

/**
 * @author mtazari
 *
 */
public class ComponentMapper extends ManagedIndividual {
	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + ComponentMapper.class.getSimpleName();
	
	private String myCGWclassName = null;

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return Resource.PROP_SERIALIZATION_FULL;
	}
	
	boolean setCGWclassName (String cgwClass) {
		if (cgwClass == null)
			return false;
		
		if (myCGWclassName == null) {
			myCGWclassName = cgwClass;
			return true;
		}
		
		return cgwClass.equals(myCGWclassName);
	}

	public boolean setProperty(String prop, Object val) {
		if (prop != null  &&  val instanceof DatapointMapper) {
			OntClassInfo oci = OntologyManagement.getInstance().getOntClassInfo(prop);
			if (oci == null  ||  !((DatapointMapper) val).setOntClassInfo(oci))
				return false;
			props.put(prop, val);
			return true;
		} else
			return false;
	}
}

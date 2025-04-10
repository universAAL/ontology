/**
 * 
 */
package org.universAAL.ontology.lddi.config.valueMapping;

import java.util.Enumeration;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OntClassInfo;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.lddi.config.datapoints.LDDIDatapointsOntology;

/**
 * @author mtazari
 *
 */
public class DatapointMapper extends ManagedIndividual {
	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + DatapointMapper.class.getSimpleName();
	
	private OntClassInfo myType = null;

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return Resource.PROP_SERIALIZATION_FULL;
	}
	
	boolean setOntClassInfo (OntClassInfo oci) {
		if (oci == null)
			return false;
		
		if (myType == null) {
			for (Enumeration e = props.keys();  e.hasMoreElements(); )
				if (oci.getDeclaredProperty(e.nextElement().toString()) == null)
					return false;
			myType = oci;
			return true;
		}
		
		return oci == myType;
	}

	public boolean setProperty(String prop, Object val) {
		if (prop != null  &&  val instanceof DPvalueMap) {
			if (myType != null  &&  myType.getDeclaredProperty(prop) == null)
				return false;
			props.put(prop, val);
			return true;
		} else
			return false;
	}
}

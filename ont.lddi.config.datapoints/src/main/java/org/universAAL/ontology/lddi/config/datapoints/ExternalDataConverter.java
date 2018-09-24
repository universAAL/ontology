/**
 * 
 */
package org.universAAL.ontology.lddi.config.datapoints;

/**
 * @author mtazari
 *
 */
public interface ExternalDataConverter {

	public Object exportValue(String typeURI, String propURI, Object internalValue);
	public Object importValue(Object externalValue, String typeURI, String propURI);

	public String toString(String typeURI, String propURI, Object internalValue);
	public Object valueOf(String internalValue, String typeURI, String propURI);
	
}

/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
	Copyright 2008-2010 ITACA-TSB, http://www.tsb.upv.es
        Instituto Tecnologico de Aplicaciones de Comunicacion 
        Avanzadas - Grupo Tecnologias para la Salud y el 
        Bienestar (TSB)
	
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
package org.universAAL.ontology.location.address;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.location.outdoor.*;

/**
 * Ontological representation of an Address. It can be used on its own but it is
 * recommended to use one of its subclasses. Methods included in this class are
 * the mandatory ones for representing an ontological concept in Java classes
 * for uAAL. Usually it includes getters and setters for most of its properties.
 * 
 * @author alfiva
 * 
 */
public class Address extends ManagedIndividual {

    public static final String MY_URI = LocationOntology.NAMESPACE + "Address";
    public static final String PROP_HAS_REGION = LocationOntology.NAMESPACE + "hasAddressRegion";
    public static final String PROP_HAS_COUNTRY = LocationOntology.NAMESPACE + "hasAddressCountry";
    public static final String PROP_HAS_STATE = LocationOntology.NAMESPACE + "hasAddressState";
    public static final String PROP_HAS_CITY = LocationOntology.NAMESPACE + "hasAddressCity";
    public static final String PROP_HAS_CITYQUARTER = LocationOntology.NAMESPACE
    		+ "hasAddressCityQuarter";
    public static final String PROP_HAS_CITYREGION = LocationOntology.NAMESPACE
    		+ "hasAddressCityRegion";
    public static final String PROP_HAS_CITYPLACE = LocationOntology.NAMESPACE + "hasAddressCityPlace";
    public static final String PROP_HAS_POSTALCODE = LocationOntology.NAMESPACE
    		+ "hasAddressPostalCode";
    public static final String PROP_HAS_EXTENDEDADDRESS = LocationOntology.NAMESPACE
    		+ "hasExtendedAddressDescription";


    /**
     * Creates a Address object
     */
    public Address() {
    }

    /**
     * Creates a Address object
     * 
     * @param uri
     *            the object URI
     */
    public Address(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_HAS_EXTENDEDADDRESS.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }

    /**
     * Gets the Region value of the Address
     * 
     * @return The Region value
     */
    public Region getRegion() {
	return (Region) props.get(PROP_HAS_REGION);
    }

    /**
     * Sets the Region value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setRegion(Region reg) {
	props.put(PROP_HAS_REGION, reg);
    }

    /**
     * Gets the Country value of the Address
     * 
     * @return The Country value
     */
    public Country getCountry() {
	return (Country) props.get(PROP_HAS_COUNTRY);
    }

    /**
     * Sets the Country value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCountry(Country val) {
	props.put(PROP_HAS_COUNTRY, val);
    }

    /**
     * Gets the State value of the Address
     * 
     * @return The State value
     */
    public State getState() {
	return (State) props.get(PROP_HAS_STATE);
    }

    /**
     * Sets the State value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setState(State val) {
	props.put(PROP_HAS_STATE, val);
    }

    /**
     * Gets the City value of the Address
     * 
     * @return The City value
     */
    public City getCity() {
	return (City) props.get(PROP_HAS_CITY);
    }

    /**
     * Sets the City value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCity(City val) {
	props.put(PROP_HAS_CITY, val);
    }

    /**
     * Gets the CityQuarter value of the Address
     * 
     * @return The CityQuarter value
     */
    public CityQuarter getCityQuarter() {
	return (CityQuarter) props.get(PROP_HAS_CITYQUARTER);
    }

    /**
     * Sets the CityQuarter value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCityQuarter(CityQuarter val) {
	props.put(PROP_HAS_CITYQUARTER, val);
    }

    /**
     * Gets the CityRegion value of the Address
     * 
     * @return The CityRegion value
     */
    public CityRegion getCityRegion() {
	return (CityRegion) props.get(PROP_HAS_CITYREGION);
    }

    /**
     * Sets the CityRegion value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCityRegion(CityRegion val) {
	props.put(PROP_HAS_CITYREGION, val);
    }

    /**
     * Gets the CityPlace value of the Address
     * 
     * @return The CityPlace value
     */
    public CityPlace getCityPlace() {
	return (CityPlace) props.get(PROP_HAS_CITYPLACE);
    }

    /**
     * Sets the CityPlace value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setCityPlace(CityPlace val) {
	props.put(PROP_HAS_CITYPLACE, val);
    }

    /**
     * Gets the PostalCode value of the Address
     * 
     * @return The PostalCode value
     */
    public String getPostalCode() {
	return (String) props.get(PROP_HAS_POSTALCODE);
    }

    /**
     * Sets the PostalCode value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setPostalCode(String val) {
	props.put(PROP_HAS_POSTALCODE, val);
    }

    /**
     * Gets the External Address value of the Address
     * 
     * @return The External Address value
     */
    public String getExtAddress() {
	return (String) props.get(PROP_HAS_EXTENDEDADDRESS);
    }

    /**
     * Sets the ExternalAddress value of the Address
     * 
     * @param reg
     *            The value to set
     */
    public void setExtAddress(String val) {
	props.put(PROP_HAS_EXTENDEDADDRESS, val);
    }

    /**
     * Returns a printable summary of the Address with all its values.
     * 
     * @return A string with the Address values. May have several lines.
     */
    public String toReadableString() {
	StringBuilder address = new StringBuilder();
	StringBuilder cities = new StringBuilder();

	if (this.getCityPlace() != null) {
	    cities.append(this.getCityPlace());
	}
	if (this.getCityQuarter() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCityQuarter());
	}
	if (this.getCityRegion() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCityRegion());
	}
	if (this.getCity() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCity());
	}
	if (cities.length() > 0)
	    cities.append("\n");
	if (this.getRegion() != null) {
	    cities.append(this.getRegion());
	}
	if (this.getState() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getState());
	}
	if (this.getCountry() != null) {
	    if (cities.length() > 0)
		cities.append(", ");
	    cities.append(this.getCountry());
	}
	if (this.getPostalCode() != null)
	    address.append(this.getPostalCode() + ". \n");
	if (cities.length() > 0)
	    address.append(cities.toString() + ".\n");
	if (this.getExtAddress() != null)
	    address.append(this.getExtAddress() + ". \n");

	return address.toString();
    }

}

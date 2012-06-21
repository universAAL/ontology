/*******************************************************************************
 * Copyright 2012 UPM - Universidad Politécnica de Madrid
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
package org.universAAL.ontology.owl;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.UnitOntology;

public class Prefix extends ManagedIndividual {
  public static final String MY_URI = UnitOntology.NAMESPACE
    + "Prefix";
  public static final String PROP_NAME = UnitOntology.NAMESPACE
    + "name";
  public static final String PROP_POWER = UnitOntology.NAMESPACE
    + "power";
  public static final String PROP_BASE = UnitOntology.NAMESPACE
    + "base";
  public static final String PROP_SYMBOL = UnitOntology.NAMESPACE
    + "symbol";


  public Prefix () {
    super();
  }
  
  public Prefix (String uri) {
    super(uri);
  }
  
  public  Prefix(String uri, String name, String symbol, int base, int power) {
	super(uri);
	setName(name);
	setSymbol(symbol);
	setBase(base);
	setPower(power);
}

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	
	return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_NAME)
      && hasProperty(PROP_POWER)
      && hasProperty(PROP_BASE)
      && hasProperty(PROP_SYMBOL);
  }

  public String getName() {
    return (String)getProperty(PROP_NAME);
  }		

  private void setName(String newPropValue) {
    if (newPropValue != null)
      setProperty(PROP_NAME, newPropValue);
  }		

  public Integer getPower() {
    return (Integer)getProperty(PROP_POWER);
  }		

  private void setPower(Integer newPropValue) {
    if (newPropValue != null)
      setProperty(PROP_POWER, newPropValue);
  }		

  public String getSymbol() {
    return (String)getProperty(PROP_SYMBOL);
  }		

  private void setSymbol(String newPropValue) {
    if (newPropValue != null)
      setProperty(PROP_SYMBOL, newPropValue);
  }		

  public Integer getBase() {
    return (Integer)getProperty(PROP_BASE);
  }		

  private void setBase(Integer newPropValue) {
    if (newPropValue != null)
      setProperty(PROP_BASE, newPropValue);
  }		
}

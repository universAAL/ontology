/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 Universidad Politécnica de Madrid
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
package org.universaal.ontology.owl;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;

/**
 * This class describes the concept of ChoiceLabel, its properties 
 * and its associated methods.
 * A "choice-label" is the composition of a label associated to a choice.
 * @author mdelafuente
 *
 */
public class ChoiceLabel extends ManagedIndividual {
  
//NAMESPACE AND PROPERTIES
	public static final String MY_URI = QuestionnaireOntology.NAMESPACE
    + "ChoiceLabel";
  public static final String PROP_CHOICE = QuestionnaireOntology.NAMESPACE
    + "choice";
  public static final String PROP_LABEL = QuestionnaireOntology.NAMESPACE
    + "label";

//CONSTRUCTORS
  public ChoiceLabel () {
    super();
  }
  
  public ChoiceLabel (String uri) {
    super(uri);
  }

  public ChoiceLabel(Object choice, String label){
	  this.setChoice(choice);
	  this.setLabel(label);
	  
  }
  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove 
	return 0;
  }

  public boolean isWellFormed() {
	return true 
      && props.containsKey(PROP_CHOICE)
      && props.containsKey(PROP_LABEL);
  }

  //GETTERS AND SETTERS
  /**
   * The following method gets the choice, that is Object type (integer, boolean, String...),
   * to which the label will be related to.
   * @return choice ({@link Resource})
   */
  public Object getChoice() {
    return (Object)props.get(PROP_CHOICE);
  }		

  /**
   * The following method sets the choice, that is Object type (integer, boolean, String...),
   * to which the label will be related to.
   * @param choice ({@link Resource})
   */
  public void setChoice(Object choice) {
    if (choice != null)
      props.put(PROP_CHOICE, choice);
  }		

  /**
   * The following method gets the label, that is the String that
   * identifies a choice
   * @return label 
   */
  public String getLabel() {
    return (String)props.get(PROP_LABEL);
  }		

  /**
   * The following method sets the label, that is the String that
   * identifies a choice
   * @param label ({@link String})
   */
  public void setLabel(String label) {
    if (label != null)
      props.put(PROP_LABEL, label);
  }		

}

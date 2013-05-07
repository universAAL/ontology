/*******************************************************************************
 * Copyright 2013 2011 Universidad Polit�cnica de Madrid
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
package org.universAAL.ontology.test;

import junit.framework.TestCase;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.LanguageFactory;
import org.universAAL.ontology.language.LanguageOntology;

/**
 * @author amedrano
 *
 */
public class FactoryTest extends TestCase {
	
	public void setUp(){
		OntologyManagement.getInstance().register(null, new DataRepOntology());
		OntologyManagement.getInstance().register(null, new LanguageOntology());
	}

	public void test1(){
		assertNotNull(getClass().getClassLoader().getResource(LanguageOntology.LANG_TABLE));
		LanguageFactory lf = new LanguageFactory(getClass().getClassLoader().getResource(LanguageOntology.LANG_TABLE));
		assertNotNull(lf.createInstance("", "", 5));
	}
	
}

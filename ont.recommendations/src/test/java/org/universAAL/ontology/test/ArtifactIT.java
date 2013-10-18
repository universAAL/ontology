package org.universAAL.ontology.test;

import java.util.Dictionary;
import java.util.Enumeration;

import org.universAAL.itests.IntegrationTest;

/**
 * Here developer's of this artifact should code their integration tests.
 * 
 */
public class ArtifactIT extends IntegrationTest {

    public void testComposite() {
    	
    	Dictionary d = bundleContext.getBundle(2).getHeaders();
    	Enumeration e = d.keys();
    	while (e.hasMoreElements()) {
			Object k = (Object) e.nextElement();
			System.out.println(k.toString() + " : " + d.get(k));
		}
	logAllBundles();
    }

}

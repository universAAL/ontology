package org.universAAL.ontology.test;

import java.util.Dictionary;

import org.universAAL.itests.IntegrationTest;

/**
 * Here developer's of this artifact should code their integration tests.
 * 
 */
public class ArtifactIntegrationTest extends IntegrationTest {

    public void testComposite() {
    	
    	Dictionary d = bundleContext.getBundle(2).getHeaders();
    	while (d.keys().hasMoreElements()) {
			Object k = (Object) d.keys().nextElement();
			System.out.println(k.toString() + " : " + d.get(k));
		}
	logAllBundles();
    }

}

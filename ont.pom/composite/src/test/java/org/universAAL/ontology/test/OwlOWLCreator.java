package org.universAAL.ontology.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.RDFXMLOntologyFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.serialization.MessageContentSerializer;

public class OwlOWLCreator {

    private static MessageContentSerializer contentSerializer = null;

    // public static void main(String[] args) {
    public static boolean doit(Ontology ontology) {
	if (contentSerializer == null) {
	    contentSerializer = (MessageContentSerializer) Activator.mc
		    .getContainer().fetchSharedObject(
			    Activator.mc,
			    new Object[] { MessageContentSerializer.class
				    .getName() });
	    if (contentSerializer == null) {
		System.out
			.println("ERROR: no serializer found for serializing the ontology");
		return false;
	    }
	}

	String name = ontology.getInfo().getFilename();
	if (name.endsWith(".owl")) // remove ".owl" at the end
	    name = name.substring(0, name.length() - 4);
	if (name == null)
	    name = Integer.toHexString(new Random(System.currentTimeMillis())
		    .nextInt());

	name = "target\\" + name;
	String nameTtl = name + ".ttl";
	String nameOwl = name + ".owl";

	String serializedOntology = contentSerializer.serialize(ontology);
	try {
	    BufferedWriter out = new BufferedWriter(new FileWriter(nameTtl,
		    false));
	    out.write(serializedOntology);
	    out.close();
	} catch (IOException e) {
	    System.out.println("Exception " + e);
	    return false;
	}

	File outFile = new File(nameOwl);
	File file = new File(nameTtl);
	// try {
	// System.out.println("   File OWL: " + outFile.getCanonicalPath());
	// System.out.println("   File TTL: " + file.getCanonicalPath());
	// } catch (IOException e2) {
	// e2.printStackTrace();
	// }
	OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
	IRI documentIRI = IRI.create(file);
	OWLOntology owlOntology;
	try {
	    owlOntology = manager.loadOntologyFromOntologyDocument(documentIRI);
	    System.out.println("   Loaded ontology: " + owlOntology);

	    OWLOntologyFormat format = manager.getOntologyFormat(owlOntology);

	    RDFXMLOntologyFormat rdfxmlFormat = new RDFXMLOntologyFormat();
	    if (format.isPrefixOWLOntologyFormat()) {
		rdfxmlFormat.copyPrefixesFrom(format
			.asPrefixOWLOntologyFormat());
	    }
	    manager.saveOntology(owlOntology, rdfxmlFormat, IRI.create(outFile));
	    System.out.println("   Saved ontology " + owlOntology + " in file "
		    + nameOwl);
	} catch (OWLOntologyCreationException e1) {
	    e1.printStackTrace();
	    return false;
	} catch (OWLOntologyStorageException e) {
	    e.printStackTrace();
	    return false;
	}

	return true;
    }
}

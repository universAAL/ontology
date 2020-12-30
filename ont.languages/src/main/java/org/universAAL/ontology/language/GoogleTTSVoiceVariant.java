package org.universAAL.ontology.language;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Represents a Google TTs voice variant. The IDs of these voice variants are
 * built according to the following pattern:
 * <code>            langCode-voiceQuality-variantSuffix</code> where
 * 'voiceQuality' is either 'Standard' or 'Wavenet' and 'variantSuffix' is a
 * letter starting from 'A', which endoces info items, such as voice gender,
 * accent and stressing manner. The variant ID is supposed to be used as the
 * local name in the URI of each instance.
 */
public class GoogleTTSVoiceVariant extends ManagedIndividual {
	public static final String MY_URI = LanguageOntology.NAMESPACE + "GoogleTTSVoiceVariant";
	public static final String PROP_IS_MALE_VOICE = LanguageOntology.NAMESPACE + "isMaleVoice";

	public GoogleTTSVoiceVariant() {
		super();
	}

	public GoogleTTSVoiceVariant(String uri) {
		super(uri);
	}

	public GoogleTTSVoiceVariant(String voiceVariantID, boolean isMaleVoice) {
		super(LanguageOntology.NAMESPACE + voiceVariantID);
		if (isMaleVoice)
			props.put(PROP_IS_MALE_VOICE, Boolean.TRUE);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public GoogleTTSLang getTheLang() {
		return GoogleTTSLang.getLanguage(getTheLangCode());
	}

	public String getTheLangCode() {
		String ln = getLocalName();
		int i = ln.indexOf("-Standard-");
		if (i < 0)
			i = ln.indexOf("-Wavenet-");
		return (i < 0) ? null : ln.substring(0, i);
	}

	public boolean isMaleVoice() {
		return Boolean.TRUE.equals(props.get(PROP_IS_MALE_VOICE));
	}

	public boolean isWellFormed() {
		return getTheLang() != null;
	}
}

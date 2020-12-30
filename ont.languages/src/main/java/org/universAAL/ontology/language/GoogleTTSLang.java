package org.universAAL.ontology.language;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Captures info available under
 * https://cloud.google.com/text-to-speech/docs/voices The lang code in the
 * above reference is supposed to be used as the local name in the URI of each
 * instance. This implementation already provides all instances of languages
 * with Google TTS support as of Dec 29, 2020.
 */
public class GoogleTTSLang extends ManagedIndividual {
	public static final String MY_URI = LanguageOntology.NAMESPACE + "GoogleTTSLang";
	public static final String PROP_NAME = LanguageOntology.NAMESPACE + "langName";
	public static final String PROP_TTS_SUPPORT_MALE = LanguageOntology.NAMESPACE + "ttsSupportMale";
	public static final String PROP_TTS_SUPPORT_FEMALE = LanguageOntology.NAMESPACE + "ttsSupportFemale";

	private static LinkedHashMap individuals = new LinkedHashMap(50);

	public static Collection supportedLanguages() {
		return individuals.values();
	}

	public static GoogleTTSLang getLanguage(String langCode) {
		Object o = individuals.get(langCode);
		while (!(o instanceof GoogleTTSLang)) {
			int i = langCode.lastIndexOf('-');
			if (i < 0)
				return null;
			langCode = langCode.substring(0, i);
			o = individuals.get(langCode);
		}
		return (GoogleTTSLang) o;
	}

	public static GoogleTTSLang getLanguage(Locale l) {
		return (l == null) ? null : getLanguage(l.toLanguageTag());
	}

	static {
		new GoogleTTSLang("Arabic", new GoogleTTSVoiceVariant[] { 
				new GoogleTTSVoiceVariant("ar-XA-Standard-A", false),
				new GoogleTTSVoiceVariant("ar-XA-Standard-B", true),
				new GoogleTTSVoiceVariant("ar-XA-Standard-C", true),
				new GoogleTTSVoiceVariant("ar-XA-Standard-D", false),
				new GoogleTTSVoiceVariant("ar-XA-Wavenet-A", false), 
				new GoogleTTSVoiceVariant("ar-XA-Wavenet-B", true),
				new GoogleTTSVoiceVariant("ar-XA-Wavenet-C", true) 
				});
		new GoogleTTSLang("Bengali (India)", new GoogleTTSVoiceVariant[] { 
				new GoogleTTSVoiceVariant("bn-IN-Standard-A", false),
				new GoogleTTSVoiceVariant("bn-IN-Standard-B", true)
				});
		new GoogleTTSLang("Mandarin Chinese (CN)", new GoogleTTSVoiceVariant[] { 
				new GoogleTTSVoiceVariant("cmn-CN-Standard-A", false),
				new GoogleTTSVoiceVariant("cmn-CN-Standard-B", true),
				new GoogleTTSVoiceVariant("cmn-CN-Standard-C", true),
				new GoogleTTSVoiceVariant("cmn-CN-Standard-D", false),
				new GoogleTTSVoiceVariant("cmn-CN-Wavenet-A", false),
				new GoogleTTSVoiceVariant("cmn-CN-Wavenet-B", true),
				new GoogleTTSVoiceVariant("cmn-CN-Wavenet-C", true),
				new GoogleTTSVoiceVariant("cmn-CN-Wavenet-D", false)
				});
		new GoogleTTSLang("Mandarin Chinese (TW)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("cmn-TW-Standard-A", false),
				new GoogleTTSVoiceVariant("cmn-TW-Standard-B", true),
				new GoogleTTSVoiceVariant("cmn-TW-Standard-C", true),
				new GoogleTTSVoiceVariant("cmn-TW-Wavenet-A", false),
				new GoogleTTSVoiceVariant("cmn-TW-Wavenet-B", true),
				new GoogleTTSVoiceVariant("cmn-TW-Wavenet-C", true)
				});
		new GoogleTTSLang("Czech (Czech Republic)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("cs-CZ-Standard-A", false),
				new GoogleTTSVoiceVariant("cs-CZ-Wavenet-A", false)
				});
		new GoogleTTSLang("Danish (Denmark)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("da-DK-Standard-A", false),
				new GoogleTTSVoiceVariant("da-DK-Standard-C", true),
				new GoogleTTSVoiceVariant("da-DK-Standard-D", false),
				new GoogleTTSVoiceVariant("da-DK-Standard-E", false),
				new GoogleTTSVoiceVariant("da-DK-Wavenet-A", false),
				new GoogleTTSVoiceVariant("da-DK-Wavenet-C", true),
				new GoogleTTSVoiceVariant("da-DK-Wavenet-D", false),
				new GoogleTTSVoiceVariant("da-DK-Wavenet-E", false) });
		new GoogleTTSLang("German (Germany)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("de-DE-Standard-A", false),
				new GoogleTTSVoiceVariant("de-DE-Standard-B", true),
				new GoogleTTSVoiceVariant("de-DE-Standard-E", true),
				new GoogleTTSVoiceVariant("de-DE-Standard-F", false),
				new GoogleTTSVoiceVariant("de-DE-Wavenet-A", false),
				new GoogleTTSVoiceVariant("de-DE-Wavenet-B", true),
				new GoogleTTSVoiceVariant("de-DE-Wavenet-C", false),
				new GoogleTTSVoiceVariant("de-DE-Wavenet-D", true),
				new GoogleTTSVoiceVariant("de-DE-Wavenet-E", true),
				new GoogleTTSVoiceVariant("de-DE-Wavenet-F", false)
				});
		new GoogleTTSLang("Greek (Greece)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("el-GR-Standard-A", false),
				new GoogleTTSVoiceVariant("el-GR-Wavenet-A", false)
				});
		new GoogleTTSLang("English (Australia)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("en-AU-Standard-A", false),
				new GoogleTTSVoiceVariant("en-AU-Standard-B", true),
				new GoogleTTSVoiceVariant("en-AU-Standard-C", false),
				new GoogleTTSVoiceVariant("en-AU-Standard-D", true),
				new GoogleTTSVoiceVariant("en-AU-Wavenet-A", false),
				new GoogleTTSVoiceVariant("en-AU-Wavenet-B", true),
				new GoogleTTSVoiceVariant("en-AU-Wavenet-C", false),
				new GoogleTTSVoiceVariant("en-AU-Wavenet-D", true)
				});
		new GoogleTTSLang("English (UK)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("en-GB-Standard-A", false),
				new GoogleTTSVoiceVariant("en-GB-Standard-B", true),
				new GoogleTTSVoiceVariant("en-GB-Standard-C", false),
				new GoogleTTSVoiceVariant("en-GB-Standard-D", true),
				new GoogleTTSVoiceVariant("en-GB-Standard-F", false),
				new GoogleTTSVoiceVariant("en-GB-Wavenet-A", false),
				new GoogleTTSVoiceVariant("en-GB-Wavenet-B", true),
				new GoogleTTSVoiceVariant("en-GB-Wavenet-C", false),
				new GoogleTTSVoiceVariant("en-GB-Wavenet-D", true),
				new GoogleTTSVoiceVariant("en-GB-Wavenet-F", false)
				});
		new GoogleTTSLang("English (India)", new GoogleTTSVoiceVariant[] { 
				new GoogleTTSVoiceVariant("en-IN-Standard-A", false),
				new GoogleTTSVoiceVariant("en-IN-Standard-B", true),
				new GoogleTTSVoiceVariant("en-IN-Standard-C", false),
				new GoogleTTSVoiceVariant("en-IN-Standard-D", true),
				new GoogleTTSVoiceVariant("en-IN-Wavenet-A", false),
				new GoogleTTSVoiceVariant("en-IN-Wavenet-B", true),
				new GoogleTTSVoiceVariant("en-IN-Wavenet-C", false),
				new GoogleTTSVoiceVariant("en-IN-Wavenet-D", true)
				});
		new GoogleTTSLang("English (US)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("en-US-Standard-B", false),
				new GoogleTTSVoiceVariant("en-US-Standard-C", true),
				new GoogleTTSVoiceVariant("en-US-Standard-D", false),
				new GoogleTTSVoiceVariant("en-US-Standard-E", true),
				new GoogleTTSVoiceVariant("en-US-Standard-G", true),
				new GoogleTTSVoiceVariant("en-US-Standard-H", true),
				new GoogleTTSVoiceVariant("en-US-Standard-I", false),
				new GoogleTTSVoiceVariant("en-US-Standard-J", false),
				new GoogleTTSVoiceVariant("en-US-Wavenet-A", false),
				new GoogleTTSVoiceVariant("en-US-Wavenet-B", false),
				new GoogleTTSVoiceVariant("en-US-Wavenet-C", true),
				new GoogleTTSVoiceVariant("en-US-Wavenet-D", false),
				new GoogleTTSVoiceVariant("en-US-Wavenet-E", true),
				new GoogleTTSVoiceVariant("en-US-Wavenet-F", true),
				new GoogleTTSVoiceVariant("en-US-Wavenet-G", true),
				new GoogleTTSVoiceVariant("en-US-Wavenet-H", true),
				new GoogleTTSVoiceVariant("en-US-Wavenet-I", false),
				new GoogleTTSVoiceVariant("en-US-Wavenet-J", false)
				});
		new GoogleTTSLang("Spanish (Spain)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("es-ES-Standard-A", false),
				new GoogleTTSVoiceVariant("es-ES-Standard-B", true),
				new GoogleTTSVoiceVariant("es-ES-Wavenet-B", true)
				});
		new GoogleTTSLang("Finnish (Finland)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("fi-FI-Standard-A", false),
				new GoogleTTSVoiceVariant("fi-FI-Wavenet-A", false)
				});
		new GoogleTTSLang("Filipino (Philippines)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("fil-PH-Standard-A", false),
				new GoogleTTSVoiceVariant("fil-PH-Standard-B", false),
				new GoogleTTSVoiceVariant("fil-PH-Standard-C", true),
				new GoogleTTSVoiceVariant("fil-PH-Standard-D", true),
				new GoogleTTSVoiceVariant("fil-PH-Wavenet-A", false),
				new GoogleTTSVoiceVariant("fil-PH-Wavenet-B", false),
				new GoogleTTSVoiceVariant("fil-PH-Wavenet-C", true),
				new GoogleTTSVoiceVariant("fil-PH-Wavenet-D", true)
				});
		new GoogleTTSLang("French (Canada)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("fr-CA-Standard-A", false),
				new GoogleTTSVoiceVariant("fr-CA-Standard-B", true),
				new GoogleTTSVoiceVariant("fr-CA-Standard-C", false),
				new GoogleTTSVoiceVariant("fr-CA-Standard-D", true),
				new GoogleTTSVoiceVariant("fr-CA-Wavenet-A", false),
				new GoogleTTSVoiceVariant("fr-CA-Wavenet-B", true),
				new GoogleTTSVoiceVariant("fr-CA-Wavenet-C", false),
				new GoogleTTSVoiceVariant("fr-CA-Wavenet-D", true)
				});
		new GoogleTTSLang("French (France)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("fr-FR-Standard-A", false),
				new GoogleTTSVoiceVariant("fr-FR-Standard-B", true),
				new GoogleTTSVoiceVariant("fr-FR-Standard-C", false),
				new GoogleTTSVoiceVariant("fr-FR-Standard-D", true),
				new GoogleTTSVoiceVariant("fr-FR-Standard-E", false),
				new GoogleTTSVoiceVariant("fr-FR-Wavenet-A", false),
				new GoogleTTSVoiceVariant("fr-FR-Wavenet-B", true),
				new GoogleTTSVoiceVariant("fr-FR-Wavenet-C", false),
				new GoogleTTSVoiceVariant("fr-FR-Wavenet-D", true),
				new GoogleTTSVoiceVariant("fr-FR-Wavenet-E", false)
				});
		new GoogleTTSLang("Gujarati (India)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("gu-IN-Standard-A", false),
				new GoogleTTSVoiceVariant("gu-IN-Standard-B", true)
				});
		new GoogleTTSLang("Hindi (India)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("hi-IN-Standard-A", false),
				new GoogleTTSVoiceVariant("hi-IN-Standard-B", true),
				new GoogleTTSVoiceVariant("hi-IN-Standard-C", true),
				new GoogleTTSVoiceVariant("hi-IN-Standard-D", false),
				new GoogleTTSVoiceVariant("hi-IN-Wavenet-A", false),
				new GoogleTTSVoiceVariant("hi-IN-Wavenet-B", true),
				new GoogleTTSVoiceVariant("hi-IN-Wavenet-C", true),
				new GoogleTTSVoiceVariant("hi-IN-Wavenet-D", false)
				});
		new GoogleTTSLang("Hungarian (Hungary)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("hu-HU-Standard-A", false),
				new GoogleTTSVoiceVariant("hu-HU-Wavenet-A", false)
				});
		new GoogleTTSLang("Indonesian (Indonesia)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("id-ID-Standard-A", false),
				new GoogleTTSVoiceVariant("id-ID-Standard-B", true),
				new GoogleTTSVoiceVariant("id-ID-Standard-C", true),
				new GoogleTTSVoiceVariant("id-ID-Standard-D", false),
				new GoogleTTSVoiceVariant("id-ID-Wavenet-A", false),
				new GoogleTTSVoiceVariant("id-ID-Wavenet-B", true),
				new GoogleTTSVoiceVariant("id-ID-Wavenet-C", true),
				new GoogleTTSVoiceVariant("id-ID-Wavenet-D", false)
				});
		new GoogleTTSLang("Italian (Italy)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("it-IT-Standard-A", false),
				new GoogleTTSVoiceVariant("it-IT-Standard-B", true),
				new GoogleTTSVoiceVariant("it-IT-Standard-C", false),
				new GoogleTTSVoiceVariant("it-IT-Standard-D", true),
				new GoogleTTSVoiceVariant("it-IT-Wavenet-A", false),
				new GoogleTTSVoiceVariant("it-IT-Wavenet-B", true),
				new GoogleTTSVoiceVariant("it-IT-Wavenet-C", false),
				new GoogleTTSVoiceVariant("it-IT-Wavenet-D", true)
				});
		new GoogleTTSLang("Japanese (japan)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("jp-JP-Standard-A", false),
				new GoogleTTSVoiceVariant("jp-JP-Standard-B", false),
				new GoogleTTSVoiceVariant("jp-JP-Standard-C", true),
				new GoogleTTSVoiceVariant("jp-JP-Standard-D", true),
				new GoogleTTSVoiceVariant("jp-JP-Wavenet-A", false),
				new GoogleTTSVoiceVariant("jp-JP-Wavenet-B", false),
				new GoogleTTSVoiceVariant("jp-JP-Wavenet-C", true),
				new GoogleTTSVoiceVariant("jp-JP-Wavenet-D", true)
				});
		new GoogleTTSLang("Kannada (India)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("kn-IN-Standard-A", false),
				new GoogleTTSVoiceVariant("kn-IN-Standard-B", true)
				});
		new GoogleTTSLang("Korean (South Korea)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("ko-KR-Standard-A", false),
				new GoogleTTSVoiceVariant("ko-KR-Standard-B", false),
				new GoogleTTSVoiceVariant("ko-KR-Standard-C", true),
				new GoogleTTSVoiceVariant("ko-KR-Standard-D", true),
				new GoogleTTSVoiceVariant("ko-KR-Wavenet-A", false),
				new GoogleTTSVoiceVariant("ko-KR-Wavenet-B", false),
				new GoogleTTSVoiceVariant("ko-KR-Wavenet-C", true),
				new GoogleTTSVoiceVariant("ko-KR-Wavenet-D", true)
				});
		new GoogleTTSLang("Malayalam (India)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("ml-IN-Standard-A", false),
				new GoogleTTSVoiceVariant("ml-IN-Standard-B", true)
				});
		new GoogleTTSLang("Norwegian (Norway)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("nb-no-Standard-A", false),
				new GoogleTTSVoiceVariant("nb-no-Standard-B", true),
				new GoogleTTSVoiceVariant("nb-no-Standard-C", false),
				new GoogleTTSVoiceVariant("nb-no-Standard-D", true),
				new GoogleTTSVoiceVariant("nb-no-Standard-E", false),
				new GoogleTTSVoiceVariant("nb-no-Wavenet-A", false),
				new GoogleTTSVoiceVariant("nb-no-Wavenet-B", true),
				new GoogleTTSVoiceVariant("nb-no-Wavenet-C", false),
				new GoogleTTSVoiceVariant("nb-no-Wavenet-D", true),
				new GoogleTTSVoiceVariant("nb-no-Wavenet-E", false)
				});
		new GoogleTTSLang("Dutch (Netherlands)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("nl-NL-Standard-A", false),
				new GoogleTTSVoiceVariant("nl-NL-Standard-B", true),
				new GoogleTTSVoiceVariant("nl-NL-Standard-C", true),
				new GoogleTTSVoiceVariant("nl-NL-Standard-D", false),
				new GoogleTTSVoiceVariant("nl-NL-Standard-E", false),
				new GoogleTTSVoiceVariant("nl-NL-Wavenet-A", false),
				new GoogleTTSVoiceVariant("nl-NL-Wavenet-B", true),
				new GoogleTTSVoiceVariant("nl-NL-Wavenet-C", true),
				new GoogleTTSVoiceVariant("nl-NL-Wavenet-D", false),
				new GoogleTTSVoiceVariant("nl-NL-Wavenet-E", false)
				});
		new GoogleTTSLang("Polish (Poland)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("pl-PL-Standard-A", false),
				new GoogleTTSVoiceVariant("pl-PL-Standard-B", true),
				new GoogleTTSVoiceVariant("pl-PL-Standard-C", true),
				new GoogleTTSVoiceVariant("pl-PL-Standard-D", false),
				new GoogleTTSVoiceVariant("pl-PL-Standard-E", false),
				new GoogleTTSVoiceVariant("pl-PL-Wavenet-A", false),
				new GoogleTTSVoiceVariant("pl-PL-Wavenet-B", true),
				new GoogleTTSVoiceVariant("pl-PL-Wavenet-C", true),
				new GoogleTTSVoiceVariant("pl-PL-Wavenet-D", false),
				new GoogleTTSVoiceVariant("pl-PL-Wavenet-E", false)
				});
		new GoogleTTSLang("Portuguese (Brazil)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("pt-BR-Standard-A", false),
				new GoogleTTSVoiceVariant("pt-BR-Wavenet-A", false)
				});
		new GoogleTTSLang("Portuguese (Portugal)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("pt-PT-Standard-A", false),
				new GoogleTTSVoiceVariant("pt-PT-Standard-B", true),
				new GoogleTTSVoiceVariant("pt-PT-Standard-C", true),
				new GoogleTTSVoiceVariant("pt-PT-Standard-D", false),
				new GoogleTTSVoiceVariant("pt-PT-Wavenet-A", false),
				new GoogleTTSVoiceVariant("pt-PT-Wavenet-B", true),
				new GoogleTTSVoiceVariant("pt-PT-Wavenet-C", true),
				new GoogleTTSVoiceVariant("pt-PT-Wavenet-D", false)
				});
		new GoogleTTSLang("Russian (Russia)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("ru-RU-Standard-A", false),
				new GoogleTTSVoiceVariant("ru-RU-Standard-B", true),
				new GoogleTTSVoiceVariant("ru-RU-Standard-C", false),
				new GoogleTTSVoiceVariant("ru-RU-Standard-D", true),
				new GoogleTTSVoiceVariant("ru-RU-Standard-E", false),
				new GoogleTTSVoiceVariant("ru-RU-Wavenet-A", false),
				new GoogleTTSVoiceVariant("ru-RU-Wavenet-B", true),
				new GoogleTTSVoiceVariant("ru-RU-Wavenet-C", false),
				new GoogleTTSVoiceVariant("ru-RU-Wavenet-D", true),
				new GoogleTTSVoiceVariant("ru-RU-Wavenet-E", false)
				});
		new GoogleTTSLang("Slovak (Slovakia)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("sk-SK-Standard-A", false),
				new GoogleTTSVoiceVariant("sk-SK-Wavenet-A", false)
				});
		new GoogleTTSLang("Swedish (Sweden)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("sv-SE-Standard-A", false),
				new GoogleTTSVoiceVariant("sv-SE-Wavenet-A", false)
				});
		new GoogleTTSLang("Tamil (India)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("ta-IN-Standard-A", false),
				new GoogleTTSVoiceVariant("ta-IN-Standard-B", true)
				});
		new GoogleTTSLang("Telugu (India)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("te-IN-Standard-A", false),
				new GoogleTTSVoiceVariant("te-IN-Standard-B", true)
				});
		new GoogleTTSLang("Thai (Thailand)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("th-TH-Standard-A", false)
				});
		new GoogleTTSLang("Turkish (Turkey)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("tr-TR-Standard-A", false),
				new GoogleTTSVoiceVariant("tr-TR-Standard-B", true),
				new GoogleTTSVoiceVariant("tr-TR-Standard-C", false),
				new GoogleTTSVoiceVariant("tr-TR-Standard-D", false),
				new GoogleTTSVoiceVariant("tr-TR-Standard-E", true),
				new GoogleTTSVoiceVariant("tr-TR-Wavenet-A", false),
				new GoogleTTSVoiceVariant("tr-TR-Wavenet-B", true),
				new GoogleTTSVoiceVariant("tr-TR-Wavenet-C", false),
				new GoogleTTSVoiceVariant("tr-TR-Wavenet-D", false),
				new GoogleTTSVoiceVariant("tr-TR-Wavenet-E", true)
				});
		new GoogleTTSLang("Ukrainian (Ukraine)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("uk-UA-Standard-A", false),
				new GoogleTTSVoiceVariant("uk-UA-Wavenet-A", false)
				});
		new GoogleTTSLang("Vietnamese (Vietnam)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("vi-VN-Standard-A", false),
				new GoogleTTSVoiceVariant("vi-VN-Standard-B", true),
				new GoogleTTSVoiceVariant("vi-VN-Standard-C", false),
				new GoogleTTSVoiceVariant("vi-VN-Standard-D", true),
				new GoogleTTSVoiceVariant("vi-VN-Wavenet-A", false),
				new GoogleTTSVoiceVariant("vi-VN-Wavenet-B", true),
				new GoogleTTSVoiceVariant("vi-VN-Wavenet-C", false),
				new GoogleTTSVoiceVariant("vi-VN-Wavenet-D", true)
				});
		new GoogleTTSLang("Chinese (Hong Kong)", new GoogleTTSVoiceVariant[] {
				new GoogleTTSVoiceVariant("yue-HK-Standard-A", false),
				new GoogleTTSVoiceVariant("yue-HK-Standard-B", true),
				new GoogleTTSVoiceVariant("yue-HK-Standard-C", false),
				new GoogleTTSVoiceVariant("yue-HK-Standard-D", true)
				});
	}

	public GoogleTTSLang() {
		super();
	}

	public GoogleTTSLang(String uri) {
		super(uri);
	}

	public GoogleTTSLang(String langName, GoogleTTSVoiceVariant[] voices) {
		super(LanguageOntology.NAMESPACE + voices[0].getTheLangCode());
		String langCode = getLocalName();
		if (individuals.containsKey(langCode))
			throw new RuntimeException("Duplicate lang code!");

		int n = voices.length;
		ArrayList males = new ArrayList(n);
		ArrayList females = new ArrayList(n);
		for (int i = 0; i < n; i++)
			if (!voices[i].getLocalName().startsWith(langCode))
				throw new RuntimeException("Incompatible voice variant!");
			else if (voices[i].isMaleVoice())
				males.add(voices[i]);
			else
				females.add(voices[i]);

		props.put(PROP_NAME, langName);
		props.put(PROP_TTS_SUPPORT_MALE, males);
		props.put(PROP_TTS_SUPPORT_FEMALE, females);

		individuals.put(langCode, this);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true && props.containsKey(PROP_NAME);
	}

	public String getName() {
		return (String) props.get(PROP_NAME);
	}

	public GoogleTTSVoiceVariant[] getMaleVoiceVariants() {
		Object o = props.get(PROP_TTS_SUPPORT_MALE);
		return (o instanceof List)
				? (GoogleTTSVoiceVariant[]) ((List) o).toArray(new GoogleTTSVoiceVariant[((List) o).size()])
				: new GoogleTTSVoiceVariant[0];
	}

	public GoogleTTSVoiceVariant[] getFemaleVoiceVariants() {
		Object o = props.get(PROP_TTS_SUPPORT_FEMALE);
		return (o instanceof List)
				? (GoogleTTSVoiceVariant[]) ((List) o).toArray(new GoogleTTSVoiceVariant[((List) o).size()])
				: new GoogleTTSVoiceVariant[0];
	}

	public String toString() {
		return getLocalName() + " - " + getName();
	}
}

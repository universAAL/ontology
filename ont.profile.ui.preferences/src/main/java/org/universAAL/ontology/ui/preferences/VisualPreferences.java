/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
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
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.owl.ManagedIndividual;

public class VisualPreferences extends ManagedIndividual {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "VisualPreferences";
    public static final String PROP_BACKGROUND_COLOR_HEX = UIPreferencesProfileOntology.NAMESPACE
	    + "backgroundColorHex";
    public static final String PROP_FLASHING_RESOURCES = UIPreferencesProfileOntology.NAMESPACE
	    + "flashingResources";
    public static final String PROP_DAY_NIGHT_MODE = UIPreferencesProfileOntology.NAMESPACE
	    + "dayNightMode";
    public static final String PROP_HIGHLIGHT_COLOR_HEX = UIPreferencesProfileOntology.NAMESPACE
	    + "highlightColorHex";
    public static final String PROP_WINDOW_LAYOUT = UIPreferencesProfileOntology.NAMESPACE
	    + "windowLayout";
    public static final String PROP_FONT_FAMILY = UIPreferencesProfileOntology.NAMESPACE
	    + "fontFamily";
    public static final String PROP_BRIGHTNESS = UIPreferencesProfileOntology.NAMESPACE
	    + "brightness";
    public static final String PROP_CONTENT_CONTRAST = UIPreferencesProfileOntology.NAMESPACE
	    + "contentContrast";
    public static final String PROP_SCREEN_RESOLUTION = UIPreferencesProfileOntology.NAMESPACE
	    + "screenResolution";
    public static final String PROP_CURSOR_SIZE = UIPreferencesProfileOntology.NAMESPACE
	    + "cursorSize";
    public static final String PROP_SCREEN_SAVER_USAGE = UIPreferencesProfileOntology.NAMESPACE
	    + "screenSaverUsage";
    public static final String PROP_FONT_COLOR_HEX = UIPreferencesProfileOntology.NAMESPACE
	    + "fontColorHex";
    public static final String PROP_FONT_SIZE = UIPreferencesProfileOntology.NAMESPACE
	    + "fontSize";

    public VisualPreferences() {
	super();
    }

    public VisualPreferences(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove
	return 0;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_BACKGROUND_COLOR_HEX)
		&& hasProperty(PROP_FLASHING_RESOURCES)
		&& hasProperty(PROP_DAY_NIGHT_MODE)
		&& hasProperty(PROP_HIGHLIGHT_COLOR_HEX)
		&& hasProperty(PROP_WINDOW_LAYOUT)
		&& hasProperty(PROP_FONT_FAMILY)
		&& hasProperty(PROP_BRIGHTNESS)
		&& hasProperty(PROP_CONTENT_CONTRAST)
		&& hasProperty(PROP_SCREEN_RESOLUTION)
		&& hasProperty(PROP_CURSOR_SIZE)
		&& hasProperty(PROP_SCREEN_SAVER_USAGE)
		&& hasProperty(PROP_FONT_COLOR_HEX)
		&& hasProperty(PROP_FONT_SIZE);
    }

    public Intensity getBrightness() {
	return (Intensity)getProperty(PROP_BRIGHTNESS);

    }
    
    public void setBrightness(Intensity newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_BRIGHTNESS, newPropValue);
    }

    public Intensity getContentContrast() {
	return (Intensity) getProperty(PROP_CONTENT_CONTRAST);
    }

    public void setContentContrast(Intensity newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_CONTENT_CONTRAST, newPropValue);
    }

    public Status getScreenSaverUsage() {
	return (Status) getProperty(PROP_SCREEN_SAVER_USAGE);
    }

    public void setScreenSaverUsage(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SCREEN_SAVER_USAGE, newPropValue);
    }

    public String getBackgroundColorHex() {
	return (String) getProperty(PROP_BACKGROUND_COLOR_HEX);
    }

    public void setBackgroundColorHex(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_BACKGROUND_COLOR_HEX, newPropValue);
    }

    public String getFontColorHex() {
	return (String) getProperty(PROP_FONT_COLOR_HEX);
    }

    public void setFontColorHex(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_FONT_COLOR_HEX, newPropValue);
    }

    public Size getFontSize() {
	return (Size) getProperty(PROP_FONT_SIZE);
    }

    public void setFontSize(Size newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_FONT_SIZE, newPropValue);
    }

    public Intensity getScreenResolution() {
	return (Intensity) getProperty(PROP_SCREEN_RESOLUTION);
    }

    public void setScreenResolution(Intensity newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SCREEN_RESOLUTION, newPropValue);
    }

    public Status getDayNightMode() {
	return (Status) getProperty(PROP_DAY_NIGHT_MODE);
    }

    public void setDayNightMode(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_DAY_NIGHT_MODE, newPropValue);
    }

    public WindowLayoutType getWindowLayout() {
	return (WindowLayoutType) getProperty(PROP_WINDOW_LAYOUT);
    }

    public void setWindowLayout(WindowLayoutType newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_WINDOW_LAYOUT, newPropValue);
    }

    public GenericFontFamily getFontFamily() {
	return (GenericFontFamily) getProperty(PROP_FONT_FAMILY);
    }

    public void setFontFamily(GenericFontFamily newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_FONT_FAMILY, newPropValue);
    }

    public Status getFlashingResources() {
	return (Status) getProperty(PROP_FLASHING_RESOURCES);
    }

    public void setFlashingResources(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_FLASHING_RESOURCES, newPropValue);
    }

    public String getHighlightColorHex() {
	return (String) getProperty(PROP_HIGHLIGHT_COLOR_HEX);
    }

    public void setHighlightColorHex(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_HIGHLIGHT_COLOR_HEX, newPropValue);
    }

    public Size getCursorSize() {
	return (Size) getProperty(PROP_CURSOR_SIZE);
    }

    public void setCursorSize(Size newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_CURSOR_SIZE, newPropValue);
    }
}

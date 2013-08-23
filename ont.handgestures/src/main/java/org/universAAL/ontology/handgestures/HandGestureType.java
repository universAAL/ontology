/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *	
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.handgestures;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * 
 * @author eandgrg
 * 
 */
public class HandGestureType extends ManagedIndividual {
    public static final String MY_URI = HandgesturesOntology.NAMESPACE
	    + "HandGestureType";

    public static final int RIGHT_HAND_SWIPE_RIGHT = 0;
    public static final int RIGHT_HAND_SWIPE_LEFT = 1;
    public static final int LEFT_HAND_SWIPE_RIGHT = 2;
    public static final int LEFT_HAND_SWIPE_LEFT = 3;
    public static final int TWO_HANDS_ZOOM_IN = 4;
    public static final int TWO_HANDS_ZOOM_OUT = 5;
    public static final int RIGHT_HAND_WAVE = 6;
    public static final int LEFT_HAND_WAVE = 7;
    public static final int RIGHT_HAND_PULL_DOWN = 8;
    public static final int RIGHT_HAND_PUSH_UP = 9;
    public static final int LEFT_HAND_PULL_DOWN = 10;
    public static final int LEFT_HAND_PUSH_UP = 11;
    public static final int BOTH_HANDS_PULL_DOWN = 12;
    public static final int BOTH_HANDS_PUSH_UP = 13;

    private static final String[] names = { "rightHandSwipeRight",
	    "rightHandSwipeLeft", "leftHandSwipeRight", "leftHandSwipeLeft",
	    "twoHandsZoomIn", "twoHandsZoomOut", "rightHandWave",
	    "leftHandWave", "rightHandPullDown", "rightHandPushUp",
	    "leftHandPullDown", "leftHandPushUp", "bothHandsPullDown",
	    "bothHandsPushUp" };

    public static final HandGestureType rightHandSwipeRight = new HandGestureType(
	    RIGHT_HAND_SWIPE_RIGHT);
    public static final HandGestureType rightHandSwipeLeft = new HandGestureType(
	    RIGHT_HAND_SWIPE_LEFT);
    public static final HandGestureType leftHandSwipeRight = new HandGestureType(
	    LEFT_HAND_SWIPE_RIGHT);
    public static final HandGestureType leftHandSwipeLeft = new HandGestureType(
	    LEFT_HAND_SWIPE_LEFT);
    public static final HandGestureType twoHandsZoomIn = new HandGestureType(
	    TWO_HANDS_ZOOM_IN);
    public static final HandGestureType twoHandsZoomOut = new HandGestureType(
	    TWO_HANDS_ZOOM_OUT);
    public static final HandGestureType rightHandWave = new HandGestureType(
	    RIGHT_HAND_WAVE);
    public static final HandGestureType leftHandWave = new HandGestureType(
	    LEFT_HAND_WAVE);
    public static final HandGestureType rightHandPullDown = new HandGestureType(
	    RIGHT_HAND_PULL_DOWN);
    public static final HandGestureType rightHandPushUp = new HandGestureType(
	    RIGHT_HAND_PUSH_UP);
    public static final HandGestureType leftHandPullDown = new HandGestureType(
	    LEFT_HAND_PULL_DOWN);
    public static final HandGestureType leftHandPushUp = new HandGestureType(
	    LEFT_HAND_PUSH_UP);
    public static final HandGestureType bothHandsPullDown = new HandGestureType(
	    BOTH_HANDS_PULL_DOWN);
    public static final HandGestureType bothHandsPushUp = new HandGestureType(
	    BOTH_HANDS_PUSH_UP);

    private int order;

    private HandGestureType(int order) {
	super(HandgesturesOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean isWellFormed() {
	return true;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    public String getClassURI() {
	return MY_URI;
    }

    public static HandGestureType getHandGestureTypeByOrder(int order) {
	switch (order) {
	case RIGHT_HAND_SWIPE_RIGHT:
	    return rightHandSwipeRight;
	case RIGHT_HAND_SWIPE_LEFT:
	    return rightHandSwipeLeft;
	case LEFT_HAND_SWIPE_RIGHT:
	    return leftHandSwipeRight;
	case LEFT_HAND_SWIPE_LEFT:
	    return leftHandSwipeLeft;
	case TWO_HANDS_ZOOM_IN:
	    return twoHandsZoomIn;
	case TWO_HANDS_ZOOM_OUT:
	    return twoHandsZoomOut;
	case RIGHT_HAND_WAVE:
	    return rightHandWave;
	case LEFT_HAND_WAVE:
	    return leftHandWave;
	case RIGHT_HAND_PULL_DOWN:
	    return rightHandPullDown;
	case RIGHT_HAND_PUSH_UP:
	    return rightHandPushUp;
	case LEFT_HAND_PULL_DOWN:
	    return leftHandPullDown;
	case LEFT_HAND_PUSH_UP:
	    return leftHandPushUp;
	case BOTH_HANDS_PULL_DOWN:
	    return bothHandsPullDown;
	case BOTH_HANDS_PUSH_UP:
	    return bothHandsPushUp;
	default:
	    return null;
	}
    }

    public static final HandGestureType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HandgesturesOntology.NAMESPACE))
	    name = name.substring(HandgesturesOntology.NAMESPACE.length());

	for (int i = RIGHT_HAND_SWIPE_RIGHT; i <= BOTH_HANDS_PUSH_UP; i++)
	    if (names[i].equals(name))
		return getHandGestureTypeByOrder(i);

	return null;
    }
}

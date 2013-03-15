/**
 * 
 */
package org.universAAL.ontology.activityhub.util;

/**
 * Enumeration for ActivityHubFactory and implementation units
 * 
 * @author Thomas Fuxreiter
 * 
 */
public class ActivityHubSensorType {

    // service
    public static final int ActivityHub = 0;

    // changed to abstract class
    // public static final int ActivityHubSensor = 0;

    public static final int FallSensor = 1;
    public static final int PersSensor = 2;
    public static final int SmokeSensor = 3;
    public static final int CoSensor = 4;
    public static final int WaterSensor = 5;
    public static final int GasSensor = 6;
    public static final int MotionSensor = 7;
    public static final int PropertyExitSensor = 8;
    public static final int EnuresisSensor = 9;
    public static final int ContactClosureSensor = 10;
    public static final int UsageSensor = 11;
    public static final int SwitchSensor = 12;
    public static final int MedicationDosageSensor = 13;
    public static final int TemperatureSensor = 14;
    public static final int AdaptorPlugActuator = 15;

    // to be extended by new sensor types...

}

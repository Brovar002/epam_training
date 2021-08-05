package by.goncharov.service;

/**
 * Class for emulate Fire sensor.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.contoller.FireSensorCommand
 */

public class FireSensor {
    public void fireAlert(double temperature) {
        if(temperature > 60) {
            System.out.println("Fire hazard");
        }
    }
}

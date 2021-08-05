package by.goncharov.controller;

import by.goncharov.service.FireSensor;

/**
 * Class for execute Fire sensor emulations.
 * @author Goncharov Daniil
 * @version 1.0
 * @see FireSensor
 * @see by.goncharov.view.View
 */

public class FireSensorCommand {
    double tempetarure;

    public void fireAlert(double temperature) {
        this.tempetarure = temperature;
        FireSensor fireSensor = new FireSensor();
        fireSensor.fireAlert(temperature);
    }
}

package by.goncharov.contoller;

import by.goncharov.service.FireSensor;

public class FireSensorCommand {
    double tempetarure;

    public void fireAlert(double temperature) {
        this.tempetarure =temperature;
        FireSensor fireSensor = new FireSensor();
        fireSensor.fireAlert(temperature);
    }
}

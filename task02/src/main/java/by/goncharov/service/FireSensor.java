package by.goncharov.service;

public class FireSensor {
    public void fireAlert(double temperature) {
        if(temperature > 60) {
            System.out.println("Fire hazard");
        }
    }
}

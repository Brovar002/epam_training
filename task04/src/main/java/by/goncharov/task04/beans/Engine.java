package by.goncharov.task04.beans;

public class Engine {
    private int number;
    private double power;
    public Engine(int number, double power) {
        this.number = number;
        this.power = power;
    }
    public String toString() {
        String string = "engine: " + number + ", power:" + power;
        return string;
    }
}

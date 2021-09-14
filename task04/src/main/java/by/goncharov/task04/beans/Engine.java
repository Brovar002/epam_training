package by.goncharov.task04.beans;

import java.util.Objects;

public class Engine {
    private int number;
    private double power;

    public Engine() {

    }

    public Engine(int number, double power) {
        this.number = number;
        this.power = power;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return number == engine.number && Double.compare(engine.power, power) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, power);
    }

    public String toString() {
        String string = "engine: " + number + ", power:" + power;
        return string;
    }
}

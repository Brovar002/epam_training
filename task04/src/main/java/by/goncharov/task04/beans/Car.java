package by.goncharov.task04.beans;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private Wheel wheel;
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuelLevel;

    public Car(String brand, double consumption,
               Engine engine, Wheel wheel, double fuelLevel) {
        this.brand = brand;
        this.consumption = consumption;
        this.engine = engine;
        this.wheel = wheel;
        this.fuelLevel = fuelLevel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheels) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.consumption, consumption) == 0 && Double.compare(car.fuelLevel, fuelLevel) == 0 && Objects.equals(wheel, car.wheel) && Objects.equals(engine, car.engine) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel, engine, brand, consumption, fuelLevel);
    }

    @Override
    public String toString() {
        String string = "";
        string += brand + engine.toString() + ";" + consumption + "L/100km { " + fuelLevel + "}; [";
        for (int i = 0; i < 4; ++i) {
            string += wheel.toString() + " ";
        }
        return string + "]";
    }

}

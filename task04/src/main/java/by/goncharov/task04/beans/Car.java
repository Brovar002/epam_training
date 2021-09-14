package by.goncharov.task04.beans;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private Wheel[] wheels;
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuelLevel;

    public Car(String brand, double consumption,
               Engine engine, Wheel[] wheels, double fuelLevel) {
        this.brand = brand;
        this.consumption = consumption;
        this.engine = engine;
        this.wheels = wheels;
        this.fuelLevel = fuelLevel;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
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
        return Double.compare(car.consumption, consumption) == 0 && Double.compare(car.fuelLevel, fuelLevel) == 0 && Arrays.equals(wheels, car.wheels) && engine.equals(car.engine) && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(engine, brand, consumption, fuelLevel);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        String string = "";
        string += brand + engine.toString() + ";" + consumption + "L/100km { " + fuelLevel + "}; [";
        for (int i = 0; i < 4; ++i) {
            string += wheels[i].toString() + " ";
        }
        return string + "]";
    }

}

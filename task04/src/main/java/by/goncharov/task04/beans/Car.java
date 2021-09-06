package by.goncharov.task04.beans;

public class Car {
    private Wheel[] wheels;
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuelLevel;
    public Car(String brand, double consumption,
               Engine engine, Wheel[] wheels, double fuelLevel) {
        this.brand = brand;
        consumption = consumption;
        this.engine = engine;
        this.wheels = wheels;
        this.fuelLevel = fuelLevel;
    }
    public String toString() {
        String string = "";
        string += brand + engine.toString() + ";" + consumption + "L/100km { " + fuelLevel + "}; [";
        for (int i = 0; i < 4; ++i) {
            string += wheels[i].toString() + " ";
        }
        return string + "]";
    }

}

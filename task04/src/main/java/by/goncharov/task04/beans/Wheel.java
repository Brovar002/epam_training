package by.goncharov.task04.beans;

public class Wheel {
    public enum Type { Winter, Summer }

    private double diameter;
    private String brand;
    private Type type;

    public Wheel(String brand, double diameter, Type type) {
        this.brand = brand;
        this.diameter = diameter;
        this.type = type;
    }

    public String toString() {
        String string = "";

        string += brand + "(" + diameter + "): ";
        if (type == Type.Winter)
            string += "Winter";
        else
            string += "Summer";

        return string;
    }

    public double get_diameter() {
        return diameter;
    }
}

package by.goncharov.task04.beans;

import java.util.Objects;

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

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.diameter, diameter) == 0 && brand.equals(wheel.brand) && type == wheel.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, brand, type);
    }
}



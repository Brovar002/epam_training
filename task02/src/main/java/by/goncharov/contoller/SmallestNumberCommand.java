package by.goncharov.contoller;

import by.goncharov.service.SmallestNumber;

public class SmallestNumberCommand {
    double b;
    double a;

    public double smallestNumberCommand(double a, double b){
        this.a = a;
        this.b = b;
        SmallestNumber smallestNumber = new SmallestNumber();
        return smallestNumber.smallest(a, b);
    }
}

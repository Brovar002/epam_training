package by.goncharov.controller;

import by.goncharov.service.SmallestNumber;

/**
 * Class for execute finding of smaller number.
 * @author Goncharov Daniil
 * @version 1.0
 * @see SmallestNumber
 * @see by.goncharov.view.View
 */

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

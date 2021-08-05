package by.goncharov.service;

/**
 * Class for find smaller number.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.controller.SmallestNumberCommand
 */

public class SmallestNumber {
    public double smallest(double a, double b) {
        if(a < b){
            return a;
        }
        else {
            return b;
        }
    }
}

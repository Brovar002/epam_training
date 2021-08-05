package by.goncharov.service;

/**
 * Class for calculate sum in diapasone.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.controller.CalculatingSumCommand
 */

public class CalculatingSum {
    int i;
    public int sum() {
        for(i = 1; i != Math.pow(2, 10); i = i * 2) {
            i = i + i;
        }
        return i;
    }
}

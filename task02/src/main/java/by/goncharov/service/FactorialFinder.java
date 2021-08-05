package by.goncharov.service;

/**
 * Class for find factorial.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.controller.FactorialFinderCommand
 */

public class FactorialFinder {
    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <=n; i ++) {
            result = result*i;
        }
        return result;
    }
}

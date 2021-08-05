package by.goncharov.controller;

import by.goncharov.service.FactorialFinder;

/**
 * Class for execute calculate number's factorial.
 * @author Goncharov Daniil
 * @version 1.0
 * @see FactorialFinder
 * @see by.goncharov.view.View
 */

public class FactorialFinderCommand {
    int n;

    public int factorialFinderCommand(int n) {
        this.n = n;
        FactorialFinder factorialFinder = new FactorialFinder();
        return factorialFinder.calculateFactorial(n);
    }
}

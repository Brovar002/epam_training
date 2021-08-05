package by.goncharov.contoller;

import by.goncharov.service.FactorialFinder;

public class FactorialFinderCommand {
    int n;

    public int factorialFinderCommand(int n) {
        this.n = n;
        FactorialFinder factorialFinder = new FactorialFinder();
        return factorialFinder.calculateFactorial(n);
    }
}

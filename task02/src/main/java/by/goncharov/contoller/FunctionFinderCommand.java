package by.goncharov.contoller;

import by.goncharov.service.FunctionFinder;

public class FunctionFinderCommand {
    double x;

    public double functionFinder(double x) {
        this.x = x;
        FunctionFinder functionFinder = new FunctionFinder();
        return functionFinder.function(x);
    }
}

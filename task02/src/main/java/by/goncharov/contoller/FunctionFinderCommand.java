package by.goncharov.contoller;

import by.goncharov.service.FunctionFinder;

/**
 * Class for execute calculate function.
 * @author Goncharov Daniil
 * @version 1.0
 * @see FunctionFinder
 * @see by.goncharov.view.View
 */

public class FunctionFinderCommand {
    double x;

    public double functionFinder(double x) {
        this.x = x;
        FunctionFinder functionFinder = new FunctionFinder();
        return functionFinder.function(x);
    }
}

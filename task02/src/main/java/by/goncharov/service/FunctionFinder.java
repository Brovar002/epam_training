package by.goncharov.service;

/**
 * Class for find result of function.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.contoller.FunctionFinderCommand
 */

public class FunctionFinder {
    public double function(double x) {
        if(x <= 13){
            return (-(Math.pow(x, 3))+9);
        }
        else {
            return (-(3/(x+1)));
        }
    }
}

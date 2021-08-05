package by.goncharov.service;

public class FunctionFinder {
    public double function(double x){
        if(x <= 13){
            return (-(Math.pow(x, 3))+9);
        }
        else {
            return (-(3/(x+1)));
        }
    }
}

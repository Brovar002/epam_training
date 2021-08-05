package by.goncharov.service;

import by.goncharov.service.SmallestNumber;
import by.goncharov.service.AverageFinder;

public class Replacement {
    SmallestNumber smallestNumber = new SmallestNumber();
    AverageFinder averageFinder = new AverageFinder();

    public double replacement(double a, double b){
        if(smallestNumber.smallest(a, b) == a){
            a = averageFinder.average(a, b);
            b = (a * b * 2);
            return a;
        }
        else {
            a = (a * b * 2);
            b = averageFinder.average(a, b);

        }

        return b;

    }
}

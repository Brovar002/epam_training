package by.goncharov.service;

import java.util.ArrayList;
import java.util.List;

public class Replacement {
    SmallestNumber smallestNumber = new SmallestNumber();
    AverageFinder averageFinder = new AverageFinder();

    public List<Double> replacement(double a, double b) {
        List<Double> list = new ArrayList<Double>();
        if(smallestNumber.smallest(a, b) == a) {
            a = averageFinder.average(a, b);
            b = (a * b * 2);
            list.add(a);
            list.add(b);
        }
        else {
            a = (a * b * 2);
            b = averageFinder.average(a, b);
            list.add(a);
            list.add(b);
        }

        return list;

    }
}

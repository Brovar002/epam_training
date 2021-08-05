package by.goncharov.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for calculate number doubling.
 * @author Goncharov Daniil
 * @version 1.0
 * @see ArrayList
 * @see List
 * @see by.goncharov.controller.DoublingCommand
 */

public class Doubling {
    public List<Double> doubling(double a, double b, double c) {
        List<Double> list = new ArrayList<Double>();
        if(a > b && b > c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
            list.add(a);
            list.add(b);
            list.add(c);
        }
        else {
            list.add(Math.abs(a));
            list.add(Math.abs(b));
            list.add(Math.abs(c));
        }
        return list;
    }
}

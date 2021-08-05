package by.goncharov.controller;

import by.goncharov.service.Replacement;
import java.util.List;

/**
 * Class for execute replacement numbers.
 * @author Goncharov Daniil
 * @version 1.0
 * @see Replacement
 * @see by.goncharov.view.View
 * @see List
 */

public class ReplacementCommand {
    double b;
    double a;

    public List<Double> replacementCommand(double a, double b) {
        this.a = a;
        this.b = b;
        Replacement replacement = new Replacement();
        return replacement.replacement(a, b);
    }
}

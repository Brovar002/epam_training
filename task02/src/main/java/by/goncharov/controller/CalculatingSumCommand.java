package by.goncharov.controller;

import by.goncharov.service.CalculatingSum;

/**
 * Class for execute calculate sum in diapason.
 * @author Goncharov Daniil
 * @version 1.0
 * @see CalculatingSum
 * @see by.goncharov.view.View
 */

public class CalculatingSumCommand {
    public int calculatingSumCommand() {
        CalculatingSum calculatingSum = new CalculatingSum();
        return calculatingSum.sum();
    }
}

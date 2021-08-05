package by.goncharov.controller;

import by.goncharov.service.NumberChanger;

/**
 * Class for execute translating numbers.
 * @author Goncharov Daniil
 * @version 1.0
 * @see NumberChanger
 * @see by.goncharov.view.View
 */

public class NumberChangerCommand {
    int n;

    public String numberChanger(int n){
        this.n = n;
        NumberChanger numberChanger = new NumberChanger();
        return numberChanger.numberChanger(n);
    }
}

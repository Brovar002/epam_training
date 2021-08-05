package by.goncharov.contoller;


import by.goncharov.service.DivisionWithoutRemainder;

/**
 * Class for execute calculate number's divisions.
 * @author Goncharov Daniil
 * @version 1.0
 * @see DivisionWithoutRemainderCommand
 * @see by.goncharov.view.View
 */

public class DivisionWithoutRemainderCommand {
    int n;

    public int divisionWithoutRemainderCommand(int n) {
        this.n = n;
        DivisionWithoutRemainder divisionWithoutRemainder = new DivisionWithoutRemainder();
        return divisionWithoutRemainder.division(n);
    }
}

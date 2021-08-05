package by.goncharov.contoller;

import by.goncharov.service.OddNumbers;

/**
 * Class for execute calculate sum of odd numbers.
 * @author Goncharov Daniil
 * @version 1.0
 * @see OddNumbers
 * @see by.goncharov.view.View
 */

public class OddNumbersCommand {
    public int oddNumbers() {
        OddNumbers oddNumbers = new OddNumbers();
        return oddNumbers.oddNumbers();
    }
}

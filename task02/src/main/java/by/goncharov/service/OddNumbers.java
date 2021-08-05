package by.goncharov.service;

/**
 * Class for calculate sum of odd numbers.
 * @author Goncharov Daniil
 * @version 1.0
 * @see by.goncharov.contoller.OddNumbersCommand
 */

public class OddNumbers {
    int result;
    public int oddNumbers() {
        int i = 0;
        while (i !=50) {
            result +=  2 * i + 1;
            i++;
        }
        return result;
    }
}

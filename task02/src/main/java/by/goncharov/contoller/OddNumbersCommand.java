package by.goncharov.contoller;

import by.goncharov.service.OddNumbers;

public class OddNumbersCommand {
    public int oddNumbers() {
        OddNumbers oddNumbers = new OddNumbers();
        return oddNumbers.oddNumbers();
    }
}

package by.goncharov.contoller;

import by.goncharov.service.CalculatingSum;

public class CalculatingSumCommand {
    public int calculatingSumCommand() {
        CalculatingSum calculatingSum = new CalculatingSum();
        return calculatingSum.sum();
    }
}

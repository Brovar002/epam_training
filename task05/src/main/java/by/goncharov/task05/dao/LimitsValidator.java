package by.goncharov.task05.dao;

public class LimitsValidator {
    public boolean validate(int number, int lowNumber, int highNumber) {
        return number < lowNumber || number > highNumber;
    }
}

package by.goncharov.service;

public class CalculatingSum {
    int i;
    public int sum() {
        for(i = 1; i != Math.pow(2, 10); i = i * 2) {
            i = i + i;
        }
        return i;
    }
}

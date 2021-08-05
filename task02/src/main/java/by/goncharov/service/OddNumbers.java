package by.goncharov.service;

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

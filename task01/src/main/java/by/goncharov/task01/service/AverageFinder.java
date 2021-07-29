package by.goncharov.task01.service;

import java.util.Scanner;

public class AverageFinder {
    private double a;
    private double b;

    public AverageFinder() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write numbers: ");
        this.a = in.nextDouble();
        this.b = in.nextDouble();
        System.out.println("Result: " + findAverage());
    }

    public double findAverage() {
        return ( a + b ) / 2;
    }
}

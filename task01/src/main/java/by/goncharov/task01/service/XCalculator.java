package by.goncharov.task01.service;

import java.util.Scanner;

public class XCalculator {
    private double x;

    public XCalculator() {
        changeX();
        System.out.println("First example: " +
                (x * ( ( - 2 ) + ( x * ( 3 - ( 4 * x ) ) ) ) ));

        System.out.println("Second example: " +
                1 + ( x * ( 2 + ( x * ( 3 + ( 4 * x ) ) ) ) ) );
    }

    public void changeX() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write X: ");
        this.x = in.nextDouble();
    }
}

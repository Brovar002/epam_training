package by.goncharov.task01.service;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double x1;
    private double x2;

    public QuadraticEquation() {
        try{
            changeParams();
            findDiscriminant();
            findRoots();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void changeParams() throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Write a-parameter: ");
        a = in.nextDouble();
        if (a == 0)
            throw new Exception("a-parameter equals 0!");
        else {
            System.out.println("Write b-parameter: ");
            b = in.nextDouble();
            System.out.println("Write c-parameter: ");
            c = in.nextDouble();
        }
    }

    private void findDiscriminant() throws Exception{
        if ( Math.pow(b, 2) - 4 * a * c < 0)
            throw new Exception("Discriminant is less than 0!");
        else {
            d = Math.pow(b, 2) - 4 * a * c;
        }
    }

    private void findRoots() {
        x1 = ( -b + Math.sqrt(d) ) / ( 2 * a );
        x2 = ( b + Math.sqrt(d) ) / ( 2 * a );
        System.out.println("x1 = " + x1 +
                "\nx2 = " + x2);
    }
}

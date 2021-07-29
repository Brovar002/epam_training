package by.goncharov.task01.service;

import java.util.Scanner;

public class ResistanceFinder {
    private double r1;
    private double r2;
    private double r3;

    public ResistanceFinder() {
        try {
            changeResistance();
            System.out.println("General resistance: " + findResistance());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void changeResistance() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Write r1: ");
        r1 = in.nextDouble();
        System.out.println("Write r2: ");
        r2 = in.nextDouble();
        System.out.println("Write r3 ");
        r3 = in.nextDouble();
        if (r1 < 0 || r2 < 0 || r3 < 0) throw new Exception("Resistance cant be less than 0");
    }

    private double findResistance() {
        return 1 / ( (1/r1) + (1/r2) + (1/r3));
    }
}
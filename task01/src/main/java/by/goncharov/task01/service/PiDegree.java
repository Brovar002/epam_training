package by.goncharov.task01.service;

public class PiDegree {
    private final double pi = 3.1415926536;

    public PiDegree() {
        degreeFinder();
    }

    private void degreeFinder() {
        System.out.println("1st degree of PI: " + Math.pow(pi, 1));
        System.out.println("2nd degree of PI: " + Math.pow(pi, 2));
        System.out.println("3rd degree of PI: " + Math.pow(pi, 3));
        System.out.println("4th degree of PI: " + Math.pow(pi, 4));
    }
}

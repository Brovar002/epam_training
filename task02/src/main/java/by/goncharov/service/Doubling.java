package by.goncharov.service;

public class Doubling {
    public void doubling(double a, double b, double c){
        if(a > b && b > c){
            a = a * 2;
            b = b * 2;
            c = c * 2;
        }
        else {
            Math.abs(a);
            Math.abs(b);
            Math.abs(c);
        }
    }
}

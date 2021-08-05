package by.goncharov.contoller;

import by.goncharov.service.Doubling;

import java.util.List;

public class DoublingCommand {
    double c;
    double b;
    double a;

    public List<Double> doublingCommand(final double a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        Doubling doubling = new Doubling();
        return doubling.doubling(a, b ,c);
    }
}

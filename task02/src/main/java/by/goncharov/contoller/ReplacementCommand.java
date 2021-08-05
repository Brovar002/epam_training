package by.goncharov.contoller;

import by.goncharov.service.Replacement;
import java.util.List;

public class ReplacementCommand {
    double b;
    double a;

    public List<Double> replacementCommand(double a, double b) {
        this.a = a;
        this.b = b;
        Replacement replacement = new Replacement();
        return replacement.replacement(a, b);
    }
}

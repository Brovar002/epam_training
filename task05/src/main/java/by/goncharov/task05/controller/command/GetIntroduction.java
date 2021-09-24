package by.goncharov.task05.controller.command;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.view.Locale;


public class GetIntroduction {
    public String get(Matrix matrix)
    {
        return '\n' + Locale.getInstance().getResourceBundle().
                getString("BEFORE") +
                '\n' + matrix.toPureString() + '\n' +
                Locale.getInstance().getResourceBundle().
                        getString("AFTER") + '\n';
    }
}

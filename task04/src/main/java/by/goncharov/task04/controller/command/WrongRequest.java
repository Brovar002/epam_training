package by.goncharov.task04.controller.command;

import by.goncharov.task03.controller.command.Command;
import by.goncharov.task03.exeptions.MatrixException;
import by.goncharov.task03.view.View;

public class WrongRequest implements Command {
    View view = new View();
    @Override
    public String execute(String request) throws MatrixException {
        System.out.println("Wrong request");
        view.view();
        return null;
    }
}

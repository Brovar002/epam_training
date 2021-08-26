package by.goncharov.controller.command.impl;

import by.goncharov.controller.command.Command;
import by.goncharov.exeptions.MatrixException;
import by.goncharov.view.View;

public class WrongRequest implements Command {
    View view = new View();
    @Override
    public String execute(String request) throws MatrixException {
        System.out.println("Wrong request");
        view.view();
        return null;
    }
}

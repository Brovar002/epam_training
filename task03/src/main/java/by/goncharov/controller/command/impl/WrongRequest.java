package by.goncharov.controller.command.impl;

import by.goncharov.controller.command.Command;
import by.goncharov.view.View;

public class WrongRequest implements Command {
    View view = new View();
    @Override
    public String execute(String request) {
        System.out.println("Wrong request");
        view.view();
        return null;
    }
}
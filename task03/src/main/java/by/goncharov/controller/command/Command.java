package by.goncharov.controller.command;

import by.goncharov.exeptions.MatrixException;

public interface Command {
    String execute(String request) throws MatrixException;
}

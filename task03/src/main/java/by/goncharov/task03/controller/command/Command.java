package by.goncharov.task03.controller.command;

import by.goncharov.task03.exeptions.MatrixException;

public interface Command {
    String execute(String request) throws MatrixException;
}

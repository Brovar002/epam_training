package by.goncharov.controller;

import by.goncharov.controller.command.Command;
import by.goncharov.exeptions.MatrixException;

public final class Controller {
    private final CommandProvider provider = new CommandProvider();
    public String executeTask(String request) throws MatrixException {
        String commandName;
        Command executionCommand;
        commandName = request;
        executionCommand = provider.getCommand(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}

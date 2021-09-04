package by.goncharov.task03.controller;

import by.goncharov.task03.controller.command.Command;
import by.goncharov.task03.controller.command.CommandName;
import by.goncharov.task03.controller.command.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    Logger logger = LogManager.getLogger(CommandProvider.class);
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.BUBBLE_SORT, new BubbleSortCommand());
        repository.put(CommandName.INSERTION_SORT, new InsertionSortCommand());
        repository.put(CommandName.SELECTION_SORT, new SelectionSortCommand());
        repository.put(CommandName.SHAKER_SORT, new ShakerSortCommand());
        repository.put(CommandName.SHELL_SORT, new ShellSortCommand());
        repository.put(CommandName.MULTIPLICATOR, new MultiplicatorCommand());
        repository.put(CommandName.SUMMATION, new SummationCommand());
        repository.put(CommandName.MATRIX_DIFFERENCE, new MatrixDifferenceCommand());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
        repository.put(CommandName.EXIT, new Exit());

    }

    Command getCommand(String name){
        CommandName commandName;
        Command command;
        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch(IllegalArgumentException | NullPointerException e){
            logger.error("Wrong request");
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
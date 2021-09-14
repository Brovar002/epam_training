package by.goncharov.task04.controller;

import by.goncharov.task04.controller.command.*;
import by.goncharov.task04.controller.command.impl.*;
import by.goncharov.task04.controller.command.Command;
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
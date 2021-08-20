package by.goncharov.controller;

import by.goncharov.controller.command.Command;
import by.goncharov.controller.command.CommandName;
import by.goncharov.controller.command.impl.BubbleSortCommand;
import by.goncharov.controller.command.impl.InsertionSortCommand;
import by.goncharov.controller.command.impl.ShellSortCommand;
import by.goncharov.controller.command.impl.ShakerSortCommand;
import by.goncharov.controller.command.impl.SelectionSortCommand;
import by.goncharov.controller.command.impl.WrongRequest;
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
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());

    }

    Command getCommand(String name){
        CommandName commandName;
        Command command;
        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch(IllegalArgumentException | NullPointerException e){
            logger.info("Wrong request");
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
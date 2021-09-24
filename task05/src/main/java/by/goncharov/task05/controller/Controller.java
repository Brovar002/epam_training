package by.goncharov.task05.controller;

import by.goncharov.task05.controller.command.*;
import by.goncharov.task05.dao.exception.DAOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Command> listOfCommands = new ArrayList<>();
    Logger logger = (Logger) LogManager.getLogger(Controller.class);
    public Controller() {
        listOfCommands.add(new ThreadsWithLockerCommand());
        listOfCommands.add(new ThreadWithSemaphoreCommand());
        listOfCommands.add(new ThreadWithCountDownLatchCommand());
        listOfCommands.add(new ThreadsWithPhaserCommand());
        listOfCommands.add(new ThreadsCommand());
        listOfCommands.add(new ThreadsWithDequeCommand());
        listOfCommands.add(new ThreadsWithAtomicIntegerCommand());
    }

    public String execute(List<String> message) {
        try {
            return listOfCommands.get(Integer.parseInt(message.remove(0))).
                    execute(message);
        } catch (IOException | DAOException | InterruptedException e) {
            logger.error(e);
        }
        return null;
    }
}


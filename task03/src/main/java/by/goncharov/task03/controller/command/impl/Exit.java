package by.goncharov.task03.controller.command.impl;

import by.goncharov.task03.controller.command.Command;
import by.goncharov.task03.exeptions.MatrixException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Exit implements Command {
    Logger logger = LogManager.getLogger(Exit.class);
    @Override
    public String execute(String request) throws MatrixException {
        logger.info("Exit application. ");
        System.exit(0);
        return request;
    }
}

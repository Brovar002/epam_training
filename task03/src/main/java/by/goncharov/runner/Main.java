package by.goncharov.runner;

import by.goncharov.controller.command.BubbleSortCommand;
import by.goncharov.service.*;
import by.goncharov.view.View;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main
{
    public static void main( String[] args )
    {
        Logger logger = LogManager.getLogger(Main.class);
        logger.info("Start application.");
        View view = new View();
        view.view();

    }
}

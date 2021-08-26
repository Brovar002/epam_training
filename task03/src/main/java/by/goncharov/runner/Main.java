package by.goncharov.runner;

import by.goncharov.exeptions.MatrixException;
import by.goncharov.view.View;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) throws MatrixException {
        Logger logger = LogManager.getLogger(Main.class);
        logger.info("Start application.");
        View view = new View();
        view.view();
        logger.info("Exit application. ");
    }
}

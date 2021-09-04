package by.goncharov.task03.runner;

import by.goncharov.task03.exeptions.MatrixException;
import by.goncharov.task03.view.View;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

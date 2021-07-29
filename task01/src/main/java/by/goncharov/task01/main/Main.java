package by.goncharov.task01.main;

import by.goncharov.task01.service.AverageFinder;
import by.goncharov.task01.service.PiDegree;
import by.goncharov.task01.service.QuadraticEquation;
import by.goncharov.task01.service.ResistanceFinder;
import by.goncharov.task01.service.XCalculator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        int choice = 0;
        boolean y = true;
        Scanner in = new Scanner(System.in);
        Logger logger = LogManager.getLogger(Main.class);
        logger.debug("Start application.");
        while (y) {
            System.out.println("Please, make your choice:\n"
                            + "1. Arithmetic mean of two numbers;\n"
                            + "2. First 4 degrees of PI;\n"
                    + "3. Solve quadratic equation;\n"
                    + "4. Find resistance;\n"
                    + "5. X - Calculator;\n"
                    + "6. Exit.");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    logger.debug("User choose AverageFinder");
                    AverageFinder a = new AverageFinder();
                    break;
                case 2:
                    logger.debug("User choose PiDegree");
                    PiDegree b = new PiDegree();
                    break;
                case 3:
                    logger.debug("User choose QuadraticEquation");
                    QuadraticEquation c = new QuadraticEquation();
                    break;
                case 4:
                    logger.debug("User choose ResistanceFinder");
                    ResistanceFinder d = new ResistanceFinder();
                    break;
                case 5:
                    logger.debug("User choose XCalculator");
                    XCalculator e = new XCalculator();
                    break;
                case 6:
                    y = false;
                    logger.debug("Exit application.");
                    break;
            }
        }
    }
}



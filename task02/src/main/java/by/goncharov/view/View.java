package by.goncharov.view;

import by.goncharov.contoller.CalculatingSumCommand;
import by.goncharov.contoller.NumberChangerCommand;
import by.goncharov.contoller.DivisionWithoutRemainderCommand;
import by.goncharov.contoller.DoublingCommand;
import by.goncharov.contoller.FunctionFinderCommand;
import by.goncharov.contoller.FactorialFinderCommand;
import by.goncharov.contoller.FireSensorCommand;
import by.goncharov.contoller.OddNumbersCommand;
import by.goncharov.contoller.ReplacementCommand;
import by.goncharov.contoller.SmallestNumberCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

/**
 * Class for communicate with user.
 * @author Goncharov Daniil
 * @version 1.0
 */

public class View {
    public void view() {
        int choice = 0;
        boolean y = true;
        Scanner in = new Scanner(System.in);
        Logger logger = LogManager.getLogger(View.class);
        logger.info("Start application.");
        while (y) {
            System.out.println("Please, make your choice:\n"
                    + "1. Find smaller number;\n"
                    + "2. Number comparing;\n"
                    + "3. Number comparing with replacement;\n"
                    + "4. Find result of function;\n"
                    + "5. Emulation Fire sensor;\n"
                    + "6. Find the sum of odd numbers;\n"
                    + "7. Calculating the sum of number's diapason ;\n"
                    + "8. Find factorial;\n"
                    + "9. Translate numbers from Romanic to arabic;\n"
                    + "10. Find divisions;\n"
                    + "11. Exit.");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    logger.info("User choose SmallestNumber");
                    SmallestNumberCommand smallestNumberCommand = new SmallestNumberCommand();
                    System.out.println("Enter 2 numbers");
                    double firstSmallest = in.nextDouble();
                    double secondSmallest = in.nextDouble();
                    System.out.println("The smallest number: " + smallestNumberCommand.smallestNumberCommand(firstSmallest, secondSmallest));
                    break;
               case 2:
                    logger.debug("User choose Doubling");
                    DoublingCommand doublingCommand = new DoublingCommand();
                    System.out.println("Enter 3 numbers");
                    double firstDoubling = in.nextDouble();
                    double secondDoubling = in.nextDouble();
                    double thirdDoubling = in.nextDouble();
                    System.out.println("The result: " + doublingCommand.doublingCommand(firstDoubling, secondDoubling, thirdDoubling));
                    break;
                case 3:
                    logger.info("User choose Replacement");
                    ReplacementCommand replacementCommand = new ReplacementCommand();
                    System.out.println("Enter 2 numbers");
                    double firstReplacement = in.nextDouble();
                    double secondReplacement = in.nextDouble();
                    System.out.println("The result: " + replacementCommand.replacementCommand(firstReplacement, secondReplacement));
                    break;
                case 4:
                    logger.info("User choose FunctionFinder");
                    FunctionFinderCommand functionFinderCommand = new FunctionFinderCommand();
                    System.out.println("Enter x");
                    double firstFunction = in.nextDouble();
                    System.out.println("The result: " + functionFinderCommand.functionFinder(firstFunction));
                    break;
                case 5:
                    logger.info("User choose FireSensor");
                    FireSensorCommand fireSensorCommand = new FireSensorCommand();
                    System.out.println("Enter temperature: ");
                    double firstFireAlert = in.nextDouble();
                    fireSensorCommand.fireAlert(firstFireAlert);
                    break;
                case 6:
                    logger.info("User choose OddNumbers");
                    OddNumbersCommand oddNumbersCommand = new OddNumbersCommand();
                    System.out.println("The sum of odd numbers from 1 to 99: " + oddNumbersCommand.oddNumbers());
                    break;
                case 7:
                    logger.info("User choose CalculatingSum");
                    CalculatingSumCommand calculatingSumCommand = new CalculatingSumCommand();
                    System.out.println("The result: " + calculatingSumCommand.calculatingSumCommand());
                    break;
                case 8:
                    logger.info("User choose FactorialFinder");
                    FactorialFinderCommand factorialFinderCommand = new FactorialFinderCommand();
                    System.out.println("Enter number to find factorial: ");
                    int firstFactorial = in.nextInt();
                    System.out.println("The factorial of " + firstFactorial + ": " + factorialFinderCommand.factorialFinderCommand(firstFactorial));
                    break;
                case 9:
                    logger.info("User choose NumberChanger");
                    break;
                case 10:
                    logger.info("User choose DivisionWithoutRemainder");
                    break;
                case 11:
                    y = false;
                    logger.info("Exit application.");
                    break;
            }
        }
    }
}

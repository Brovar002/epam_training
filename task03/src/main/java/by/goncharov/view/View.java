package by.goncharov.view;

import by.goncharov.controller.Controller;
import by.goncharov.controller.command.BubbleSortCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class View {
    public void view() {
        int choice = 0;
        boolean y = true;
        Scanner in = new Scanner(System.in);
        Controller controller = new Controller();

        String request = in.nextLine();
        controller.executeTask(request);

    }}
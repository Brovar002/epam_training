package by.goncharov.task05.view;

import by.goncharov.task05.controller.Controller;

import java.util.Scanner;

public class View {
    public void view() {
        Scanner in = new Scanner(System.in);
        Controller controller = new Controller();
        System.out.println("Please, make your choice:\n"
                + "Do"
                + "Exit.");
        String request = in.nextLine();
        controller.executeTask(request);
        view();
    }
}

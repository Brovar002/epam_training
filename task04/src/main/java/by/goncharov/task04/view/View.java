package by.goncharov.task04.view;

import by.goncharov.task04.controller.Controller;

import java.util.Scanner;

public class View {
    public class View {
        public void view() {
            Scanner in = new Scanner(System.in);
            Controller controller = new Controller();
            System.out.println("Please, make your choice:\n"
                    + "Ride;\n"
                    + "Change_wheel;\n"
                    + "Output;\n"
                    + "Shaker_sort;\n"
                    + "Exit.");
            String request = in.nextLine();
            controller.executeTask(request);
            view();
        }
    }
}

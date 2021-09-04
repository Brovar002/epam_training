package by.goncharov.task03.view;

import by.goncharov.task03.controller.Controller;
import by.goncharov.task03.exeptions.MatrixException;

import java.util.Scanner;

public class View {
    public void view() throws MatrixException {
        Scanner in = new Scanner(System.in);
        Controller controller = new Controller();
        System.out.println("Please, make your choice:\n"
                + "Bubble_sort;\n"
                + "Insertion_sort;\n"
                + "Selection_sort;\n"
                + "Shaker_sort;\n"
                + "Shell_sort;\n"
                + "Multiplication;\n"
                + "Summation;\n"
                + "Matrix_difference;\n"
                + "Exit.");
        String request = in.nextLine();
        controller.executeTask(request);
        view();
    }
}

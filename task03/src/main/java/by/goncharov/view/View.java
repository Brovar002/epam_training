package by.goncharov.view;

import by.goncharov.controller.Controller;
import by.goncharov.exeptions.MatrixException;

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
                + "Multiplication matrix;\n"
                + "Summation_matrix;\n"
                + "Division_matrix;\n"
                + "Exit.");
        String request = in.nextLine();
        controller.executeTask(request);

    }}
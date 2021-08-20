package by.goncharov.view;

import by.goncharov.controller.Controller;

import java.util.Scanner;

public class View {
    public void view() {
        int choice = 0;
        boolean y = true;
        Scanner in = new Scanner(System.in);
        Controller controller = new Controller();
        System.out.println();
        String request = in.nextLine();
        controller.executeTask(request);

    }}
package by.goncharov.task03.reporter;

import by.goncharov.task03.beans.Array;

import java.util.Scanner;

public class ReporterArray {
    Scanner in = new Scanner(System.in);
    public Array enteringArray(){

        System.out.println("Enter array length: ");
        int size = in.nextInt();
        int[] arrays = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            arrays[i] = in.nextInt();
        }
        Array array = new Array(arrays);
        return array;

    }
    public void outputArray(Array array) {
        System.out.println(array.toString());
        }
    }


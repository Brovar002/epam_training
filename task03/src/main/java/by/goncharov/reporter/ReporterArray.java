package by.goncharov.reporter;

import java.util.Arrays;
import java.util.Scanner;

public class ReporterArray {
    Scanner in = new Scanner(System.in);
    public int[] enteringArray(){

        System.out.println("Enter array length: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        return array;

    }
    public void outputArray(int[] array) {
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
        }
    }


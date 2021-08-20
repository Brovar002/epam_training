package by.goncharov.reporter;

import java.util.Arrays;
import java.util.Scanner;

public class ReporterArray {
    Scanner in = new Scanner(System.in);
    public int[] enteringArray(){

        System.out.println("Enter array length: ");
        int size = in.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] array = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        return array;

    }
    public void outputArray(int[] array) {
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
        }
    }


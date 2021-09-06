package by.goncharov.task03.service.sort;

import by.goncharov.task03.beans.Array;

public class BubbleSort {
    public static void bubbleSort(Array array) {
        int length = array.length();
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (array.getElement(i) > array.getElement(i + 1)) {
                    int temp = array.getElement(i);
                    array.setElement(i, array.getElement(i+1) );
                    array.setElement(i+1, temp);
                    sorted = false;
                }
            }
        }
    }
}

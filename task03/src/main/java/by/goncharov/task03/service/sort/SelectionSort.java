package by.goncharov.task03.service.sort;

import by.goncharov.task03.beans.Array;

public class SelectionSort {
    public static void selectionSort(Array array) {
        int length = array.length();
        for (int i = 0; i < length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < length; j++) {
                if (array.getElement(j) < array.getElement(smallest)) {
                    smallest = j;
                }
            }
            int buffer = array.getElement(i);
            buffer = array.getElement(smallest);
            //array[smallest] = buffer;
        }
    }
}

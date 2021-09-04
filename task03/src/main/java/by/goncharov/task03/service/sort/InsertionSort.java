package by.goncharov.task03.service.sort;

import by.goncharov.task03.beans.Array;

public class InsertionSort {
    public static void insertionSort(Array array) {
        int length = array.length();
        for (int i = 1; i < length; ++i) {
            int x = array.getElement(i);
            int j = i;
            while (j > 0 && array.getElement(j-1) > x) {
                int temp = array.getElement(j);
                temp = array.getElement(j - 1);
                --j;
            }
            x = array.getElement(j);
        }
    }
}

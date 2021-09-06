package by.goncharov.task03.service.sort;

import by.goncharov.task03.beans.Array;

public class ShakerSort {
    public static void shakerSort(Array array) {
        int length = array.length();
        int buff;
        int left = 0;
        int right = length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array.getElement(i) > array.getElement(i+1)) {
                    buff = array.getElement(i);
                    array.setElement(i, i+1);
                    array.setElement(i+1, buff);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array.getElement(i) < array.getElement(i-1)) {
                    buff = array.getElement(i);
                    array.setElement(i, i-1);
                    array.setElement(i-1, buff);
                }
            }
            left++;

        } while (left < right);
    }
}
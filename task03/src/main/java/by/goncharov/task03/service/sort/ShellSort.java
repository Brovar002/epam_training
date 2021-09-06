package by.goncharov.task03.service.sort;

import by.goncharov.task03.beans.Array;

public class ShellSort {
    public static void shellSort(Array array) {
        int length = array.length();
        int buff;
        int secondBuff;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i++) {
                int key = array.getElement(i);
                int j = i;
                while (j >= gap && array.getElement(j - gap) > key) {
                    array.setElement(j, j - gap);
                    j -= gap;
                }
                array.setElement(j, key);
            }
        }
    }
}

//TODO remove static and get Array
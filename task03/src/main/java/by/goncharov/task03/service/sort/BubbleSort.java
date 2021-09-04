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
//                    int secondTemp = array.getElement(i + 1);
//                    //array.getElement(i) = array.getElement(i+1);
//                    secondTemp = array.getElement(i);
//                    secondTemp = array.getElement(i+1);
//                    sorted = false;
//                    array.setElement(i, secondTemp);
//
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;

                    array.setElement(i, array.getElement(i+1) );
                    //array.setElement(i, array.getElement(i+1));
                    array.getElement(i+1) = temp;
                    sorted = false;
                }
            }
        }
    }
}

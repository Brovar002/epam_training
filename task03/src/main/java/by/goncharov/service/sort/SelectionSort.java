package by.goncharov.service.sort;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int buffer = array[i];
            array[i] = array[smallest];
            array[smallest] = buffer;
        }
    }
}

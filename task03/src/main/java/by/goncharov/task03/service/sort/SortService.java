package by.goncharov.task03.service.sort;

import by.goncharov.task03.beans.Array;

public interface SortService {
    void bubbleSort(Array array);
    void insertionSort(Array array);
    void selectionSort(Array array);
    void shakerSort(Array array);
    void shellSort(Array array);
}

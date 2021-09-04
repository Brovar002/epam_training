package by.goncharov.task03.service.sort;

import by.goncharov.task03.beans.Array;

public class SortServiceImpl implements SortService {

    Array array;
    @Override
    public void bubbleSort(Array array) {
        this.array = array;
        BubbleSort.bubbleSort(array);
    }

    @Override
    public void insertionSort(Array array) {
        this.array = array;
        InsertionSort.insertionSort(array);
    }

    @Override
    public void selectionSort(Array array) {
        this.array = array;
        SelectionSort.selectionSort(array);
    }

    @Override
    public void shakerSort(Array array) {
        this.array = array;
        ShakerSort.shakerSort(array);
    }

    @Override
    public void shellSort(Array array) {
        this.array = array;
        ShellSort.shellSort(array);
    }
}

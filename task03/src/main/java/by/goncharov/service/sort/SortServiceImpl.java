package by.goncharov.service.sort;

public class SortServiceImpl implements SortService {
    int[] array;
    @Override
    public void bubbleSort(int[] array) {
        this.array = array;
        BubbleSort.bubbleSort(array);
    }

    @Override
    public void insertionSort(int[] array) {
        this.array = array;
        InsertionSort.insertionSort(array);
    }

    @Override
    public void selectionSort(int[] array) {
        this.array = array;
        SelectionSort.selectionSort(array);
    }

    @Override
    public void shakerSort(int[] array) {
        this.array = array;
        ShakerSort.shakerSort(array);
    }

    @Override
    public void shellSort(int[] array) {
        this.array = array;
        ShellSort.shellSort(array);
    }
}

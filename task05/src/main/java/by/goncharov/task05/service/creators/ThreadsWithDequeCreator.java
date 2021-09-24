package by.goncharov.task05.service.creators;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.thread.PutterThread;
import by.goncharov.task05.service.thread.ThreadWithDeque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ThreadsWithDequeCreator implements ThreadsCreator{
    @Override
    public List<PutterThread> create(List<Integer> listOfNumbers, Matrix matrix) {
        List<PutterThread> list = new ArrayList<>();
        Deque<Integer> indexes = createDequeOfIndexes(matrix);
        Semaphore sema = new Semaphore(1);
        for (Integer number : listOfNumbers) {
            list.add(new ThreadWithDeque(matrix, (ArrayDeque<Integer>) indexes, sema, number));
        }
        return list;
    }

    private Deque<Integer> createDequeOfIndexes(Matrix matrix) {
        Deque<Integer> indexes = new ArrayDeque<>();
        for (int i = 0; i < matrix.getRows(); ++i) {
            indexes.add(i);
        }
        return indexes;
    }
}

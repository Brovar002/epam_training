package by.goncharov.task05.service.creators;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.thread.PutterThread;
import by.goncharov.task05.service.thread.ThreadWithAtomic;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsWithAtomicIntegerCreator implements ThreadsCreator{
    @Override
    public List<PutterThread> create(List<Integer> listOfNumbers, Matrix matrix) {
        List<PutterThread> list = new ArrayList<>();
        AtomicInteger index = new AtomicInteger(0);
        for (Integer number : listOfNumbers) {
            list.add(new ThreadWithAtomic(matrix, index, number));
        }
        return list;
    }
}

package by.goncharov.task05.service.creators;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.thread.PutterThread;
import by.goncharov.task05.service.thread.ThreadWithCountDownLatch;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ThreadsWithCountDownLatchCreator implements ThreadsCreator {
    public List<PutterThread> create (List<Integer> listOfNumbers, Matrix matrix) {
        List<PutterThread> list = new ArrayList<>();
        CountDownLatch latch = new CountDownLatch(matrix.getRows());
        for (Integer number : listOfNumbers) {
            list.add(new ThreadWithCountDownLatch(matrix, latch, number));
        }
        return list;
    }
}

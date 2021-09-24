package by.goncharov.task05.service.creators;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.thread.PutterThread;
import by.goncharov.task05.service.thread.ThreadWithSemaphore;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;


public class ThreadsWithSemaphoreCreator implements ThreadsCreator{
    public List<PutterThread> create (List<Integer> listOfNumbers, Matrix matrix) {
        List<PutterThread> list = new ArrayList<>();
        Semaphore semaphore = new Semaphore(1);
        for (Integer number : listOfNumbers) {
            list.add(new ThreadWithSemaphore(matrix, semaphore, number));
        }
        return list;
    }
}

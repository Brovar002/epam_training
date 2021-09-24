package by.goncharov.task05.service.creators;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.thread.PutterThread;
import by.goncharov.task05.service.thread.ThreadWithLock;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadsWithLockCreator implements ThreadsCreator{
    public List<PutterThread> create (List<Integer> listOfNumbers, Matrix matrix){
        List<PutterThread> list = new ArrayList<>();
        ReentrantLock locker = new ReentrantLock(false);
        for (Integer number : listOfNumbers) {
            list.add(new ThreadWithLock(matrix, locker, number));
        }
        return list;
    }
}

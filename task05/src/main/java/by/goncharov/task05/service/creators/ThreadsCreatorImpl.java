package by.goncharov.task05.service.creators;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.thread.PutterThread;
import by.goncharov.task05.service.thread.ThreadWithBoolean;
import java.util.ArrayList;
import java.util.List;

public class ThreadsCreatorImpl implements ThreadsCreator{
    public List<PutterThread> create (List<Integer> listOfNumbers, Matrix matrix){
        List<PutterThread> list = new ArrayList<>();
        Boolean flag = false;
        for (Integer number : listOfNumbers) {
            list.add(new ThreadWithBoolean(matrix, flag, number));
        }
        return list;
    }
}

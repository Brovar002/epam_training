package by.goncharov.task05.service.creators;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.thread.PutterThread;
import java.util.List;

public interface ThreadsCreator {
    public List<PutterThread> create (List<Integer> listOfNumbers, Matrix matrix);
}

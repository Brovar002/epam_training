package by.goncharov.task05.service.creators;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.thread.PutterThread;
import by.goncharov.task05.service.thread.ThreadWithPhaser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class ThreadsWithPhaserCreator implements ThreadsCreator{
    public List<PutterThread> create (List<Integer> listOfNumbers, Matrix matrix) {
        List<PutterThread> list = new ArrayList<>();
        Phaser phaser = new Phaser();
        for (Integer number : listOfNumbers) {
            list.add(new ThreadWithPhaser(matrix, phaser, number));
        }
        return list;
    }
}

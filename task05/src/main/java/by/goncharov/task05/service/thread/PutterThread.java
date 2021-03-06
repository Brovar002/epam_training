package by.goncharov.task05.service.thread;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.PutNumbersInMainDiagonal;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class PutterThread extends Thread{
    protected Matrix matrix;
    protected int number;

    public PutterThread(Matrix matrix, int number) {
        super();
        this.matrix = matrix;
        this.number = number;
    }

    @Override
    public void run() {
        while(true) {
            if (PutNumbersInMainDiagonal.getIndex() <= matrix.getRows()){
                break;
            }
            matrix.put(PutNumbersInMainDiagonal.getIndex(), PutNumbersInMainDiagonal.getIndex(), number);
            PutNumbersInMainDiagonal.inc();
            try {
                TimeUnit.MILLISECONDS.sleep(new Random().nextLong() % 50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package by.goncharov.task05.service.thread;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.PutNumbersInMainDiagonal;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ThreadWithCountDownLatch extends PutterThread {
    public CountDownLatch latch;
    Logger logger = (Logger) LogManager.getLogger(ThreadWithCountDownLatch.class);

    public ThreadWithCountDownLatch(Matrix matrix, CountDownLatch latch, int number) {
        super(matrix, number);
        this.latch = latch;
    }

    @Override
    public void run() {
        while (true) {
            if (latch.getCount() == 0) {
                break;
            }
            int index = (int) (matrix.getRows() - latch.getCount());
            matrix.put(index, index, number);
            String logInfo = getName() + " put " + number;
            logger.log(Level.INFO, logInfo);
            latch.countDown();
            PutNumbersInMainDiagonal.inc();//для теста
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                logger.error(e);
            }
        }
    }
}

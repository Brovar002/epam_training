package by.goncharov.task05.service.thread;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.PutNumbersInMainDiagonal;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadWithAtomic extends PutterThread {
    Logger logger = (Logger) LogManager.getLogger(ThreadWithAtomic.class);
    AtomicInteger index;

    public ThreadWithAtomic(Matrix matrix, AtomicInteger index, int number) {
        super(matrix, number);
        this.index = index;
    }

    @Override
    public void run() {
        while(true) {
            if (index.get() >= matrix.getRows()){
                break;
            }
            matrix.put(index.get(), index.getAndIncrement(), number);
            String logInfo = getName() + " put " + number;
            logger.log(Level.INFO, logInfo);
            PutNumbersInMainDiagonal.inc();//для теста
            try {
                TimeUnit.MILLISECONDS.sleep(new Random().nextLong() % 50);
            } catch (InterruptedException e) {
                logger.error(e);
            }
        }
    }
}

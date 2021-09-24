package by.goncharov.task05.service.thread;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.service.PutNumbersInMainDiagonal;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class ThreadWithPhaser extends PutterThread {
    Phaser phaser;
    Logger logger = (Logger) LogManager.getLogger(ThreadWithPhaser.class);

    public ThreadWithPhaser(Matrix matrix, Phaser phaser, int number) {
        super(matrix, number);
        this.phaser = phaser;
    }

    @Override
    public void run(){
        phaser.register();
        while (true) {
            try {
                if (PutNumbersInMainDiagonal.getIndex() >= matrix.getRows() && !phaser.isTerminated()) {
                    phaser.arriveAndDeregister();
                    break;
                }
                matrix.put(PutNumbersInMainDiagonal.getIndex(), PutNumbersInMainDiagonal.getIndex(),
                        number);
                PutNumbersInMainDiagonal.inc();
                String logInfo = getName() + " put " + number;
                logger.log(Level.INFO, logInfo);
                logInfo = getName() + " end " + phaser.arrive() + " phase";
                logger.log(Level.INFO, logInfo);
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                logger.error(e);
            }
        }
    }
}

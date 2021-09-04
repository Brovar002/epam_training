package by.goncharov.task03.service.matrix;

import by.goncharov.task03.beans.Matrix;
import by.goncharov.task03.exeptions.MatrixException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixCreator {
    static Logger logger = LogManager.getLogger(MatrixCreator.class);
    public static void fillRandomized(Matrix matrix, int minValue, int maxValue) {
        int v = matrix.getVerticalSize();
        int h = matrix.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++) {
                try {
                    int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                    matrix.setElement(i, j, value);
                } catch (MatrixException e) {
                    logger.error(e.getMessage());
                }
            }
        }
    }
}

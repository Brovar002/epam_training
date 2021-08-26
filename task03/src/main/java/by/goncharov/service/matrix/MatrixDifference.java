package by.goncharov.service.matrix;

import by.goncharov.beans.Matrix;
import by.goncharov.exeptions.MatrixException;

public class MatrixDifference {
    public static Matrix difference(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        int v = firstMatrix.getVerticalSize();
        int h = secondMatrix.getHorizontalSize();
        int controlSize = firstMatrix.getHorizontalSize();
        if (controlSize != secondMatrix.getVerticalSize()) {
            throw new MatrixException("incompatible matrices");
        }
        Matrix differenceMatrix = new Matrix(v, h);
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                int value = 0;
                for (int k = 0; k < controlSize; k++) {
                    value = firstMatrix.getElement(i, j) - secondMatrix.getElement(i, j);
                }
                differenceMatrix.setElement(i, j, value);
            }
        }
        return differenceMatrix;
    }
}

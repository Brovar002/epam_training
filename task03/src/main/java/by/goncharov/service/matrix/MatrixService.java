package by.goncharov.service.matrix;

import by.goncharov.beans.Matrix;
import by.goncharov.exeptions.MatrixException;

public interface MatrixService {
    Matrix multiply(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException;
    void fillRandomized(Matrix matrix, int minValue, int maxValue);
    Matrix summation(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException;
    Matrix difference(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException;
}

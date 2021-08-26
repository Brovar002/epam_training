package by.goncharov.service.matrix;

import by.goncharov.beans.Matrix;
import by.goncharov.exeptions.MatrixException;

public class MatrixServiceImpl implements MatrixService {

    int minValue;
    int maxValue;
    Matrix matrix;
    private Matrix firstMatrix;
    private Matrix secondMatrix;


    @Override
    public Matrix multiply(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
        return Multiplicator.multiply(firstMatrix, secondMatrix);

    }

    @Override
    public void fillRandomized(Matrix matrix, int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.matrix = matrix;
        MatrixCreator.fillRandomized(matrix, minValue, maxValue);
    }

    @Override
    public Matrix summation(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
        return Summation.summation(firstMatrix, secondMatrix);
    }

    @Override
    public Matrix difference(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
        return MatrixDifference.difference(firstMatrix, secondMatrix);
    }
}

package by.goncharov.beans;

import by.goncharov.exeptions.MatrixException;

public class Matrix {
    private int row;
    private int col;
    private int[][] array;

    public Matrix(int n, int m) {
        row = n;
        col = m;
        array = new int[row][col];
    }

    public Matrix(int[][] ar) {
        array = ar;
        row = array.length;
        col = array[0].length;
    }

    public int getVerticalSize() {
        return array.length;
    }
    public int getHorizontalSize() {
        return array[0].length;
    }

    public int[][] getMatrix() {
        return array;
    }

    public int getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) {
            return array[i][j];
        } else {
            throw new MatrixException();
        }
    }
    public void setElement(int i, int j, int value) throws MatrixException {
        if (checkRange(i, j)) {
            array[i][j] = value;
        } else {
            throw new MatrixException();
        }
    }

    public int sumMatrix() {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public int sizeMatrix() {
        return row * col;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
                if (j == array[0].length - 1) {
                    System.out.println();
                }
            }
        }
    }

    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("\nMatrix : " + array.length + "x"
                + array[0].length + "\n");
        for (int [ ] row : array) {
            for (int value : row) {
                s.append(value).append(BLANK);
            }
            s.append("\n");
        }
        return s.toString();
    }

    private boolean checkRange(int i, int j) {
        if (i >= 0 && i < array.length && j >= 0 && j < array[0].length) {
            return true;
        } else {
            return false;
        }
    }
}
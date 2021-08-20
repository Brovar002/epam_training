package by.goncharov.service;

public class Summation {
    public int[][] summation(int[][] firstMatrix, int[][] secondMatrix) {
        int n = 0;
        int m = 0;
        int[][] sumMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sumMatrix;
    }
}

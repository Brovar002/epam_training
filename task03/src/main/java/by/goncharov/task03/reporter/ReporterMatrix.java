package by.goncharov.task03.reporter;

import by.goncharov.task03.beans.Matrix;

import java.util.Scanner;

public class ReporterMatrix {
    Scanner in = new Scanner(System.in);
    int n;
    int m;

    public Matrix enteringMatrix() {
        System.out.println("Enter the number of rows of the matrix");
        m = in.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        n = in.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        Matrix matrix = new Matrix(array);
        return matrix;
    }

    public void outputMatrix(Matrix matrix) {
        System.out.println("Elements of the matrix are");
        System.out.println(matrix.toString());
    }
}


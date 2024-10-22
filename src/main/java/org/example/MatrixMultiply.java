package org.example;

public class MatrixMultiply {

    public static void main(String[] args) {

        int n = 1024;
        double[] A = new double[n * n];
        double[] B = new double[n * n];
        double[] C = new double[n * n];


        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < n; ++j) {

                double cij = C[i + j * n]; /* cij = C[i][j] */
                for (int k = 0; k < n; ++k) {
                    cij += A[i + k * n] * B[k + j * n]; /* cij += A[i][k]*B[k][j] */
                }
                C[i + j * n] = cij; /* C[i][j] = cij */
            }
            System.out.println("Progress: " + (i + 1) + " rows" + C[i]);
        }
    }
}

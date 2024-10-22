package org.example;

import org.springframework.util.StopWatch;

import java.text.*;

public class Benchmark {
    public static void main(String[] args) {

        int n = 1024;
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        DecimalFormat df = new DecimalFormat("#0.0");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("Benchmark");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
            //double percentageComplete = ((double) (i + 1) / n) * 100;
            //System.out.print("\rProgress: " + df.format(percentageComplete) + "%");
        }
        System.out.println();

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}

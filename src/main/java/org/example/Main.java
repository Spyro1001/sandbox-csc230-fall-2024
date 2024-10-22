package org.example;

import org.springframework.util.StopWatch;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        int n = 4096;
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        DecimalFormat df = new DecimalFormat("#0.0");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                for (int k = 0; k < n - i - j; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
            double percentageComplete = ((double) (i + 1) / (double) n * 100.0);
            System.out.print("\r" + df.format(percentageComplete) + "% complete");
        }
        stopWatch.stop();
        System.out.println();
        // calculations

        long totalTimeMillis = stopWatch.getTotalTimeMillis();
        long hours = ((totalTimeMillis / 1000) / 60) / 60;
        long minutes = (totalTimeMillis / 1000) / 60;
        long seconds = (totalTimeMillis / 1000) % 60;
        long millis = (totalTimeMillis % 1000);
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds, " + millis + " milliseconds");
    }
}
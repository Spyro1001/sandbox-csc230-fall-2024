package org.example;

import java.math.BigInteger;

public class Signed {

    public static void main(String[] args) {

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("Integer.MAX_VALUE: " + max);
        System.out.println("Integer.MIN_VALUE: " + min);

        System.out.println();

        System.out.println("Integer.MAX_VALUE + 1: " + (max + 1));
        System.out.println("Integer.MIN_VALUE - 1: " + (min - 1));

        System.out.println();

        //System.out.println(BigInteger.ONE.shiftLeft(31));

       BigInteger oneBig = BigInteger.ONE;
        /*for (int x = 0; x <= 1024; x++) {
            System.out.println("2^" + x + " = " + (oneBig.shiftLeft(x)));
        }*/

        int y = 1 << Integer.MAX_VALUE;
        System.out.println("2^" + y + " = " + (oneBig.shiftLeft(Integer.MAX_VALUE)));

    }
}

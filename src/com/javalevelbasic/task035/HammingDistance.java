package com.javalevelbasic.task035;

/**
 * Calculate the Hamming distance between these two numbers.
 */

public class HammingDistance {

    public static void main(String[] args) {
        int a = 1000;
        int b = 17;

        int hammingDistance = Hamming(a, b);

        System.out.println(hammingDistance);

    }

    private static int Hamming(int a, int b) {
        int result = a ^ b;
        int counter = 0;

        while (result > 0) {
            counter += result & 1;
            result >>= 1;
        }

        return counter;
    }

}

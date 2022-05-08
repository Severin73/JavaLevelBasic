package com.javalevelbasic.task017;

/**
 * Given an array — write a program to count odd digits in it.
 */
public class CountOddDigits {

    public static final int[] ARRAY = {0, 5, 2, 4, 7, 1, 3, 19};

    public static void main(String[] args) {
        System.out.println(countOddDigits(ARRAY));
    }

    /**
     * Counts odd digits in array.
     * @param array
     * @return
     */
    private static int countOddDigits(int[] array) {
        int count = 0;

        for (int i : array) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}

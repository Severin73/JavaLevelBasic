package com.javalevelbasic.task022;

/**
 * Write a method that returns the maximum number from an array of integers.
 */
public class MaxInArray {

    public static void main(String[] args) {
        int[] array = new int[]{15, -44, 15, -125, 9, 3, 2, -7, 93, 22};
        System.out.println(getMax(array));
    }

    /**
     * getMax method returns the maximum number from an array of integers.
     * @param array
     * @return
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

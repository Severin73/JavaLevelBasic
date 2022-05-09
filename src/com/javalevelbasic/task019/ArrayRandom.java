package com.javalevelbasic.task019;

import java.util.Arrays;
import java.util.Random;

/**
 * Create an array of random numbers (15 elements in size). Create a second array twice as large,
 * the first 15 elements should be equal to the elements of the first array, and fill the remaining
 * elements with twice the initial value. For Example, It Was - {1,4,7,2} Became - {1,4,7,2,2,8,14,4}
 */
public class ArrayRandom {

    public static final int ARRAY_SIZE = 15;
    public static final int RANDOM_MAX = 10;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        int[] arrayCopyDouble = new int[2 * ARRAY_SIZE];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int value = rand.nextInt(RANDOM_MAX);
            array[i] = value;
            arrayCopyDouble[i] = value;
            arrayCopyDouble[i + ARRAY_SIZE] = value * 2;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayCopyDouble));
    }

}

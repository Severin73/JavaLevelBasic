package com.javalevelbasic.task029;

import java.util.Arrays;

/**
 * There is an array {1,2,3,4,5} — the size of the array can be arbitrary.
 * Write a program that will display all possible combinations of these numbers.
 * Attention there should be no repetitions.
 */
public class FindAllPermutation {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        getAllPermutation(array.length);
    }

    /**
     * Print all permutation.
     * @param n length of permutation array.
     */
    public static void getAllPermutation(int n) {
        int value = 1;
        int[] permutation = new int[n];
        int[] direction = new int[n];

        for (int i = 0; i < n; i++) {
            permutation[i] = i + 1;
            direction[i] = -1;
        }

        System.out.println((value++) + ". " + Arrays.toString(permutation));

        int mobileElementIndex = findMaxMobileElementIndex(permutation, direction);
        while (mobileElementIndex != -1) {
            int mobileElement = permutation[mobileElementIndex];
            int nextIndex = mobileElementIndex + direction[mobileElementIndex];
            swap(permutation, direction, mobileElementIndex, nextIndex);
            changeDirection(permutation, direction, mobileElement);
            System.out.println((value++) + ". " + Arrays.toString(permutation));
            mobileElementIndex = findMaxMobileElementIndex(permutation, direction);
        }
    }

    /**
     * find max mobile element index in permutation array.
     * @param permutation
     * @param direction
     * @return
     */
    private static int findMaxMobileElementIndex(int[] permutation, int[] direction) {
        int index = -1;

        for (int i = 0; i < permutation.length; i++) {
            int nextIndex = i + direction[i];
            if (nextIndex >= 0 && nextIndex < permutation.length) {
                if (permutation[i] > permutation[nextIndex]) {
                    if (index == -1) {
                        index = i;
                    } else {
                        if (permutation[i] > permutation[index]) {
                            index = i;
                        }
                    }
                }
            }
        }
        return index;
    }

    /**
     * Swap two elements in permutation array and direction array.
     * @param permutation
     * @param direction
     * @param mobileElementIndex
     * @param nextIndex
     */
    private static void swap(int[] permutation, int[] direction, int mobileElementIndex, int nextIndex) {

        int permutationTemp = permutation[mobileElementIndex];
        permutation[mobileElementIndex] = permutation[nextIndex];
        permutation[nextIndex] = permutationTemp;

        int directionTemp = direction[mobileElementIndex];
        direction[mobileElementIndex] = direction[nextIndex];
        direction[nextIndex] = directionTemp;
    }

    /**
     * Change direction of mobile element.
     * @param permutation
     * @param direction
     * @param mobileElement
     */
    private static void changeDirection(int[] permutation, int[] direction, int mobileElement) {
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] > mobileElement) {
                direction[i] = direction[i] * -1;
            }
        }
    }
}

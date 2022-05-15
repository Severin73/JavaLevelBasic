package com.javalevelbasic.task025;

/**
 * Write a method that implements a linear search for an element in an array of integers.
 * If there is such an element in the array, then return its index,
 * if not, the method should return a number - "-1"
 */
public class LinearSearchInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, -6, 7, 8, 9, 10};
        System.out.println(linearSearch(array, 6));
        System.out.println(linearSearch(array, -6));
    }

    private static int linearSearch(int[] array, int target){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

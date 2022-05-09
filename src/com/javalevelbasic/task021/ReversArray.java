package com.javalevelbasic.task021;

import java.util.Arrays;

/**
 * Write code for mirroring an array flip (7,2,9,4) -> (4,9,2,7). The array can be of any length.
 * (You cannot use an additional array when performing a task)
 */
public class ReversArray {

    public static final int[] ARRAY = {7, 2, 9, 4, 100};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ARRAY));
        reversArray(ARRAY);
        System.out.println(Arrays.toString(ARRAY));
    }

    /**
     * reversArray method
     * @param array
     * @return
     */
    private static void reversArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}

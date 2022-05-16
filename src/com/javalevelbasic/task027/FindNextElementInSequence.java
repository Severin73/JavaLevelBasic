package com.javalevelbasic.task027;

/**
 * There are such sequences of numbers
 * 0,2,4,6,8,10,12
 * 1,4,7,10,13
 * 1,2,4,8,16,32
 * 1,3,9,27
 * 1,4,9,16,25
 * 1,8,27,64,125
 * Implement a program that outputs the next member of this sequence (or similar to them).
 * For example, the user enters the string 0,2,4,6,8,10,12 the program response should be the number 14.
 */
public class FindNextElementInSequence {

    public static void main(String[] args) {
        //int[] array = {-4, -2, 0, 2, 4, 6, 8, 10, 12, 14};
        //int[] array = {-14, -12, -10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14};
        int[] array = {-14, -12, -10, -8, -6, -4};
        //int[] array = {1, 4, 7, 10, 13};

        //int array[] = {1, 2, 4, 8, 16, 32};
        //int array[] = {1, -2, 4, -8, 16, -32};
        //int array[] = {-1, 2, -4, 8, -16, 32};
        //int array[] = {-1, -2, -4, -8, -16, -32};
        //int array[] = {32, 16, 8, 4};
        //int array[] = {1, 3, 9, 27};

        //int array[] = {1, 4, 9, 16, 25};
        //int array[] = {9, 16, 25, 36, 49, 64};

        //int array[] = {1, 8, 27, 64, 125, 216, 343};
        //int array[] = {64, 125, 216, 343, 512, 729, 1000};

        nextElement(array);

    }

    /**
     * find and print next element of sequence
     * @param array
     */
    private static void nextElement(int[] array) {
        isArithmeticSequence(array);
        isGeometricSequence(array);
        isSquareSequence(array);
        isCubeSequence(array);
    }

    /**
     * check if array is arithmetic sequence. If true, print next element of sequence.
     * @param array
     * @return
     */
    private static boolean isArithmeticSequence(int[] array) {
        int d = array[1] - array[0];
        for (int i = 2; i < array.length; i++) {
            if (array[i] != array[0] + i * d) {
                return false;
            }
        }
        System.out.println("Next element of sequence is " + (array[0] + array.length * d));
        return true;
    }

    /**
     * check if array is geometric sequence. If true, print next element of sequence.
     * @param array
     * @return
     */
    private static boolean isGeometricSequence(int[] array) {
        try {
            double q = (double) array[1] / array[0];
            for (int i = 2; i < array.length; i++) {
                if (array[i] != array[i - 1] * q) {
                    return false;
                }
            }
        } catch (ArithmeticException e) {
            return false;
        }
        System.out.println("Next element of sequence is " + (array[array.length - 1] * ((double) array[1] / array[0])));
        return true;
    }

    /**
     * check if array is square sequence. If true, print next element of sequence.
     * @param array
     * @return
     */
    private static boolean isSquareSequence(int[] array) {
        int start = (int) Math.sqrt(Math.abs(array[0]));
        for (int i = start; i < start + array.length; i++) {
            if (i * i != array[i - start]) {
                return false;
            }
        }
        System.out.println("Next element of sequence is " + ((start + array.length) * (start + array.length)));
        return true;
    }

    /**
     * check if array is cube sequence. If true, print next element of sequence.
     * @param array
     * @return
     */
    private static boolean isCubeSequence(int[] array) {
        int start = (int) Math.cbrt(array[0]);
        for (int i = start; i < start + array.length; i++) {
            if (i * i * i != array[i - start]) {
                return false;
            }
        }
        System.out.println("Next element of sequence is " + ((start + array.length) * (start + array.length) * (start + array.length)));
        return true;
    }

}

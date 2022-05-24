package com.javalevelbasic.task033;

/**
 * Display 10 lines with the value of Pi. Moreover, there should be 2 decimal
 * places in the first line, 3 in the second, 4 in the third, and so on.
 */
public class PiValue {

    public static final int NUMBER_OF_PI_LINES = 10;

    public static void main(String[] args) {
        for (int i = 2; i < NUMBER_OF_PI_LINES + 2; i++) {
            System.out.print(i - 1 + ". ");
            printPiValue(i);
        }
    }

    /**
     * Prints the value of pi n-number of times.
     * @param n
     */
    private static void printPiValue(int n) {
        String s = "%." + n + "f";
        System.out.printf(s, Math.PI);
        System.out.println();
    }
}

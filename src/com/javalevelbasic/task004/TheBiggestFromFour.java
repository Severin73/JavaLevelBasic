package com.javalevelbasic.task004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Write a program that counts 4 numbers from the keyboard and displays the largest of them on the screen.
 */
public class TheBiggestFromFour {

    public static final int NUMBER_OF_NUMBERS = 4;

    public static void main(String[] args) {
        System.out.println(getTheBiggestFromFour());
    }

    /**
     * Reads N numbers from the keyboard and returns the biggest of them.
     * @return the biggest number from the keyboard.
     */
    private static double getTheBiggestFromFour() {

        double[] numbers = new double[1];
        double max = numbers[0];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            try {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[0] = Integer.parseInt(reader.readLine());

                if (numbers[0] > max) {
                    max = numbers[0];
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
                i--;
            }
        }
        return max;
    }
}

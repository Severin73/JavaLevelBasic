package com.javalevelbasic.task012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Use cycles to draw "wallpaper".
 * Moreover, the number of bands must be entered from the keyboard.
 */
public class WallPaper {

    public static final int NUMBER_OF_ROWS = 5;

    public static void main(String[] args) {
        System.out.print("Enter number of patterns: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int number = Integer.parseInt(reader.readLine());

            printWallPaper(number);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints the wall paper.
     * @param number
     */
    private static void printWallPaper(int number) {
        for (int i = 1; i <= NUMBER_OF_ROWS ; i++) {
            for (int j = 1; j <= number; j++) {
                if (j % 2 == 0) {
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }
}

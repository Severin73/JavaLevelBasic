package com.javalevelbasic.task032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter a number in binary format from the console.
 * Convert it to decimal and display it on the screen (“10” -> 2).
 */
public class BinaryNumberToDecimal {

    public static void main(String[] args) {

        System.out.print("Enter a number in binary format: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();

            System.out.println(BinaryToDecimal(line));
            System.out.println(BinaryToDecimalGeneral(line));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Convert binary number to decimal.
     * Without java.lang method
     * @param line
     * @return
     */
    private static int BinaryToDecimalGeneral(String line) {
        int result = 0;
        int power = 1;
        for (int i = 0; i < line.length(); i++) {
            result += (line.charAt(line.length() - 1 - i) - '0') * power;
            power *= 2;
        }
        return result;
    }

    /**
     * Convert binary number to decimal.
     * With java.lang method
     * @param line
     * @return
     */
    private static int BinaryToDecimal(String line) {
        return Integer.parseInt(line, 2);
    }


}

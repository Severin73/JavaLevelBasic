package com.javalevelbasic.task001;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a program that reads a 5-digit number from the
 * keyboard and outputs the digits of which it consists.
 * For example : The number 54698 is read
 */
public class ReadNumbers {

    public static final int NUMBER_OF_DIGITS = 5;

    public static void main(String[] args) {

        printDigits(getNumberFromKeyboard(NUMBER_OF_DIGITS));
    }


    /**
     * Method to get number from keyboard.
     *
     * @param numberOfDigits
     * @return String proper size
     */
    private static String getNumberFromKeyboard(int numberOfDigits) {
        if (numberOfDigits < 1) {
            return "";
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number of length " + numberOfDigits + ": ");
            String number = scanner.nextLine();

            try {
                int numberAsInt = Math.abs(Integer.parseInt(number));
                number = String.valueOf(numberAsInt);
                if (number.length() == numberOfDigits) {
                    return number;
                } else {
                    System.out.println("The number must be of length " + numberOfDigits + "! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("You didn't enter a number. Try again. ");
            }
        }
    }

    /**
     * Method to print digits.
     *
     * @param number
     */
    private static void printDigits(String number) {
        System.out.println("The digits of " + number + " are:" + System.lineSeparator() +
                Stream.of(number.split(""))
                        .collect(Collectors.joining(System.lineSeparator())));
    }
}

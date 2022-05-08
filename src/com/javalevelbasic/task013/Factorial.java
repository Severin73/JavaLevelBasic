package com.javalevelbasic.task013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculate using a loop the factorial of the number - n entered from the keyboard (4 < n < 16).
 * The factorial of a number is the product of all numbers from that number to 1. For example 5!=5*4*3*2*1=120
 */
public class Factorial {

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number: ");

            int number = Integer.parseInt(bufferedReader.readLine());

            if (number < 4 || number > 16) {
                throw new IOException();
            }
            int result = 1;

            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            System.out.println("Factorial of " + number + " is " + result);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! Wrong input!");
        }
    }
}

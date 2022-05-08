package com.javalevelbasic.task016;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  Use loops to display all prime numbers from 1 to N.
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter number: ");
            int number = Integer.parseInt(reader.readLine());

            if (number < 2) {
                throw new IllegalArgumentException();
            }

            printPrimeNumbers(number);

        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }

    /**
     * Print all prime numbers from 1 to N.
     * @param number
     */
    private static void printPrimeNumbers(int number) {
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

}

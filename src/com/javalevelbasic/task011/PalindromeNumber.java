package com.javalevelbasic.task011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A N-digit number is entered from the keyboard. Check if it is a palindrome.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number: ");
            String number = reader.readLine();

            String reversedNumber = new StringBuilder(number).reverse().toString();

            if (Integer.parseInt(number) == Integer.parseInt(reversedNumber)) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.printf("The number is not a palindrome. The reversed number is %s.", reversedNumber);
            }

        } catch (IOException e) {
            System.out.println("Error! Enter a correct number.");
        }
    }
}

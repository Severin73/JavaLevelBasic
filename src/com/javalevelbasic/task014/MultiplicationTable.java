package com.javalevelbasic.task014;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Create the multiplication table by N
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter number: ");

            int number = Integer.parseInt(reader.readLine());

            printMultiplicationTable(number);

        } catch (Exception e) {
            System.out.println("Error! Incorrect input.");;
        }
    }

    /**
     * Print the multiplication table by N
     * @param number
     */
    private static void printMultiplicationTable(int number) {
        for (int i = 1; i < 10; i++) {
            System.out.println(number + " * " + i + " = " + (i * number));
        }
    }

}

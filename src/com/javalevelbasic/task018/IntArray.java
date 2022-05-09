package com.javalevelbasic.task018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Write code for the ability to create an array of integers
 * (the size is entered from the keyboard) and the ability to fill in
 * each of its elements manually. Output this array to the screen.
 */
public class IntArray {

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int[] array = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try {
                int arrayLength = Integer.parseInt(reader.readLine());
                array = new int[arrayLength];

                System.out.println("Fill array with int numbers");

                for (int i = 0; i < array.length; i++) {
                    System.out.print("Enter the " + (i + 1) + " element: ");
                    array[i] = Integer.parseInt(reader.readLine());
                }

            } catch (NumberFormatException e) {
                System.out.println("You entered not a number");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(array == null ? 0 : Arrays.toString(array));
    }
}

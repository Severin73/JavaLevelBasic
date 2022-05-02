package com.javalevelbasic.task003;

import java.util.Scanner;

/**
 * Write a program that calculates and displays the length of
 * a circle if its radius is read from the keyboard.
 */
public class CircumferenceLength {

    public static void main(String[] args) {
        System.out.println("Circumference length: " + getCircumferenceLength());
    }

    /**
     * Calculates and returns the length of a circle.
     * @return
     */
    private static double getCircumferenceLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = 0;

        try {
            radius = scanner.nextDouble();

            if (radius < 0) {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Radius must be greater than 0");
            return -1;
        } catch (Exception e) {
            System.out.println("Invalid input");
            return -1;
        }

        return 2 * Math.PI * radius;
    }
}

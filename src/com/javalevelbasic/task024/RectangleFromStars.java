package com.javalevelbasic.task024;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RectangleFromStars {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter height of rectangle: ");
            int height = Integer.parseInt(reader.readLine());

            System.out.print("Enter width of rectangle: ");
            int width = Integer.parseInt(reader.readLine());

            if (height < 0 || width < 0) {
                throw new IllegalArgumentException();
            }

            printRectangle(height, width);

        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        System.out.print("Enter the height of the rectangle: ");
    }

    /**
     * Prints a rectangle with the specified height and width.
     * @param height
     * @param width
     */
    private static void printRectangle(int height, int width) {
        System.out.println("*".repeat(width));
        for (int i = 0; i < height - 2; i++) {
            System.out.println("*" + " ".repeat(width - 2) + "*");
        }
        System.out.println("*".repeat(width));
    }


}

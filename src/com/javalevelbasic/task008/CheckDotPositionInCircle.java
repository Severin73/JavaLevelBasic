package com.javalevelbasic.task008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * There is a circle centered at the origin and with a radius of 4.
 * The user enters the coordinates of the point x and y from the keyboard.
 * Write a program that will determine whether this point lies inside the circle or not.
 */
public class CheckDotPositionInCircle {

    public static final double RADIUS = 4;
    public static final double CENTER_X = 0;
    public static final double CENTER_Y = 0;

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter x coordinate: ");
            double coordinateX = Double.parseDouble(reader.readLine());
            System.out.print("Enter y coordinate: ");
            double coordinateY = Double.parseDouble(reader.readLine());

            dotPositionInCircle(coordinateX, coordinateY);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! Enter correct data.");
        }
    }

    /**
     * Method for checking the position of the dot in the circle.
     * @param coordinateX
     * @param coordinateY
     */
    private static void dotPositionInCircle(double coordinateX, double coordinateY) {
        double dx = Math.pow(coordinateX - CENTER_X, 2);
        double dy = Math.pow(coordinateY - CENTER_Y, 2);

        if (RADIUS * RADIUS < (dx + dy)) {
            System.out.println("Dot ( " + coordinateX + ", " + coordinateY + ") is outside the circle.");
        } else if (RADIUS * RADIUS > (dx + dy) ) {
            System.out.println("Dot ( " + coordinateX + ", " + coordinateY + ") is inside the circle.");
        } else {
            System.out.println("Dot ( " + coordinateX + ", " + coordinateY + ") is on the circle.");
        }
    }
}

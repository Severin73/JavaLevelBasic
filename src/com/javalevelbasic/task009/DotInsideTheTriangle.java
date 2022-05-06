package com.javalevelbasic.task009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The triangle coordinates of the vertices A(0,0), B(4,4), C(6,1) are given.
 * The user enters the coordinates of the point x and y from the keyboard.
 * Write a program that will determine whether this point lies inside a triangle or not.
 */
public class DotInsideTheTriangle {

    public static final double A_X = 0;
    public static final double A_Y = 0;
    public static final double B_X = 4;
    public static final double B_Y = 4;
    public static final double C_X = 6;
    public static final double C_Y = 1;

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter x coordinate: ");
            double coordinateX = Double.parseDouble(reader.readLine());
            System.out.print("Enter y coordinate: ");
            double coordinateY = Double.parseDouble(reader.readLine());

            dotPositionInTriangle(coordinateX, coordinateY);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! Enter correct data.");
        }
    }

    private static void dotPositionInTriangle(double coordinateX, double coordinateY) {

    }
}

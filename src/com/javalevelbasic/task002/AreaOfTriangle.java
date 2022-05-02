package com.javalevelbasic.task002;

/**
 * Write a program that will calculate and display the area of
 * a triangle if its sides are known.
 */
public class AreaOfTriangle {

    public static final double SIDE_A_OF_TRIANGLE = 3;
    public static final double SIDE_B_OF_TRIANGLE = 4;
    public static final double SIDE_C_OF_TRIANGLE = 5;

    public static void main(String[] args) {

        System.out.println(getAreaOfTriangle(
                SIDE_A_OF_TRIANGLE, SIDE_B_OF_TRIANGLE, SIDE_C_OF_TRIANGLE));
    }

    /**
     * Calculate the area of a triangle.
     *
     * @param sideA
     * @param sideB
     * @param sideC
     * @return area of triangle
     */
    private static double getAreaOfTriangle(double sideA, double sideB, double sideC) {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        return Double.isNaN(area) ? 0 : area;
    }
}

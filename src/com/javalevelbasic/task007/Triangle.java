package com.javalevelbasic.task007;

/**
 * Is there a data triangle on three sides
 */
public class Triangle {

    public static final double SIDE_A = 3;
    public static final double SIDE_B = 4;
    public static final double SIDE_C = 5;


    public static void main(String[] args) {
        System.out.println(isTriangle(SIDE_A, SIDE_B, SIDE_C) ? "Triangle" : "Not triangle");
    }

    /**
     * Is there a data triangle on three sides
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

}

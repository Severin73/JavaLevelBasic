package com.javalevelbasic.task023;

/**
 * Implement a method whose parameters are an integer,
 * a real number and a string. It returns the concatenation of
 * a string with the sum of a real and an integer.
 */
public class ConcatTypes {

    public static void main(String[] args) {
        System.out.println(concatTypes("Concat", 73, 27.15));
    }

    /**
     * method that concatenates a string with the sum of a real and an integer
     * @param string
     * @param intNumber
     * @param doubleNumber
     * @return concatenation of string with sum of int and double
     */
    private static String concatTypes(String string, int intNumber, double doubleNumber) {
        return string + " " + (intNumber + doubleNumber);
    }
}

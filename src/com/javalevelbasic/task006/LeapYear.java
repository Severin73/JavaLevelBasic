package com.javalevelbasic.task006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Determine the number of days in the year that the user enters.
 * In a leap year - 366 days, whereas in a normal 365.
 * Leap years are all years divided entirely by 4,
 * with the exception of centuries, which are not divided entirely by 400.
 */
public class LeapYear {

    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        int year = readYear();
        if (year > 0) {
            System.out.println(isLeapYear(year) ? "The year is leap!" : "The year is not leap!");
        } else {
            System.out.println("Error! You entered a incorrect year!");
        }
    }

    /**
     * Checks if the year is leap.
     * @param year
     * @return true if the year is leap, false otherwise
     */
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Reads the number from the console.
     * @return the number
     */
    private static int readYear() {
        int year;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            year = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            throw new NumberFormatException();
        }
        return year;
    }
}

package com.javalevelbasic.task034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Enter the date from the console. Compare it with the current date in the system.
 * Display the different parts (year, month) on the screen.
 */

public class DateDifference {

    public static void main(String[] args) {

        LocalDate customDate = getDate();
        LocalDate currentDate = LocalDate.now();
        getDifference(customDate, currentDate);
    }

    /**
     * compare custome Date with current Date
     * @param customDate - date from console
     * @param currentDate - current date
     */
    private static void getDifference(LocalDate customDate, LocalDate currentDate) {

        int dayDifference = currentDate.getDayOfMonth() - customDate.getDayOfMonth();
        if (dayDifference == 0) {
            System.out.println("The day coincides");
        } else {
            System.out.println("The day differs by " + dayDifference);
        }

        int monthDifference = currentDate.getMonthValue() - customDate.getMonthValue();
        if (monthDifference == 0) {
            System.out.println("The month coincides");
        } else {
            System.out.println("The month differs by " + monthDifference);
        }

        int yearDifference = currentDate.getYear() - customDate.getYear();
        if (yearDifference == 0) {
            System.out.println("The year coincides");
        } else {
            System.out.println("The year differs by " + monthDifference);
        }
    }

    /**
     * get date from console
     * @return - date from concole
     */
    private static LocalDate getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.of(0,1,1);
        boolean flag = true;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            do {
                System.out.print("Enter the date (dd.mm.yyyy): ");
                String data = reader.readLine();
                try {
                    localDate = LocalDate.parse(data, formatter);
                    flag = false;
                } catch (DateTimeParseException e) {
                    System.out.println("You entered an incorrect date. Try again");
                }
            } while (flag);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return localDate;
    }

}

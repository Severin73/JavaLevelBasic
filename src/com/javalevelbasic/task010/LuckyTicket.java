package com.javalevelbasic.task010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Check whether a four-digit number is a lucky ticket. A four-digit number is given.
 * Check if it is a "lucky ticket". Note: a lucky ticket is a number in which -
 * with an even number of digits in the number, the sum of the digits of its left half
 * is equal to the sum of the digits of its right half. For example, consider the number 1322.
 * Its left half is 13, and its right half is 22, and it is a lucky ticket (because 1+3 = 2 + 2)
 */
public class LuckyTicket {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the number: ");
            char[] chars = reader.readLine().toCharArray();

            if (chars.length % 2 == 1 || chars.length == 0) {
                throw new IOException();
            }
            System.out.println(isLuckyTicket(chars) ? "Ticket is lucky" : "Ticket is not lucky");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (IOException e) {
            System.out.println("Enter wrong number length");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    /**
     * Check whether a ticket's number is a lucky ticket.
     * @param chars
     * @return
     * @throws NumberFormatException
     */
    private static boolean isLuckyTicket(char[] chars) throws NumberFormatException {
        int leftSum = 0;
        int rightSum = 0;

        try {
            for (int i = 0; i < chars.length / 2; i++) {
                //leftSum += chars[i] - '0';
                leftSum += Integer.parseInt(String.valueOf(chars[i]));
                //rightSum += chars[chars.length - i - 1] - '0';
                rightSum += Integer.parseInt(String.valueOf(chars[chars.length - i - 1]));
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

        return leftSum == rightSum;
    }
}

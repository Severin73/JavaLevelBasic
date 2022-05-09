package com.javalevelbasic.task020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Enter a line of text from the keyboard — implement a program to be able
 * to count the number of characters — 'b' in this line, with the
 * output of the result on the screen.
 */
public class CountCharInString {

    public static final char CHAR = 'b';

    public static void main(String[] args) {
        System.out.print("Enter a line of text: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();

            String lineWithoutChar = line.replace(String.valueOf(CHAR), "");

            System.out.println("Number of 'b' in the line: " + (line.length() - lineWithoutChar.length()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

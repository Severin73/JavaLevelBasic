package com.javalevelbasic.task037;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Write a method to save a two-dimensional array of integers to a text file.
 */
public class SafeToFileMatrix {

        public static void main(String[] args) {
        int[][] array = {{1, 2, -1},
                        {5, 9, 3, -100, 500, -3},
                        {5, 15},
                        {-1, 0, -20},
                        {3, 0, -1}};

        Path path = Path.of("resources", "matrix.txt");
        Save2DArrayToFile(path, array);
    }

    public static void Save2DArrayToFile(Path path, int[][] array) {
        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {

            for (int i = 0; i < array.length; i++) {
                fileWriter.append(toString(array[i]));
                fileWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Two-dimensional array saved to file matrix.txt");
    }

    private static String toString(int[] ints) {
        int len = ints.length - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; ; i++) {
            sb.append(ints[i]);
            if (i == len) {
                return sb.toString();
            }
            sb.append("\t\t");
            //sb.append("\t");
        }
    }


}

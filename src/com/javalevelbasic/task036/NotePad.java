package com.javalevelbasic.task036;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Create a console "text editor" with the ability to save the typed text to a file.
 */
public class NotePad {

    public static void main(String[] args) {
        Path path = Path.of("resources", "a.txt");
        textEditor(path);
    }

    private static void textEditor(Path path) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter fileWriter = Files.newBufferedWriter(path)) {

            String string;

            while (!(string = reader.readLine()).equals("exit")) {
                fileWriter.append(string);
                fileWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

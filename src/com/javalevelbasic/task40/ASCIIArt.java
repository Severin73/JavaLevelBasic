package com.javalevelbasic.task40;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Write a method for creating ASCII art in a file, i.e. figures of 40x40 characters filled with characters forming a pattern.
 */
public class ASCIIArt {

    public static void main(String[] args) {
        Path path = Path.of("resources", "art.txt");
        String art = "       _                        \n" +
                "       \\`*-.                    \n" +
                "        )  _`-.                 \n" +
                "       .  : `. .                \n" +
                "       : _   '  \\               \n" +
                "       ; *` _.   `*-._          \n" +
                "       `-.-'          `-.       \n" +
                "         ;       `       `.     \n" +
                "         :.       .        \\    \n" +
                "         . \\  .   :   .-'   .   \n" +
                "         '  `+.;  ;  '      :   \n" +
                "         :  '  |    ;       ;-. \n" +
                "         ; '   : :`-:     _.`* ;\n" +
                "[bug] .*' /  .*' ; .*`- +'  `*' \n" +
                "      `*-*   `*-*  `*-*'";
        addToFile(path, art);
    }

    public static void addToFile(Path path, String string) {
        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
            fileWriter.append(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("art is saved into art.txt");
    }
}

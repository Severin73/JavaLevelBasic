package com.javalevelbasic.task038;

import java.io.File;
import java.nio.file.Path;

/**
 * Implement a method that will display a list of all directories that "lie"
 * in the directory that will be a parameter of this method.
 */
public class CatalogList {

    public static void main(String[] args) {
        Path path = Path.of("D:", "Projects", "JavaLevelBasic", "src");
        getCatalogList(path);
    }

    private static void getCatalogList(Path path) {
        File[] files = path.toFile().listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
                getCatalogList(file.toPath());
            }
        }
    }
}

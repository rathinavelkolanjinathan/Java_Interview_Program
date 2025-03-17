package org.test.coreJavaprogram.java8.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListOutFiles {
    public static void main(String[] args) throws IOException {
        Files.newDirectoryStream(Paths.get("")).forEach(System.out::println);
        //list only files with  files new directory
        Files.newDirectoryStream(Paths.get(""),path-> path.toFile().isFile()).forEach(System.out::println);
    }
}

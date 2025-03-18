package org.test.CoreJava.java8.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListOutExtension {
    public static void main(String[] args) throws IOException {
        Files.newDirectoryStream(Paths.get("."),path->
                path.toString().endsWith(".java")).forEach(System.out::println);
    }
}

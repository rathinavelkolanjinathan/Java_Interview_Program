package org.test.CoreJava.java8.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FindDirectory {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("")).forEach(System.out::println);

        // Filter the file inside of directory
        System.out.println(" filter ");
        Files.list(Paths.get(""))
                .filter(Files::isRegularFile)
                .forEach(System.out::println);

        System.out.println(" Executable file  ");
        Files.list(Paths.get(""))
                .filter(Files::isExecutable)
                .forEach(System.out::println);
    }
}

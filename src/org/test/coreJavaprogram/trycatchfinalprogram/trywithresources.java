package org.test.coreJavaprogram.trycatchfinalprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class trywithresources {
    public void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process the line
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

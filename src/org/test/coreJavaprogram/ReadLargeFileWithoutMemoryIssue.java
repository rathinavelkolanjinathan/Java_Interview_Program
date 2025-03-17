package org.test.coreJavaprogram;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadLargeFileWithoutMemoryIssue {
    public void readFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                // Process each chunk
                System.out.println("Read " + bytesRead + " bytes");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package org.test.CoreJava.JDK8.files;

import java.io.File;

public class HiddenFiles {
    public static void main(String[] args) {
        File[] file = new File(".").listFiles(file1->file1.isHidden());
    }
}

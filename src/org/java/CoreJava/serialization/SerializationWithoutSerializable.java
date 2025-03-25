package org.java.CoreJava.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWithoutSerializable {
    public static void main(String[] args) {
        Child child = new Child();
        child.setId(101);
        child.setName("Kolanjinathan");
        try {

            FileOutputStream fileOut = new FileOutputStream("child.ser");
            ObjectOutputStream outPut = new ObjectOutputStream(fileOut);
            outPut.writeObject(child);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}

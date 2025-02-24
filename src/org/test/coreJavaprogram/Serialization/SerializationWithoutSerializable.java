package org.test.coreJavaprogram.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWithoutSerializable {
    public static void main(String[] args) {
        Child child = new Child();
        child.setId(101);
        child.setName("Kolanji");
        try {

            FileOutputStream fileout = new FileOutputStream("child.ser");
            ObjectOutputStream outPut = new ObjectOutputStream(fileout);
            outPut.writeObject(child);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}

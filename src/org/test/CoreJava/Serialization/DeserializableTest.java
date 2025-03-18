package org.test.CoreJava.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream input = new FileInputStream("child.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(input);
        Child ch = (Child) objectInputStream.readObject();
        System.out.println("parent: " + ch.getName());
        System.out.println("id: " + ch.getId());
    }
}

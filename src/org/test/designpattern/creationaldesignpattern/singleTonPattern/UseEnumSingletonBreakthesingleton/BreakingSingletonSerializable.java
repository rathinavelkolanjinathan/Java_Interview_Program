package org.test.designpattern.creationaldesignpattern.singleTonPattern.UseEnumSingletonBreakthesingleton;

import java.io.*;

// We getting same hashcode here so there is not possible to break the singlone class using the serializable
public class BreakingSingletonSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton1 = Singleton.INSTANCE;
        //Serializable
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Singleton.sen"))) {
            obj.writeObject(singleton1);

        }

        // Deserializable
        Singleton singleton2 = Singleton.INSTANCE;
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Singleton.sen"))) {
            singleton2 = (Singleton) obj.readObject();

        }
        // Verify the both instance is are same
        System.out.println("sign....." + singleton1.hashCode());
        System.out.println("sign1...." + singleton2.hashCode());
        System.out.println("Both Instance is same ...." + (singleton1==singleton2));


    }
}

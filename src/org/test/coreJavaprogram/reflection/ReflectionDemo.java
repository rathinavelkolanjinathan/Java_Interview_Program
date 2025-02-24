package org.test.coreJavaprogram.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {
        Address address = new Address();

        //Access private fields
        Field field = Address.class.getDeclaredField("name");
        field.setAccessible(true);
        String name = (String) field.get(address);
        System.out.println("Name  " + name);

        // Modify private fields
        field.set(address, "Priyadharshini");
        String name1 = (String) field.get(address);
        System.out.println("Name1  " + name1);

        //Access private Methods
        Method method = Address.class.getDeclaredMethod("printString");
        method.setAccessible(true);
        method.invoke(address);
        System.out.println("Method of " + method);


    }
}

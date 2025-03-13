package org.test.designpattern.creationaldesignpattern.singletonpattern.UseEnumSingletonBreakthesingleton;

import java.lang.reflect.Constructor;
// Throw the exception block so we cant able to break the singleton class using reflection method
public class UsingReflectionBreakEnum {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        try {
            Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {

                Singleton singleton2 = (Singleton) constructor.newInstance();
                singleton2.perform();
            }


        } catch (Exception ex) {
            System.out.print("Exception....."+ex.getMessage());
        }
        singleton1.perform();
    }
}

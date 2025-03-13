package org.test.designpattern.creationaldesignpattern.singletonpattern.UseEnumSingletonBreakthesingleton;


import java.io.Serializable;

//Different way break the singleton  1.reflection 2.serializable/Deserializable
public class MyTest  implements Serializable,Cloneable {

    private static MyTest INSTANCE;

    // protest again reflections

    private MyTest() throws IllegalAccessException {

        if(INSTANCE!=null){

            throw new IllegalAccessException("Singleton instance already created");
        }

    }

    // protect againt serialization
    private Object readResolve(){
        return INSTANCE;
    }

    // protect again cloning

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Single ton is not allowed");
    }
}

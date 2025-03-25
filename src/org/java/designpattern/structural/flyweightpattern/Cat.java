package org.java.designpattern.structural.flyweightpattern;

public class Cat implements Animal {

    private String name = null;

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void printAnimalAttributes() {
        System.out.println("Name of animal" + this.name);
        System.out.println("Name of animal" + SharableClass.eyes);
    }
}

package org.test.designpattern.structural.ProxyDesignPattern.Flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getCat("cat");
        animal.printAnimalAttributes();

        Animal animal1 = AnimalFactory.getCat("cow");
        animal.printAnimalAttributes();
        System.out.println(animal);
        System.out.println(animal1);

        Animal an = AnimalFactory.getCat("cat");
        an.printAnimalAttributes();
        System.out.println(an);

    }
}

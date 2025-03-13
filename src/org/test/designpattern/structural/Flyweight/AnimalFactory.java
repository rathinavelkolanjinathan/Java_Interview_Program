package org.test.designpattern.structural.Flyweight;

import java.util.HashMap;

public class AnimalFactory {
    private static final HashMap<String, Animal> map = new HashMap<>();

    public static Animal getCat(String name) {
        String key = name + ".cat";
        Animal animal = map.get(key);

        if (animal != null) {
            return animal;
        } else {

            animal = new Cat();
            animal.setName(name);
            map.put(key, animal);

        }
        return animal;
    }
}

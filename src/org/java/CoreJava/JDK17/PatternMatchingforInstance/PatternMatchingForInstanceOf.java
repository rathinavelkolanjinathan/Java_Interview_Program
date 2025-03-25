package org.java.CoreJava.JDK17.PatternMatchingforInstance;

/**
 * Java 14 (JEP 305)
 * Java 17 (JEP 394)
 */
public class PatternMatchingForInstanceOf {

    public static void main(String[] args) {
        Animal animal = new Dog();
        PatternMatchingForInstanceOf.PatternMatch(animal);

        animal = new Cat();
        PatternMatchingForInstanceOf.PatternMatch(animal);

    }


    public static void PatternMatch(Animal animal) {
        // Old way with pattern matching (Before Java 17)

       /* if (object instanceof stringDemo) {
            stringDemo str = (stringDemo) obj;
            System.out.println(str.length());
        }*/
// New way with pattern matching (Since Java 17)

        if (animal instanceof Dog dog) {
            dog.meove();

        }

    }
}

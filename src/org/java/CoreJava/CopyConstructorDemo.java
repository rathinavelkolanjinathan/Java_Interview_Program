package org.java.CoreJava;

public class CopyConstructorDemo {
    private String name;
    private int age;

    // Regular constructor to initialize fields
    public CopyConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public CopyConstructorDemo(CopyConstructorDemo student) {
        this.name = student.name; // Copy the name field
        this.age = student.age;   // Copy the age field
    }

    // Override the toString method for easy display of object data
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    // Main method to java the copy constructor
    public static void main(String[] args) {
        CopyConstructorDemo student1 = new CopyConstructorDemo("John", 20); // Create original object
        CopyConstructorDemo student2 = new CopyConstructorDemo(student1);   // Create copy using the copy constructor

        // Display both objects to show they are identical but separate instances
        System.out.println(student1); // Output: Name: John, Age: 20
        System.out.println(student2); // Output: Name: John, Age: 20
    }
}

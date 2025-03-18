package org.test.CoreJava.java8.stream.HiddenMethods;

public class Employee {
    private int Salary;
    private String name;

    public Employee(int salary, String name) {
        Salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

package org.java.coreJavaprogram.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

    @Override
    public int compareTo(Student student) {
        if (id == student.id) {
            return id;
        } else if (id > student.id) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student st = new Student(101, "hello");
        Student s2 = new Student(102, "kolanji");
        Student s3 = new Student(103, "aathna");
        list.add(st);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);

        list.stream().forEach(st1 -> System.out.println(st1));
        System.out.println("Values " + list);
    }
}

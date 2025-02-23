package org.test.coreJavaprogram.collection.comparator;

import org.test.common.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student studentFirst, Student studentSecond) {

        return studentFirst.getFirstName().compareTo(studentSecond.getFirstName());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(101, "Basant",0, "", "", "", 0, null);
        Student s2 = new Student(109, "Santosh",0, "", "", "", 0, null);
        Student s3 = new Student(105, "Prakash",0, "", "", "", 0, null);
        Student s4 = new Student(98, "Ashik",0, "", "", "", 0, null);
        Student s5 = new Student(101, "Bikash",0, "", "", "", 0, null);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Collections.sort(students, new NameComparator());
        System.out.println(students);
    }
}

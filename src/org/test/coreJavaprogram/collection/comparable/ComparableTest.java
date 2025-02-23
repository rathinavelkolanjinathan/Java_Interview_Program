package org.test.coreJavaprogram.collection.comparable;

import org.test.common.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest implements Comparable<ComparableTest> {

    //Single Values only we can compare
    private int id;
    private String name;

    public ComparableTest(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(ComparableTest empComparable) {
        return Integer.compare(this.id, empComparable.id);
    }

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


    @Override
    public String toString() {
        return "ComparableTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<ComparableTest> list = new ArrayList<>();
        list.add(new ComparableTest(3, "kolanji"));
        list.add(new ComparableTest(1, "priya"));
        list.add(new ComparableTest(2, "velayutham"));

        Collections.sort(list);

        for (ComparableTest myClass : list) {
            System.out.println(myClass.toString());
        }


    }
}



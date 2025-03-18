package org.test.CoreJava.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {

    //Single Values only we can compare
    private int id;
    private String name;

    public ComparableDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(ComparableDemo empComparable) {
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
        List<ComparableDemo> list = new ArrayList<>();
        list.add(new ComparableDemo(3, "kolanji"));
        list.add(new ComparableDemo(1, "priya"));
        list.add(new ComparableDemo(2, "velayutham"));

        Collections.sort(list);

        for (ComparableDemo myClass : list) {
            System.out.println(myClass.toString());
        }


    }
}



package org.test.coreJavaprogram.collection;

import org.test.common.Student;

import java.util.Objects;

public class EqualsAndHashCodeImpl {

    private int id;
    private String name;

    public EqualsAndHashCodeImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Equals method implementation
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.getId() &&
                Objects.equals(name, student.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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

    public static void main(String[] args) {

    }
}

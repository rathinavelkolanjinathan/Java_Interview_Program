package org.test.CoreJava.equalshashcode;

public class Emp {

    public static void main(String[] args) {
        Emp emp = new Emp(101, "Besant ");
        Emp emp1 = new Emp(102, "test ");

        System.out.println("is hashcode.... " + (emp.hashCode() == emp1.hashCode()));
        System.out.println("is equals..... " + (emp.equals(emp1)));


    }

    private int id;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Emp emp = (Emp) o;
        return this.id == emp.getId() && this.name.equals(emp.getName());
    }

    @Override
    public int hashCode() {
        return id;
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

    private String name;
}

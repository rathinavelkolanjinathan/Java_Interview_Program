package org.java.CoreJava.collection.map;

public class Account {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public String getHolderName() {
        return holderName;
    }

    public Account(int id) {
        this.id = id;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    private String holderName;
}

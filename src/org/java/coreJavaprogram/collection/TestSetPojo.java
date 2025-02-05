package org.java.coreJavaprogram.collection;

public class TestSetPojo {

    public TestSetPojo(String userID, String userName) {

        this.name = userName;
        this.id = userID;
    }

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

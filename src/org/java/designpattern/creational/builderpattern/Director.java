package org.java.designpattern.creational.builderpattern;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Home getCompleteObjectofHome() {

        return this.builder.getComplexObject();
    }

    public void manageRequiredHomeConstruction() {
        this.builder.buildFloor();
        this.builder.buildTerrace();
        this.builder.buildWalls();
    }

}

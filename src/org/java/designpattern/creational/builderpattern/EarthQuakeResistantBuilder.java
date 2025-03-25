package org.java.designpattern.creational.builderpattern;

public class EarthQuakeResistantBuilder implements Builder {

    private Home home = new Home();

    @Override
    public void buildFloor() {
        this.home.floor = "woodern";

    }

    @Override
    public void buildWalls() {
        this.home.walls = "walls";
    }

    @Override
    public void buildTerrace() {
        this.home.terace = "terace";
    }

    @Override
    public Home getComplexObject() {
        return this.home;
    }
}

package org.test.designpattern.creationaldesignpattern.builder;

public class FloorResistenceBuilder implements Builder {
    private Home home = new Home();

    @Override
    public void buildFloor() {
        this.home.floor = "10 feet above graound floor";

    }

    @Override
    public void buildWalls() {

        this.home.walls = "water resistent walls";
    }

    @Override
    public void buildTerrace() {
        this.home.terace = "water leake";
    }

    @Override
    public Home getComplexObject() {
        return this.home;
    }
}

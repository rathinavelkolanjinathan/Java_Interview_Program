package org.java.designpattern.creational.builderpattern;

public interface Builder {

     void buildFloor();

     void buildWalls();

     void buildTerrace();

     Home getComplexObject();
}

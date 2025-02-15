package org.java.designpattern.creationaldesignpattern.builder;

public interface Builder {

     void buildFloor();

     void buildWalls();

     void buildTerrace();

     Home getComplexObject();
}

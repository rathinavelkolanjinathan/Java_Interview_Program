package org.test.designpattern.creationaldesignpattern.builderpattern;

public interface Builder {

     void buildFloor();

     void buildWalls();

     void buildTerrace();

     Home getComplexObject();
}

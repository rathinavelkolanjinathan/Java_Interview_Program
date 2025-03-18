package org.test.designpattern.creational.factorypattern;

public class USACurrency implements Factory {

    @Override
    public String getCurrency() {

        return "Dollar";
    }

    @Override
    public String getSymbol() {
        return "$";
    }

}

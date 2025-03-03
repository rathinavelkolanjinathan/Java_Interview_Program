package org.test.designpattern.creationaldesignpattern.factorydesign;

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

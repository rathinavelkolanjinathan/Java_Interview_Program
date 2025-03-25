package org.java.designpattern.creational.factorypattern;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory;
        try {
            factory = FactoryMain.getCurrencyFactory("IN");
            System.out.println(factory.getCurrency());
            System.out.println(factory.getSymbol());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param currency
     * @return
     * @throws Exception
     */
    public static Factory getCurrencyFactory(String currency) throws Exception {
        if ("IN".equalsIgnoreCase(currency)) {

            return new IndiaCurrency();
        }
        if ("USA".equalsIgnoreCase(currency)) {

            return new USACurrency();
        }
        throw new Exception("Invalid Currency");

    }

}

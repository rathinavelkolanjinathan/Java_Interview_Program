package org.java.designpattern.creationaldesignpattern.factorydesign;

public class FactoryApp {
    public static void main(String[] args) {
        FactoryMethod_Currency factoryMethod_Currency;
        try {
            factoryMethod_Currency = FactoryApp.getCurrencyFactory("IN");
            System.out.println(factoryMethod_Currency.getCurrency());
            System.out.println(factoryMethod_Currency.getSymbol());
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
    public static FactoryMethod_Currency getCurrencyFactory(String currency) throws Exception {
        if ("IN".equalsIgnoreCase(currency)) {

            return new FactoryImple_India();
        }
        if ("USA".equalsIgnoreCase(currency)) {

            return new FactoryImpl_USA();
        }
        throw new Exception("Invalid Currency");

    }

}

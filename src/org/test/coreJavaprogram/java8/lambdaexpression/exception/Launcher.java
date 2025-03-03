package org.test.coreJavaprogram.java8.lambdaexpression.exception;

public class Launcher {


    public void getOrder(int orderId) throws OrderNotFoundException {
        if (orderId == 101) {
            throw new OrderNotFoundException("Order not found with id " + orderId);
        } else {
            //do some logic
        }
    }


    public static void main(String[] args) throws OrderNotFoundException {
        Launcher test = new Launcher();
        test.getOrder(101);
    }
}

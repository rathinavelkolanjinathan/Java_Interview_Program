package org.java.solidprinciple.dip;

public class DebitCard implements BankCard {

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}

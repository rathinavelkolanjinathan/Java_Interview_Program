package org.java.solidprinciple.OpenclosedPrinciple;

public interface NotificationService {

     void sendOTP(String medium);

     void sendTransactionReport(String medium);

}

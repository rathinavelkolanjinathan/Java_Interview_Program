package org.test.solidprinciple.OpenclosedPrinciple;

public interface NotificationService {

     void sendOTP(String medium);

     void sendTransactionReport(String medium);

}

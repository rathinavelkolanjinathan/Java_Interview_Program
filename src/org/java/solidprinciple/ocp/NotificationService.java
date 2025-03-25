package org.java.solidprinciple.ocp;

public interface NotificationService {

     void sendOTP(String medium);

     void sendTransactionReport(String medium);

}

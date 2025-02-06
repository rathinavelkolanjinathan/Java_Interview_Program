package org.java.solidprinciple.ocp;

public interface NotificationService {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}

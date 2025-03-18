package org.test.CoreJava.JDK17.switchchanges;

//what is record
// The Java record type accomplishes the same functionality
// but does not require the developer to carry the boilerplate.
// The declaration is simple, as shown below:

//Rules for Record classes    :: Ref  https://www.theserverside.com/video/How-Java-17-records-work
// 1.No 'extends' clause, implicitly extends java.lang.Record
// 2.Implicitly final, cannot be abstract
// 3.Final fields and Java records
// 4. No instance fields or initializers
// 5.Explicit members must match derived ones
// 6.A Record class cannot declare native methods
// 7.Record classes behave (mostly) like normal classes
// 8.Java records and annotations
// 9.Record serialization and deserialization
public class PatternMatchingForSwitch {

    record CreditCardPayment(String cardNumber) {
    }

    //Record class for PayPalPayment
    record PayPalPayment(String email) {
    }


    private static void processPayment(Object payment) {
        String result = switch (payment) {
            case CreditCardPayment cc -> "Processing Credit Card payment with card number: " + cc.cardNumber();
            case PayPalPayment pp -> "Processing PayPal payment with email: " + pp.email();
            case Integer amount -> "Processing Cash payment of $" + amount;
            case null -> "Invalid payment method: null";
            default -> "Unknown payment method.";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        processPayment(new CreditCardPayment("1234-5678-9876-5432"));
        processPayment(new PayPalPayment("user@example.com"));
        processPayment(500);
        processPayment(null);
    }
}



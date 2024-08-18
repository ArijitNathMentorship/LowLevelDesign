package com.mentorship.lld.parkinglot.service.payment;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean initiateTransaction(Double amount) {
        System.out.println("Payment of " + amount + "$ made via DC");
        return true;
    }
}

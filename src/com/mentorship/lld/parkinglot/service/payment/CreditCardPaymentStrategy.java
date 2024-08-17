package com.mentorship.lld.parkinglot.service.payment;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean initiateTransaction(Double amount) {
        System.out.println("Payment of " + amount + "made via CC");
        return true;
    }
}
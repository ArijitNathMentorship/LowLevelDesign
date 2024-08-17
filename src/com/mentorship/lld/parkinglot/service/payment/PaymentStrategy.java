package com.mentorship.lld.parkinglot.service.payment;

// Payment is an abstract class
public interface PaymentStrategy {
    boolean initiateTransaction(Double amount);
}
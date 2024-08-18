package com.mentorship.lld.parkinglot.service.payment;

import com.mentorship.lld.parkinglot.constants.PaymentMode;
import com.mentorship.lld.parkinglot.constants.PaymentStatus;

import java.util.Date;

public class Payment {
    private double amount;
    private PaymentStatus status;
    private Date timestamp;

    public boolean initiateTransaction(PaymentMode paymentMode, Double amount) {
        switch (paymentMode) {
            case DEBIT_CARD:
                return new DebitCardPaymentStrategy().initiateTransaction(amount);
            case CREDIT_CARD:
                return new CreditCardPaymentStrategy().initiateTransaction(amount);
            default:
                throw new IllegalArgumentException("Payment Mode not supported yet !");
        }

    }
}

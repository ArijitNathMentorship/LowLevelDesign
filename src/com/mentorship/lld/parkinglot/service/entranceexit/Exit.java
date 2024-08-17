package com.mentorship.lld.parkinglot.service.entranceexit;

import com.arijit.lld.parkinglot.constants.PaymentMode;
import com.arijit.lld.parkinglot.model.ParkingTicket;
import com.arijit.lld.parkinglot.service.parkingspot.ParkingSpot;
import com.arijit.lld.parkinglot.service.payment.Payment;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public abstract class Exit {
  // Data members 
    private int id;
    private Payment payment;

    public Exit(int id) {
        this.id = id;
        payment = new Payment();
    }

    public void validateTicket(ParkingTicket parkingTicket){
        parkingTicket.setExit(id);

        if(!parkingTicket.isTicketPaid()) {
            Double amount = evaluateAmount(parkingTicket);
        }

        throw new IllegalArgumentException("Ticket is already paid");
    }

    public void makePayment(PaymentMode paymentMode, Double amount) {
        payment.initiateTransaction(paymentMode, amount);
    }

    private Double evaluateAmount(ParkingTicket parkingTicket) {
        Instant exitTime = Instant.now();
        parkingTicket.setExitTimeStamp(exitTime.getEpochSecond());
        ParkingSpot parkingSpot = parkingTicket.getAssignedSpot();
        long totalTime = Instant.ofEpochMilli(parkingTicket.getEntrance()).until(exitTime, ChronoUnit.HOURS);
        return totalTime * parkingSpot.getParkingRate();
    }
}
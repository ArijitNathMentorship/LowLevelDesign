package com.mentorship.lld.parkinglot.model;

import com.mentorship.lld.parkinglot.service.parkingspot.ParkingSpot;
import com.mentorship.lld.parkinglot.service.payment.Payment;
import com.mentorship.lld.parkinglot.service.vehicle.Vehicle;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class ParkingTicket {
    private String ticketNo;
    private long entryTimeStamp;
    private long exitTimeStamp;
    private boolean isTicketPaid;

    // Following are the instances of their respective classes
    private Vehicle vehicle;
    private ParkingSpot assignedSpot;
    private Payment payment;

    public ParkingTicket() {
        this.setTicketNo(UUID.randomUUID().toString());
        this.setTicketPaid(false);
        this.setExitTimeStamp(0);
        this.setEntryTimeStamp(Instant.now().getEpochSecond());
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public boolean isTicketPaid() {
        return isTicketPaid;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Payment getPayment() {
        return payment;
    }


    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public void setTicketPaid(boolean ticketPaid) {
        isTicketPaid = ticketPaid;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public long getEntryTimeStamp() {
        return entryTimeStamp;
    }

    public long getExitTimeStamp() {
        return exitTimeStamp;
    }

    public void setExitTimeStamp(long exitTimeStamp) {
        this.exitTimeStamp = exitTimeStamp;
    }

    public void setEntryTimeStamp(long entryTimeStamp) {
        this.entryTimeStamp = entryTimeStamp;
    }

    public ParkingSpot getAssignedSpot() {
        return assignedSpot;
    }

    public void setAssignedSpot(ParkingSpot assignedSpot) {
        this.assignedSpot = assignedSpot;
    }

    public void validateTicket() {
        if(this.isTicketPaid()) {
            throw new IllegalArgumentException("Ticket is already paid");
        }

        if(Instant.ofEpochMilli(this.entryTimeStamp).isAfter(Instant.now())) {
            throw new IllegalArgumentException("Ticket entrance time is in future");
        }

        if(Objects.isNull(this.vehicle)) {
            throw new IllegalArgumentException("Vehicle not assigned to Parking Ticket");
        }

        if(Objects.isNull(this.assignedSpot)) {
            throw new IllegalArgumentException("Parking spot not assigned to Parking Ticket");
        }
    }

    public Double evaluateAmount() {
        Instant exitTime = Instant.now();
        this.setExitTimeStamp(exitTime.getEpochSecond());
        ParkingSpot parkingSpot = this.getAssignedSpot();
        long totalTime = Duration.between(Instant.ofEpochSecond(this.entryTimeStamp), Instant.ofEpochSecond(this.exitTimeStamp)).getSeconds();

        return totalTime * parkingSpot.getParkingRate();
    }

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "ticketNo='" + ticketNo + '\'' +
                ", entryTimeStamp=" + entryTimeStamp +
                ", exitTimeStamp=" + exitTimeStamp +
                ", isTicketPaid=" + isTicketPaid +
                ", vehicle=" + vehicle +
                ", assignedSpot=" + assignedSpot +
                ", payment=" + payment +
                '}';
    }
}
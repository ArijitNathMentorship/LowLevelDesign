package com.mentorship.lld.parkinglot.model;

import com.arijit.lld.parkinglot.service.parkingspot.ParkingSpot;
import com.arijit.lld.parkinglot.service.payment.Payment;
import com.arijit.lld.parkinglot.service.vehicle.Vehicle;

public class ParkingTicket {
    private String ticketNo;
    private long entryTimeStamp;
    private long exitTimeStamp;
    private boolean isTicketPaid;

    // Following are the instances of their respective classes
    private Vehicle vehicle;
    private ParkingSpot assignedSpot;
    private Payment payment;
    private int entrance;
    private int exit;

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

    public int getEntrance() {
        return entrance;
    }

    public int getExit() {
        return exit;
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

    public void setEntrance(int entrance) {
        this.entrance = entrance;
    }

    public void setExit(int exit) {
        this.exit = exit;
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
}
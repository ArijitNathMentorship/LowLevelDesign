package com.mentorship.lld.parkinglot;

import com.mentorship.lld.parkinglot.model.ParkingTicket;
import com.mentorship.lld.parkinglot.service.parkingspot.ParkingSpot;
import com.mentorship.lld.parkinglot.service.vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;

class ParkingLotSystem {
    private ParkingLot parkingLot;
    private Map<ParkingTicket, ParkingSpot> ticketSpotMap;

    public ParkingLotSystem(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.ticketSpotMap = new HashMap<>();
    }

    public ParkingTicket issueTicket(Vehicle vehicle, int floorId) {
        ParkingSpot spot = parkingLot.parkVehicle(vehicle, floorId);
        if (spot != null) {
            ParkingTicket ticket = new ParkingTicket();
            ticket.setVehicle(vehicle);
            ticket.setAssignedSpot(spot);
            ticketSpotMap.put(ticket, spot);
            return ticket;
        } else {
            System.out.println("No available spots for this vehicle.");
            return null;
        }
    }

    public double evaluateCharge(ParkingTicket ticket) {
        ParkingSpot spot = ticketSpotMap.get(ticket);
        if (spot != null) {
            ticket.validateTicket();
            parkingLot.vacateSpot(spot);
            ticketSpotMap.remove(ticket);
            return ticket.evaluateAmount();
        } else {
            System.out.println("Invalid ticket.");
            return 0.0;
        }
    }
}
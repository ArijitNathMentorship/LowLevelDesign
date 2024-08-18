package com.mentorship.lld.parkinglot.service.entranceexit;

import com.mentorship.lld.parkinglot.model.ParkingTicket;
import com.mentorship.lld.parkinglot.model.VehicleType;
import com.mentorship.lld.parkinglot.service.parkingspot.CompactParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.HandicappedParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.LargeParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.MotorcycleParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.ParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.TruckParkingSpot;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class Entrance {
  // Data members
    private int id;

    public Entrance(int id) {
        this.id = id;
    }

    // Member function
    public ParkingTicket generateTicket(VehicleType vehicleType) {
        ParkingTicket parkingTicket = new ParkingTicket();
        parkingTicket.setTicketNo(UUID.randomUUID().toString());
        parkingTicket.setEntrance(id);
        parkingTicket.setTicketPaid(false);
        parkingTicket.setExitTimeStamp(0);
        parkingTicket.setEntryTimeStamp(Instant.now().getEpochSecond());
        parkingTicket.setAssignedSpot(vehicleSpotMapping.get(vehicleType));
        return parkingTicket;
    }

    private static Map<VehicleType, ParkingSpot> vehicleSpotMapping = new HashMap<>();

    static {
        vehicleSpotMapping.put(VehicleType.COMPACT, getAvailableParkingSpot(VehicleType.COMPACT));
        vehicleSpotMapping.put(VehicleType.BIKE, getAvailableParkingSpot(VehicleType.BIKE));
        vehicleSpotMapping.put(VehicleType.LARGE, getAvailableParkingSpot(VehicleType.LARGE));
        vehicleSpotMapping.put(VehicleType.TRUCK, getAvailableParkingSpot(VehicleType.TRUCK));
    }

    private static ParkingSpot getAvailableParkingSpot(VehicleType vehicleType) {
        switch (vehicleType) {
            case BIKE:
                return new MotorcycleParkingSpot();
            case LARGE:
                return new LargeParkingSpot();
            case COMPACT:
                return new CompactParkingSpot();
            case TRUCK:
                return new TruckParkingSpot();
            default:
                return new HandicappedParkingSpot();
        }
    }
}


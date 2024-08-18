package com.mentorship.lld.parkinglot;

import com.mentorship.lld.parkinglot.service.ParkingFloor;
import com.mentorship.lld.parkinglot.service.parkingspot.ParkingSpot;
import com.mentorship.lld.parkinglot.service.vehicle.Vehicle;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findAvailableSpot(vehicle.getVehicleType());
            if (spot != null) {
                spot.assignVehicle(vehicle);
                return spot;
            }
        }
        return null;
    }

    public void vacateSpot(ParkingSpot spot) {
        spot.removeVehicle();
    }
}

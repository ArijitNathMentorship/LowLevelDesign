package com.mentorship.lld.parkinglot.service.parkingspot;

import com.arijit.lld.parkinglot.model.VehicleType;

public class CompactParkingSpot extends ParkingSpot {

    public CompactParkingSpot() {
        super(VehicleType.COMPACT);
    }

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 30.0;
    }
}
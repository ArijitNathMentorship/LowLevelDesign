package com.mentorship.lld.parkinglot.service.parkingspot;

import com.mentorship.lld.parkinglot.model.VehicleType;

public class CompactParkingSpot extends ParkingSpot {

    public CompactParkingSpot(String id, double parkingRate) {
        super(id, VehicleType.COMPACT, parkingRate);
    }

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 30.0;
    }
}
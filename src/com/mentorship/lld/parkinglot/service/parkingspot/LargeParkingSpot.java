package com.mentorship.lld.parkinglot.service.parkingspot;

import com.arijit.lld.parkinglot.model.VehicleType;

public class LargeParkingSpot extends ParkingSpot {

    public LargeParkingSpot() {
        super(VehicleType.LARGE);
    }

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 90.0;
    }
}
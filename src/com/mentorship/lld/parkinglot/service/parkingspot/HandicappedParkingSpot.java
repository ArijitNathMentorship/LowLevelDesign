package com.mentorship.lld.parkinglot.service.parkingspot;

public class HandicappedParkingSpot extends ParkingSpot {

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 50.0;
    }

}
package com.mentorship.lld.parkinglot.service.parkingspot;

public class HandicappedParkingSpot extends ParkingSpot {

    public HandicappedParkingSpot(String id, double parkingRate) {
        super(id, null, parkingRate);
    }

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 50.0;
    }

}
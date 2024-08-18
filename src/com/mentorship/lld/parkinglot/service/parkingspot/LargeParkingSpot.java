package com.mentorship.lld.parkinglot.service.parkingspot;


import com.mentorship.lld.parkinglot.model.VehicleType;

public class LargeParkingSpot extends ParkingSpot {

    public LargeParkingSpot(String id, double parkingRate) {
        super(id, VehicleType.LARGE, parkingRate);
    }

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 90.0;
    }
}
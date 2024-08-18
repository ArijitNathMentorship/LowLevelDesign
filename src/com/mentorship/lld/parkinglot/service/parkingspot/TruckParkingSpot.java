package com.mentorship.lld.parkinglot.service.parkingspot;


import com.mentorship.lld.parkinglot.model.VehicleType;

public class TruckParkingSpot extends ParkingSpot {

    public TruckParkingSpot(String id, double parkingRate) {
        super(id, VehicleType.TRUCK, parkingRate);
    }

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 100.0;
    }
}
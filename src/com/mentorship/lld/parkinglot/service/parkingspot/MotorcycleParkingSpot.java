package com.mentorship.lld.parkinglot.service.parkingspot;


import com.mentorship.lld.parkinglot.model.VehicleType;

public class MotorcycleParkingSpot extends ParkingSpot {

    public MotorcycleParkingSpot() {
        super(VehicleType.BIKE);
    }

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 20.0;
    }
}
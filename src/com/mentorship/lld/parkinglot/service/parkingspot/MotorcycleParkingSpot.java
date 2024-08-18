package com.mentorship.lld.parkinglot.service.parkingspot;


import com.mentorship.lld.parkinglot.model.VehicleType;

public class MotorcycleParkingSpot extends ParkingSpot {

    public MotorcycleParkingSpot(String id, double parkingRate) {
        super(id, VehicleType.BIKE, parkingRate);
    }

    @Override
    public void assignParkingRate(Double parkingRate) {
        this.parkingRate = 20.0;
    }
}
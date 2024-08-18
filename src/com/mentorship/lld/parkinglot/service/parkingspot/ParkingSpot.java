package com.mentorship.lld.parkinglot.service.parkingspot;

import com.mentorship.lld.parkinglot.model.VehicleType;
import com.mentorship.lld.parkinglot.service.vehicle.Vehicle;

import java.util.Objects;

// ParkingSpot is an abstract class
public abstract class ParkingSpot {
    private String id;
    private boolean isSpotFree;
    private Vehicle vehicle;
    private VehicleType vehicleType;
    protected Double parkingRate;

    public ParkingSpot(String id, VehicleType vehicleType, double parkingRate) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.parkingRate = parkingRate;
        this.isSpotFree = true;
    }

    public ParkingSpot() {
    this.vehicleType = null;
  }

    public boolean getIsFree() {
        return this.isSpotFree;
    }

    public boolean isReservedForHandicapped() {
        return Objects.isNull(vehicleType);
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isSpotFree = false;
        return true;
    }
    public boolean removeVehicle(){
        this.vehicle = null;
        this.isSpotFree = true;
        return true;
    }

    public Double getParkingRate() {
        return this.parkingRate;
    }

    public abstract void assignParkingRate(Double parkingRate);

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}









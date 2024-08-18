package com.mentorship.lld.parkinglot.service.vehicle;

import com.mentorship.lld.parkinglot.model.ParkingTicket;
import com.mentorship.lld.parkinglot.model.VehicleType;

// Vehicle is an abstract class
public abstract class Vehicle {
    private int licenseNo;
    private ParkingTicket parkingTicket;
    private VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType) {
      this.vehicleType = vehicleType;
    }

    public void assignTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}








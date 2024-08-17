package com.mentorship.lld.parkinglot.service.vehicle;

import com.arijit.lld.parkinglot.model.ParkingTicket;
import com.arijit.lld.parkinglot.model.VehicleType;

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
}








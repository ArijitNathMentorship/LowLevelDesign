package com.mentorship.lld.parkinglot;

import com.mentorship.lld.parkinglot.model.ParkingTicket;
import com.mentorship.lld.parkinglot.service.ParkingFloor;
import com.mentorship.lld.parkinglot.service.parkingspot.CompactParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.LargeParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.MotorcycleParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.ParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.TruckParkingSpot;
import com.mentorship.lld.parkinglot.service.vehicle.MotorCycle;
import com.mentorship.lld.parkinglot.service.vehicle.Vehicle;

import java.util.Arrays;
import java.util.List;

public class ParkingLotSystemMain {
    public static void main(String[] args) {
        // Setup parking spots and floors
        List<ParkingSpot> spotsFloor1 = Arrays.asList(
                new LargeParkingSpot(),
                new CompactParkingSpot(),
                new TruckParkingSpot(),
                new MotorcycleParkingSpot()
        );

        List<ParkingSpot> spotsFloor2 = Arrays.asList(
            new LargeParkingSpot(),
            new CompactParkingSpot(),
            new TruckParkingSpot(),
            new MotorcycleParkingSpot()
        );

        ParkingFloor floor1 = new ParkingFloor(spotsFloor1);
        ParkingFloor floor2 = new ParkingFloor(spotsFloor2);

        ParkingLot parkingLot = new ParkingLot(Arrays.asList(floor1, floor2));
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem(parkingLot);

        // Example usage
        Vehicle vehicle1 = new MotorCycle();
        ParkingTicket ticket1 = parkingLotSystem.issueTicket(vehicle1);

        // Simulate leaving the parking lot
        if (ticket1 != null) {
            double payment = parkingLotSystem.processPayment(ticket1);
            System.out.println("Payment required: $" + payment);
        }
    }
}
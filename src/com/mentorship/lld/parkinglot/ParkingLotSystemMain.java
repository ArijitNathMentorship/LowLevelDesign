package com.mentorship.lld.parkinglot;

import com.mentorship.lld.parkinglot.constants.PaymentMode;
import com.mentorship.lld.parkinglot.model.ParkingTicket;
import com.mentorship.lld.parkinglot.service.ParkingFloor;
import com.mentorship.lld.parkinglot.service.parkingspot.CompactParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.LargeParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.MotorcycleParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.ParkingSpot;
import com.mentorship.lld.parkinglot.service.parkingspot.TruckParkingSpot;
import com.mentorship.lld.parkinglot.service.payment.Payment;
import com.mentorship.lld.parkinglot.service.vehicle.MotorCycle;
import com.mentorship.lld.parkinglot.service.vehicle.Vehicle;

import java.util.Arrays;
import java.util.List;

public class ParkingLotSystemMain {
    public static void main(String[] args) throws InterruptedException {
        // Setup parking spots and floors
        ParkingLotSystem parkingLotSystem = getParkingLotSystem();

        // Example usage
        Vehicle vehicle1 = new MotorCycle();
        ParkingTicket ticket1 = parkingLotSystem.issueTicket(vehicle1, 0);

        System.out.println("Ticket : " + ticket1.toString());

        // Simulating the Vehicle parked in Parking Lot
        System.out.println("Simulating the Vehicle parked in Parking Lot ... ");
        Thread.sleep(2000);

        // Simulate leaving the parking lot
        if (ticket1 != null) {
            double amount = parkingLotSystem.evaluateCharge(ticket1);
            System.out.println("Payment required: $" + amount);

            Payment payment = new Payment();
            payment.initiateTransaction(PaymentMode.DEBIT_CARD, amount);
        }
    }

    private static ParkingLotSystem getParkingLotSystem() {
        List<ParkingSpot> spotsFloor0 = Arrays.asList(
                new LargeParkingSpot("0F1", 70.0),
                new CompactParkingSpot("0F2", 50.0),
                new TruckParkingSpot("0F3", 100.0),
                new MotorcycleParkingSpot("0F4", 20.0)
        );

        List<ParkingSpot> spotsFloor1 = Arrays.asList(
            new LargeParkingSpot("1F1", 70.0),
            new CompactParkingSpot("1F2", 50.0),
            new TruckParkingSpot("1F3", 100.0),
            new MotorcycleParkingSpot("1F4", 20.0)
        );


        ParkingFloor floor1 = new ParkingFloor(spotsFloor0);
        ParkingFloor floor2 = new ParkingFloor(spotsFloor1);

        ParkingLot parkingLot = new ParkingLot(Arrays.asList(floor1, floor2));
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem(parkingLot);
        return parkingLotSystem;
    }
}
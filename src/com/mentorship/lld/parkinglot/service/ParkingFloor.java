package com.mentorship.lld.parkinglot.service;

public class ParkingFloor {
    private String name;
    private HashMap<String, HatchBackSpot> hatchBackSpots;
    private HashMap<String, LargeSpot> largeSpots;
    private HashMap<String, BikeSpot> bikeSpots;
    private HashMap<String, TruckSpot> truckSpots;
    private ParkingDisplayBoard displayBoard;
    private int freeHatchBackSpotCount;
    private int freeLargeSpotCount;
    private int freeBikeSpotCount;
    private int freeTruckSpotCount;
}

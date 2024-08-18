package com.mentorship.lld.parkinglot.service;

import com.mentorship.lld.parkinglot.service.parkingspot.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingDisplayBoard {
    // Data members
    private int id;
    private Map<String, List<ParkingSpot>> parkingSpots;

    // Constructor
    public ParkingDisplayBoard(int id) {
      this.id = id;
      this.parkingSpots = new HashMap<>();
    }

    public void showFreeSpot() {

    }
}
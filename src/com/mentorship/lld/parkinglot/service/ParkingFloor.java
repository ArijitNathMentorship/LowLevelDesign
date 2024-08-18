package com.mentorship.lld.parkinglot.service;

import com.mentorship.lld.parkinglot.model.VehicleType;
import com.mentorship.lld.parkinglot.service.parkingspot.ParkingSpot;

import java.util.HashMap;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;

    public ParkingFloor(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public ParkingSpot findAvailableSpot(VehicleType type) {
        for (ParkingSpot spot : spots) {
            if (spot.getIsFree() && spot.getVehicleType() == type) {
                return spot;
            }
        }
        return null;
    }

//    private String name;
//    private HashMap<String, List<CompactParkingSpot>> compactParkingSpotHashMap;
//    private HashMap<String, List<HandicappedParkingSpot>> handicappedParkingSpotHashMap;
//    private HashMap<String, List<LargeParkingSpot>> largeParkingSpotHashMap;
//    private HashMap<String, List<MotorcycleParkingSpot>> motorcycleParkingSpotHashMap;
//    private HashMap<String, List<TruckParkingSpot>> truckParkingSpotHashMap;
//    private ParkingDisplayBoard displayBoard;
//    private int availableCompactBackSpotCount;
//    private int availableLargeSpotCount;
//    private int availableBikeSpotCount;
//    private int availableTruckSpotCount;
//    private int availableHandicappedSpotCount;
//
//    public void addParkingSpot(ParkingSpot spot) {
//        switch (spot.getVehicleType()) {
//            case LARGE:
//                availableLargeSpotCount++;
//                largeParkingSpotHashMap.put(spot.getId(), (HatchBackSpot) spot);
//                break;
//            case LARGE:
//                availableLargeSpotCount++;
//                largeSpots.put(spot.getId(), (LargeSpot) spot);
//                break;
//            case BIKE:
//                availableBikeSpotCount++;
//                bikeSpots.put(spot.getId(), (BikeSpot) spot);
//                break;
//            case TRUCK:
//                availableTruckSpotCount++;
//                truckSpots.put(spot.getId(), (TruckSpot) spot);
//                break;
//            default:
//                System.out.println("Wrong parking spot type!");
//        }
//    }
//
//    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
//        spot.assignVehicle(vehicle);
//        switch (spot.getVehicleType()) {
//            case HATCHBACK:
//                availableHatchBackSpotCount--;
//                updateDisplayBoardForHatchBack(spot);
//                break;
//            case LARGE:
//                availableLargeSpotCount--;
//                updateDisplayBoardForLarge(spot);
//                break;
//            case BIKE:
//                availableBikeSpotCount--;
//                updateDisplayBoardForBike(spot);
//                break;
//            case TRUCK:
//                availableTruckSpotCount--;
//                updateDisplayBoardForTruck(spot);
//                break;
//            default:
//                System.out.println("Wrong parking spot type!");
//        }
//    }
//
//    private void updateDisplayBoardForHatchBack(ParkingSpot spot) {
//        if (Objects.equals(this.displayBoard.getHatchBackFreeSpot().getId(), spot.getId())) {
//            for (String key : hatchBackSpots.keySet()) {
//                if (hatchBackSpots.get(key).isSpotAvailable()) {
//                    this.displayBoard.setHatchBackFreeSpot(hatchBackSpots.get(key));
//                }
//            }
//            this.displayBoard.showEmptySpotNumber();
//        }
//    }
//
//    private void updateDisplayBoardForLarge(ParkingSpot spot) {
//        if (Objects.equals(this.displayBoard.getLargeFreeSpot().getId(), spot.getId())) {
//            for (String key : largeSpots.keySet()) {
//                if (largeSpots.get(key).isSpotAvailable()) {
//                    this.displayBoard.setLargeFreeSpot(largeSpots.get(key));
//                }
//            }
//            this.displayBoard.showEmptySpotNumber();
//        }
//    }
//
//    private void updateDisplayBoardForBike(ParkingSpot spot) {
//        if (Objects.equals(this.displayBoard.getBikeFreeSpot().getId(), spot.getId())) {
//            for (String key : bikeSpots.keySet()) {
//                if (bikeSpots.get(key).isSpotAvailable()) {
//                    this.displayBoard.setBikeFreeSpot(bikeSpots.get(key));
//                }
//            }
//            this.displayBoard.showEmptySpotNumber();
//        }
//    }
//
//    private void updateDisplayBoardForTruck(ParkingSpot spot) {
//        if (Objects.equals(this.displayBoard.getTruckFreeSpot().getId(), spot.getId())) {
//            for (String key : truckSpots.keySet()) {
//                if (truckSpots.get(key).isSpotAvailable()) {
//                    this.displayBoard.setTruckFreeSpot(truckSpots.get(key));
//                }
//            }
//            this.displayBoard.showEmptySpotNumber();
//        }
//    }
//
//    public void freeSpot(ParkingSpot spot) {
//        spot.removeVehicle();
//        switch (spot.getVehicleType()) {
//
//            case LARGE:
//                availableLargeSpotCount++;
//                break;
//            case COMPACT:
//                availableCompactBackSpotCount++;
//                break;
//            case BIKE:
//                availableBikeSpotCount++;
//                break;
//            case TRUCK:
//                availableTruckSpotCount++;
//                break;
//            default:
//                System.out.println("Wrong parking spot type!");
//        }
//    }
}

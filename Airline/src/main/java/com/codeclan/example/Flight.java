package com.codeclan.example;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int totalWeightAllowance;
    private int capacity;

    public Flight( String flightNumber, String destination, String departureAirport, String departureTime, int totalWeightAllowance, int capacity) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightAllowance = totalWeightAllowance;
        this.capacity = capacity;
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public int countSeatsAvailable() {
        return this.capacity - this.countPassengers();
    }

    public ArrayList<Pilot> getPilot() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMember() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getTotalWeightAllowance() {
        return totalWeightAllowance;
    }

    public int getCapacity() {
        return capacity;
    }

    public void bookPassenger(Passenger passenger) {
        if (countSeatsAvailable() > 0) {
            this.passengers.add(passenger);
        }
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add((pilot));
    }


    public void addCabinCrewMembers(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }
}

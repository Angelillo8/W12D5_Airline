package com.codeclan.example;

public class Pilot extends CrewMember {

    private String pilotLicenceNumber;
    public Pilot(String name, Rank rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String flyPlane() {
        return "I'm flying the plane.";
    }
}

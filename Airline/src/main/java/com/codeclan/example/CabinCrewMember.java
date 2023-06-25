package com.codeclan.example;

public class CabinCrewMember extends CrewMember{


    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessage() {
        return "Fasten your seat belts.";
    }
}

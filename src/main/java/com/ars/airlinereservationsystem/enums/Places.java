package com.ars.airlinereservationsystem.enums;

public enum Places {
    Lagos("Nigeria"),Abuja("Nigeria"),London("United Kingdom"),New_York("USA"),Honkong("China");
    private final String country;
    Places(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
}

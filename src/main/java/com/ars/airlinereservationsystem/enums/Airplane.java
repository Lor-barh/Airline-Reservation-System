package com.ars.airlinereservationsystem.enums;

public enum Airplane {
    BBJ(200),FREIGHTER(250),AEWC(300),P_40(350),KC_40(400);
    private final Integer capacity;
    Airplane(Integer capacity) {
        this.capacity = capacity;
    }
    public Integer getCapacity() {
        return capacity;
    }
}


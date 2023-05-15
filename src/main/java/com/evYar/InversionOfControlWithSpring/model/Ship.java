package com.evYar.InversionOfControlWithSpring.model;

import java.util.UUID;

public class Ship {
    private ShipType type;
    private UUID shipNumber;

    public Ship(ShipType type, UUID shipNumber) {
        this.type = type;
        this.shipNumber = shipNumber;
    }

    public ShipType getType() {
        return type;
    }

    public void setType(ShipType type) {
        this.type = type;
    }

    public UUID getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(UUID shipNumber) {
        this.shipNumber = shipNumber;
    }

    @Override
    public String toString() {
        return "Ship: " +
                "type=" + type +
                ", shipNumber=" + shipNumber +
                ".";
    }
}

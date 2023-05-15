package com.evYar.InversionOfControlWithSpring.services.cargoService;

import com.evYar.InversionOfControlWithSpring.model.Ship;

import static com.evYar.InversionOfControlWithSpring.model.ShipType.*;

public class CargoService {

    public String getCargo(Ship ship) {

        switch (ship.getType()) {
            case CONTAINER_SHIP: return "Containers";
            case TANKER: return "Liquid products";
            case DRY_CARGO: return "Solid and bulk cargoes";
            default: return "Cargoes";
        }
    }
}

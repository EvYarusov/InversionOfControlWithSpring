package com.evYar.InversionOfControlWithSpring.services.bookingShip;

import com.evYar.InversionOfControlWithSpring.model.Ship;
import com.evYar.InversionOfControlWithSpring.model.ShipType;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service(value = "dry_cargo")
public class BookDryCargoShipService implements BookingShipService {
    @Override
    public Ship getShip() {
        return new Ship(
                ShipType.DRY_CARGO,
                UUID.randomUUID()
        );
    }
}

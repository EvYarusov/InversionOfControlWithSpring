package com.evYar.InversionOfControlWithSpring.services.bookingShip;

import com.evYar.InversionOfControlWithSpring.model.Ship;
import com.evYar.InversionOfControlWithSpring.model.ShipType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service(value = "container")
@Primary
public class BookContainerShipService implements BookingShipService {
    @Override
    public Ship getShip() {
        return new Ship(
                ShipType.CONTAINER_SHIP,
                UUID.randomUUID()
        );
    }
}

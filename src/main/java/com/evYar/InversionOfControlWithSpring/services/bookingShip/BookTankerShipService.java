package com.evYar.InversionOfControlWithSpring.services.bookingShip;

import com.evYar.InversionOfControlWithSpring.model.Ship;
import com.evYar.InversionOfControlWithSpring.model.ShipType;
import com.evYar.InversionOfControlWithSpring.services.bookingShip.BookingShipService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service(value = "tanker")
public class BookTankerShipService implements BookingShipService {
    @Override
    public Ship getShip() {
        return new Ship(
                ShipType.TANKER,
                UUID.randomUUID()
        );
    }
}

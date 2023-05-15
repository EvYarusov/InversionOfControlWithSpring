package com.evYar.InversionOfControlWithSpring.services.fuel;

import com.evYar.InversionOfControlWithSpring.services.fuel.FuelService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"diesel", "default"})
public class DieselFuelService implements FuelService {
    @Override
    public void getFuel() {
        System.out.println("Diesel fuel is filled.");
    }
}

package com.evYar.InversionOfControlWithSpring.services.fuel;

import com.evYar.InversionOfControlWithSpring.services.fuel.FuelService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("gas")
public class GasFuelService implements FuelService {
    @Override
    public void getFuel() {
        System.out.println("Gas fuel is filled.");
    }
}

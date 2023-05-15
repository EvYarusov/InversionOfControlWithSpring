package com.evYar.InversionOfControlWithSpring.services.loadingService;

import com.evYar.InversionOfControlWithSpring.model.Ship;
import com.evYar.InversionOfControlWithSpring.services.cargoService.CargoService;
import org.springframework.beans.factory.annotation.Autowired;

public class CraneLoadingService implements LoadingService{

    private final CargoService cargoService;

    @Autowired
    public CraneLoadingService(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @Override
    public void getLoading(Ship ship) {
        System.out.println(cargoService
                .getCargo(ship) + " are loaded by crane.");
    }
}

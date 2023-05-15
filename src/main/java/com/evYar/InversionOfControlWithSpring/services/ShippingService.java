package com.evYar.InversionOfControlWithSpring.services;

import com.evYar.InversionOfControlWithSpring.model.Ship;
import com.evYar.InversionOfControlWithSpring.services.bookingShip.BookingShipService;
import com.evYar.InversionOfControlWithSpring.services.fuel.FuelService;
import com.evYar.InversionOfControlWithSpring.services.loadingService.LoadingService;
import com.evYar.InversionOfControlWithSpring.services.navigate.NavigateService;
import com.evYar.InversionOfControlWithSpring.services.techCheck.TechnicalCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    private final BookingShipService bookingShipService;
    private TechnicalCheckService technicalCheckService;
    @Autowired  //3. не рекомендуется использовать такой вариант
    private FuelService fuelService;

    private final LoadingService loadingService;

    @Autowired //1. №1 по распространенности
    public ShippingService(
            @Qualifier("dry_cargo")
            BookingShipService bookingShipService,
            LoadingService loadingService
    ) {
        this.bookingShipService = bookingShipService;
        this.loadingService = loadingService;
    }

    @Autowired //2. №2 по распространенности
    @Qualifier("technicalCheckServiceByComputer")
    public void setTechnicalCheckService(TechnicalCheckService technicalCheckService) {
        this.technicalCheckService = technicalCheckService;
    }

    public Ship startNewShipping() {
        Ship ship = bookingShipService.getShip();
        System.out.println("**New shipping is started. " + ship + "**");
        technicalCheckService.getTechnicalCheck();
        fuelService.getFuel();
        loadingService.getLoading(ship);
        return ship;
    }

    public void endShipping(Ship ship) {
        System.out.println("***Shipping is finish. Return " + ship + " to base.**");
        technicalCheckService.getTechnicalCheck();
        fuelService.getFuel();
    }
}

package com.evYar.InversionOfControlWithSpring.config;

import com.evYar.InversionOfControlWithSpring.services.cargoService.CargoService;
import com.evYar.InversionOfControlWithSpring.services.loadingService.ConveyorLoadingService;
import com.evYar.InversionOfControlWithSpring.services.loadingService.CraneLoadingService;
import com.evYar.InversionOfControlWithSpring.services.loadingService.PipeLoadingService;
import com.evYar.InversionOfControlWithSpring.services.navigate.GlonassNavigateService;
import com.evYar.InversionOfControlWithSpring.services.navigate.GpsNavigateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class LoadingServiceConfig {

    @Bean
    public CargoService cargoService() {
        return new CargoService();
    }

    @Bean
    @Primary
    public CraneLoadingService craneLoadingService(CargoService cargoService) {
        return new CraneLoadingService(cargoService);
    }
    @Bean
    public ConveyorLoadingService conveyorLoadingService(CargoService cargoService) {
        return new ConveyorLoadingService(cargoService);
    }
    @Bean
    public PipeLoadingService pipeLoadingService(CargoService cargoService) {
        return new PipeLoadingService(cargoService);
    }
}

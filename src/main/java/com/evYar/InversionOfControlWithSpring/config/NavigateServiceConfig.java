package com.evYar.InversionOfControlWithSpring.config;

import com.evYar.InversionOfControlWithSpring.services.navigate.GlonassNavigateService;
import com.evYar.InversionOfControlWithSpring.services.navigate.GpsNavigateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class NavigateServiceConfig {
    @Bean
    @Primary
    @Profile(value = "gps")
    public GpsNavigateService gpsNavigateService() {
        return new GpsNavigateService();
    }
    @Bean
    @Profile(value = "glonass")
    public GlonassNavigateService glonassNavigateService() {
        return new GlonassNavigateService();
    }

}

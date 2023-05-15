package com.evYar.InversionOfControlWithSpring.services.navigate;

public class GpsNavigateService implements NavigateService{
    @Override
    public void getNavigate() {
        System.out.println("*Navigating by GPS...*");
    }
}

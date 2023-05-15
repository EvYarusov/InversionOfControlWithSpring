package com.evYar.InversionOfControlWithSpring.services.navigate;

public class GlonassNavigateService implements NavigateService{
    @Override
    public void getNavigate() {
        System.out.println("*Navigating by GLONASS...*");
    }
}

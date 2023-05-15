package com.evYar.InversionOfControlWithSpring.services.techCheck;

import org.springframework.stereotype.Service;

@Service
public class TechnicalCheckServiceByHuman implements TechnicalCheckService {

    @Override
    public void getTechnicalCheck() {
        System.out.println("Technical check by human is done.");
    }
}

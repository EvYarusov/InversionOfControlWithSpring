package com.evYar.InversionOfControlWithSpring.services.techCheck;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TechnicalCheckServiceByComputer implements TechnicalCheckService {

    @Override
    public void getTechnicalCheck() {
        System.out.println("Technical check by computer is done.");
    }
}

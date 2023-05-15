package com.evYar.InversionOfControlWithSpring;



import com.evYar.InversionOfControlWithSpring.model.Ship;
import com.evYar.InversionOfControlWithSpring.services.ShippingService;
import com.evYar.InversionOfControlWithSpring.services.navigate.NavigateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCwithSpringApp {

	private static ShippingService shippingService;
	private static NavigateService navigateService;
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(
				IoCwithSpringApp.class, args
		);

		shippingService = applicationContext.getBean(
				ShippingService.class
		);

		navigateService = applicationContext.getBean(
				NavigateService.class
		);

		Ship ship = shippingService.startNewShipping();
		navigateService.getNavigate();

		shippingService.endShipping(ship);
		navigateService.getNavigate();
	}
}

package hu.cubix.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.cubix.airport.service.PriceService;

@SpringBootApplication
public class AirportApplication implements CommandLineRunner {
	
	@Autowired
	PriceService priceService; // get the price Service add for object
  // main method after createad
	// new interface for discountService
	public static void main(String[] args) {
		SpringApplication.run(AirportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// made sysout print to console of priceService result
		System.out.println(priceService.getFinalPrice(100));
		System.out.println(priceService.getFinalPrice(2000));
	}

}

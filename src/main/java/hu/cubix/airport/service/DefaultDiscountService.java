package hu.cubix.airport.service;

import org.springframework.stereotype.Service;

//@Service
public class DefaultDiscountService implements DiscountService {

	@Override
	public int getDiscountPercent(int totalPrice) {
		// TODO Auto-generated method stub
		return 10;
	}
  
	
	
}

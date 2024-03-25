package hu.cubix.airport.service;

import org.springframework.stereotype.Service;

@Service
public class PriceService {
  	
   private DiscountService discountService; // made the discount service active
   
    
   public PriceService(DiscountService discountService) {
	super();
	this.discountService = discountService;
}



public int getFinalPrice(int price) {
	   return (int) (price/100.00*(100- discountService.getDiscountPercent(price)));
	   // add the discount to price 
	   
   }
}

package hu.cubix.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import hu.cubix.airport.config.AirportConfigurationProperties;
import hu.cubix.airport.config.AirportConfigurationProperties.Discount.Special;

public class SpecialDiscountService implements DiscountService{
	
//	@Value("${airport.discount.special.limit}")
//	private int limit;
//	@Value("${airport.discount.special.lowerPercent}")
//	private int lowerPercent;
//	@Value("${airport.discount.special.highPercent}")
//	private int highPercent;
	
	@Autowired
	private AirportConfigurationProperties config;
	
	@Override
	public int getDiscountPercent(int totalPrice) {
		Special specialConfig = config.getDiscount().getSpecial();
		return totalPrice > specialConfig.getLimit() ? specialConfig.getHighPercent() : specialConfig.getLowerPercent();
	}

}

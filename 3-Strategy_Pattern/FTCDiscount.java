package com.priceCalculation;

public class FTCDiscount implements CalculateDiscount{
	
	public double discount(double amount){
		return amount - amount*0.15;
	}

}

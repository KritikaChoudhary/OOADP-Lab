package com.priceCalculation;

public class RCDiscount implements CalculateDiscount{
	
	public double discount(double amount){
		return amount - amount*0.12;
	}
}

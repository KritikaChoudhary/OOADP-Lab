package com.priceCalculation;

public class SCDiscount implements CalculateDiscount {

	public double discount(double amount){
		return amount - amount*0.1;
	}
}

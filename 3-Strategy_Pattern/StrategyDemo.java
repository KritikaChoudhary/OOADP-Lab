package com.priceCalculation;
import java.util.Scanner;

public class StrategyDemo {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
			System.out.println("Name:");
			String name = scanner.next();
			System.out.print("Total price of items:");
			double amount = scanner.nextDouble();
			customer.displayDetails(name, amount);
	}

}

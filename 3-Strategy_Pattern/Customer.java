package com.priceCalculation;
import java.util.Scanner;

public class Customer {
	
	static Scanner scanner = new Scanner(System.in);		
		public void displayDetails(String name, double amnt){
			CalculateDiscount discount;
			double totalAmount = 0;
			System.out.println("Enter customer type:\n1.Regular Customer\n2.Senior Citizen\n3.First time Customer");
			int ch;
			ch = scanner.nextInt();
			
			switch(ch){
			case 1: discount = new RCDiscount();
					totalAmount = discount.discount(amnt);
					break;
			case 2: discount = new SCDiscount();
					totalAmount = discount.discount(amnt);
					break;
			case 3: discount = new FTCDiscount();
					totalAmount = discount.discount(amnt);
					break;
			default: System.out.println("Enter valid choice");
			}
			
			System.out.println("Name:"+name);
			System.out.println("Please pay:"+totalAmount);
		}
	}


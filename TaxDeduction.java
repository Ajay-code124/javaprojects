package com.tax;

import java.util.Scanner;

public class TaxDeduction {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your salary :");
		
		double salary = input.nextDouble();
		
		
		if(salary>=0 && salary<250000) {
			System.out.println("There is no Tax for you..!!");
		}
		
		else if(salary>=250000 && salary<500000) {
			double tax = (5*salary)/100;
			System.out.println("Tax for your salary is  : "+tax);
			
		}
		else if(salary>=500000 && salary<1000000) {
			double tax = (20*salary)/100;
			System.out.println("Tax for your salary is  : "+tax);
			
		}
		else if(salary>=1000000 ) {
			double tax = (30*salary)/100;
			System.out.println("Tax for your salary is  : "+tax);
			
		}
		else {
			System.out.println("Enter salary in positive number..");
		}

	}

}

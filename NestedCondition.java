package NestedConditionalStatetment;

import java.util.Scanner;

public class NestedCondition {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the age : ");
		Scanner sc = new Scanner(System.in);
		int age= sc.nextInt();
		
		System.out.println("Enter the boolean value : ");
		Scanner value = new Scanner(System.in);
		 boolean hasLicense = value.nextBoolean();
		if(age>=18) {
			if(hasLicense) {
				
				System.out.println("You are eligible for the  drive...!");
				
			}
			else {
				System.out.println("Apply for the driving license...!");
				
			}
		}
		
		else {
			System.out.println("Your age is not eliglible for drive..!");
		}
	}

}

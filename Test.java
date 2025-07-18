package com.methods;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number..");
		

		int num1 = input.nextInt();
		
		System.out.println("Enter second number..");
		int num2 = input.nextInt();
		
		Test t = new Test(); // instance method so we can call it with object
		int result = t.sumofTwoNumbers(num1, num2); // calling method by passing two variable values
		
		System.out.println(result/2);
		
	}
	
	
	int sumofTwoNumbers(int a, int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}
}

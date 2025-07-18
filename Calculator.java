package com.switchexapmple;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the operator : ");
		
		Scanner sc1 = new Scanner(System.in);
		 char operator = sc1.next().charAt(0);
		
		System.out.println("Enter the num1 : ");
		
		 
		  
		  
		  
		  Scanner sc2 = new Scanner(System.in);
		  
		  int num1 = sc2.nextInt();

		  System.out.println("Enter the num2 : ");
       Scanner sc3 = new Scanner(System.in);
		  
		  int num2 = sc3.nextInt();
		  
		  
		  switch(operator) {
		  case '+':
			  System.out.println(num1 +num2);
			  break;
			  
		  case '-':
			  System.out.println(num1 - num2);
			  break;
		
		  case '*':
			  System.out.println(num1 * num2);
			  break;
		
		  case '/':
			  System.out.println(num1 / num2);
			  break;
		
		  case '%':
			  System.out.println(num1 % num2);
			  break;
			  
			default :
				
				System.out.println("Invalid character");
			  
		  }
		  
		  
		
	}

}

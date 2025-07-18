package com.SwitchProject;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("menu");
		
		System.out.println("1.Chicken Biryani");
		System.out.println("2.Paneer Biryani");
		System.out.println("3.Egg Dum Biryani");
		
		
		System.out.println("Enter menu number: ");
		
	  int num = input.nextInt();
	  switch(num) {
	  
	  case 1: 
		  System.out.println("Your chicken biryani is ready");
		  break;
		  
	  case 2: 
		  System.out.println("Your paneer biryani is reay");
		  break;
		  
	  case 3: 
		  System.out.println("Your Egg  biryani is ready");
		  break;
		  
		default:
			 System.out.println("Invalid number");
	  }
	  }
		
		
		
		
	}


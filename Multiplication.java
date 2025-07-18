package com.loop;

import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number..");
		int num = input.nextInt();
		
		for(int i=1;i<=20;i++) {
			
			int mul = num*i;
			
			System.out.println(num+" * "+i+" = "+mul);
			
		}
	}

}

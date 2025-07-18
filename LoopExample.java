package com.loop;

import java.util.Scanner;

public class LoopExample {

	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number..");
		
		int num = input.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println(i+"Hello World");
		}
		
		while(num<=6) {
			System.out.println(num);
			num++;
			
		}
		
		do {
			System.out.println(num);
		}
		while(num<=10);
		
	}
}

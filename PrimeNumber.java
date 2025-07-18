package com.prime;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
	
		
		PrimeNumber p = new PrimeNumber();
		p.prime();
		p.prime2();
		
		
	}
	
	void prime() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number..");
		
		int num= input.nextInt();
	
	    int count =0;
	
	long starttime = System.currentTimeMillis();
	
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count +=1;
		}
	}
	if(count==2) {
		System.out.println("It is a prime number");
	}
	else {
		System.out.println("It's not a prime number");
		
		long endtime = System.currentTimeMillis();
		
		long totaltime = (endtime -starttime);
		System.out.println("Total time :"+totaltime);
		
	}
	}
	
	void prime2() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number..");
		
		int num= input.nextInt();
		int count =0;
		
		long starttime = System.currentTimeMillis();
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				count +=1;
			}
		}
		if(count==0) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It's not a prime number");
			
			long endtime = System.currentTimeMillis();
			
			long totaltime = (endtime -starttime);
			System.out.println("Total time :"+totaltime);
			
		}
	}

}

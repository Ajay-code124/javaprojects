package com.nested.loop;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num value..");
		int num = input.nextInt();
		
		for(int i=num;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	}
}

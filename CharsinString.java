package com.nested.loop;

import java.util.Scanner;

public class CharsinString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your string: ");
		String str = input.nextLine();
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
	}
}

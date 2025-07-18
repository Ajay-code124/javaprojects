package com.methods;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a strung :");
		String name = input.nextLine();
			ReverseString r = new ReverseString();
			String result = r.reverse(name);
			System.out.println("Reverse String is : "+result);
		
	}
	
	
	String reverse(String s) {
	  
		String result = "";
		
		for(int i=(s.length()-1);i>=0;i--) {
			result+=s.charAt(i);
			
		}
return result;
	}

}

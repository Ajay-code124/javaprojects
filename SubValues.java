package com.methods;

import java.util.Scanner;

public class SubValues {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter as String :");
		
		String word = input.nextLine();
		
		
		
		SubValues s1 = new SubValues(); 
		s1.Values(word);
		//System.out.println(result);
		
		
	}
	
	void Values(String s) {
		
		/*for(int k=0;k<=s.length()-1;k++) {
			s=s.substring(k, s.length());
		for(int i=0;i<=s.length()-1;i++) {
			
			
			
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(j)+" ");
			}
			
			
			System.out.println();
			
		} */
		
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length();j++) {
			
		          String result =	s.substring(i,j);
		          System.out.println(result);
		
		}
			
	
		}

}
}

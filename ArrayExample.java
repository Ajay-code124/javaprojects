package com.arrays;

import java.util.Scanner;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		
		
		
		//System.out.println(arr.length); //in array class length is variable not method so paranthesis not required..
	
		
		/* Scanner input = new Scanner(System.in);
		System.out.println("Enter thwe array Size : ");
		
		int size = input.nextInt();
		
		double[] arr2 = new double[size];
		
		
		for(int i=0;i<arr2.length;i++) {
			
			System.out.println("Enter the marks of students "+(i+1));
			
			arr2[i]=input.nextDouble();
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println("Student "+(i+1)+" marks is : "+arr2[i]);
		} */
		
		ArrayExample.IntArray();
		ArrayExample.charArray();
		
	}
	
	 static void IntArray( ) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter thwe array Size : ");
		
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter the array value "+(i+1));
			
			   arr[i] = input.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Age of "+(i+1)+" employee  "+arr[i]);
		}
		
		
		
	}
	 
	 
	 static void charArray( ) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the char array Size : ");
			
			int size = input.nextInt();
			
			char[] arr = new char[size];
			
			for(int i=0;i<arr.length;i++) {
				
				System.out.println("Enter the array value "+(i+1));
				
				   arr[i] = input.next().charAt(0);
			}
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("last name of "+(i+1)+" employee  "+arr[i]);
			}
			
			
			
		}

}

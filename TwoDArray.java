package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
//2D array will have same size in rows and columns it will work as array
public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter row size..");
		int size1 = input.nextInt();
		
		System.out.println("Enter column size..");
		int size2 = input.nextInt();
		
		int[][] arr = new int[size1][size2];
		
		
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.println("Enter the value...");
				int num = input.nextInt();
				arr[i][j] = num;
				}
		}
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
		
		
		
		
		
	}
}

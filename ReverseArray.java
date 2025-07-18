package com.arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] arr = {24,42,36,16};
		int[] res = ReverseArray.reverse(arr); //calling method here
		
		for(int array_values : res) {
			
			System.out.println(array_values);
			
		}
		
		
		System.out.println(); 
		
		int[] arr2 = {40,30,22,46,80};
		
         int[] while_res = ReverseArray.usingWhile(arr2); //calling method here
		
		for(int while_array : while_res) {
			
			System.out.println(while_array);
			
		}
		
		
	}
	
	// ---------------------------------------------------
	
	static int[] reverse(int[] arr) {
		
		int[] new_arr = new int[arr.length];
		
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			
			new_arr[j] = arr[i];
			
			j++;
		}
		
		return new_arr;
	}
	
	
//	-----------------------------------------
	
	
	static int[]   usingWhile(int[] arr2) {

		int[] swap_arr = new int[arr2.length];
		
		int start =0;
		int end=arr2.length-1;
		
		while(end>start) {
			
			int temp = arr2[start];
			arr2[start]=arr2[end];
			arr2[end] = temp;
			
			start++;
			end--;
		}
		return arr2;
	}

}

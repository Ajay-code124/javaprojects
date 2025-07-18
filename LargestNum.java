package com.arrays;

public class LargestNum {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0]=3;
		arr[1]=12;
		arr[2]=6;
		arr[3]=35;
		arr[4]=20;
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
			else if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("Maximum value is : "+max);
		System.out.println("Minimum value is : "+min);
	}

}

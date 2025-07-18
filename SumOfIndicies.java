package General_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfIndicies {
	
	public static void sum(int[] arr, int target) {
		
	 Map <Integer, Integer> map = new HashMap<>();
		
		int n=arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1;j<n;j++) {
				
				if(arr[i]+arr[j]==target) { 
					map.put(i, j);
					
				}
			}
			
		}
		System.out.println(map);
		return;
		
	}	
	public static void main(String[] args) {
		
		int[] arr= {5,3,4,2,1};
		int target=6;
		sum(arr, target);
	}

}

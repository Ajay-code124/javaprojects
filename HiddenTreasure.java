package DataStracture;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class HiddenTreasure {
	
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int N = sc.nextInt();
		//Number of elements in the array
		int[] nums = new int[N]; 
		
		//Read the Array 
		for(int i=0; i<N; i++) {
			nums[i] =sc.nextInt();
		}
		
		//Map to count how many times each sum of digits appear in array
		Map<Integer, Integer> SumDigitsCount = new HashMap<>();
		
		for(int num : nums) {
			
			int digitSum = sumOfDigits(num);
			SumDigitsCount.put(digitSum, SumDigitsCount.getOrDefault(digitSum,0)+1);
			
			
			
		}
		
		//Count the valid pairs 
		int result =0;
		for(int count : SumDigitsCount.values()) {
			if(count>1) {
				result += count *(count-1)/2;
			}
		
		}
		System.out.println(result);
		
		
		sc.close();
		
		
		
	}


	private static int sumOfDigits(int num) {
		// TODO Auto-generated method stub
		int sum =0;
		while(num>0) {
		sum += num%10;
		num/=10;
		}
		return sum;
	}
}


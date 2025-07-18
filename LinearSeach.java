package Search_Algorithm;

import java.util.Scanner;

public class LinearSeach {
	
	public static int linearsearch(int [] arr, int target){
		
		int n= arr.length;
		
		for(int i=0; i<n;i++) {
			
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size:");
		
		int[] arr= new int[sc.nextInt()];
		
		System.out.println("Enter the "+arr.length+" Values");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the target value");
		
		int target=sc.nextInt();
		
       int result= linearsearch(arr, target);
       System.out.println(result);
        
}
}

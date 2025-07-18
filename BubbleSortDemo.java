package SortAlgorithm;

import java.util.Arrays;


import java.util.Scanner;

public class BubbleSortDemo {
	public static void bubblesort(int[] arr) {
		 int n= arr.length; //5
		 
		 for (int i=0;i<n;i++) {
		  
			 for (int j=0;j<n-1-i;j++) //4
			 {
				 
				 if (arr[j]>arr[j+1]) 
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
				
	         }
		 
		 }
		 System.out.println(Arrays.toString(arr));
    	}
public static void main(String[] args) {
		
	//Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the size");
	//int[] arr=new int[sc.nextInt()];
	//System.out.println("Enter the "+ arr.length+" values");
	//for(int i=0; i<arr.length;i++)
	//arr[i]=sc.nextInt();
	//}
	
	
	
	int[] arr= {2,4,5,6,1};
	
	bubblesort(arr);
	

	
    }
		
	}

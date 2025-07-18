//import com.program;

import java.util.Scanner;

public class SumOfNum {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number..");
		
		int num = input.nextInt();
		
		int sum=0;
		
		
		while(num>0) {
			int m = num%10;
			sum +=m;
			num=num/10;
			
		}
		
		System.out.println(sum);
	}

}

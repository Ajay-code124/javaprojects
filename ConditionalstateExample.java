package ConditionalStatetment;

import java.util.Scanner;

public class ConditionalstateExample {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int marks = input.nextInt();
		if(marks>90 && marks <=100) {
			System.out.println("Grade A");
		}
		else if(marks>70 && marks <=90) {
			System.out.println("Grade B");
		}
		
		else if(marks>50 && marks <=70) {
			System.out.println("Grade C");
		}
		else if(marks>0 && marks <=50) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}

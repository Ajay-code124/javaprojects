package flm.db.operators;

import java.util.Scanner;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		int a= 10;
		int b=9;
		
		boolean isALarge  = (a>b)?true:false;
		System.out.println(isALarge);
		
		String result =  (a>b)? "a is big": "a is small";

		System.out.println(result);
		
		int num =4;
		//nested ternary operator
		String r = (num>0)?"Positive":(num==0)?"Zero":"Negative";
     
		System.out.println(r);
	
		Scanner num1 = new Scanner(System.in); //dynamic input
		 
		int marks =num1.nextInt();
		
		String grade = (marks>90 && marks <= 100 )?"Grade A":(marks>70 && marks <= 90)?"Grade B":(marks>50 && marks<=70)?"Grade C":(marks>0 && marks<=50)?"Fail":"Invalid";
	  
		System.out.println(grade);
		
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine(); //to accept spaces also
		
		Scanner s2  = new Scanner(System.in);
		String name= sc.next(); //without spaces it will give inputs..
	}
}

package General_Programs;

import java.util.Scanner;

public class Noofoccurance {
	
	public static  void Stringcount(String s, char c) {
		s=s.toLowerCase();
		
		int count=0;
		for(int i=0; i<s.length();i++) {
			
			char ch= s.charAt(i);
			
			if (ch==c) {
				count=count+1;
			}
		
		
		}
		
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the input string");
	
     String s= sc.nextLine(); // Reading String
     
     System.out.println("Enter the char");
     char c= sc.next().charAt(0); // Reading char
	
		
     Stringcount(s,c);
			
		
	}

}

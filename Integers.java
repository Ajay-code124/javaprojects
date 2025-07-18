package General_Programs;

import java.util.Scanner;

public class Integers {

	
	public static void main(String args[]) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string here : ");
		String word = s.next();
		
		boolean result=get_intgers_string(word);
		
		System.out.println(result);
		
	}

	private static boolean get_intgers_string(String word) {
		// TODO Auto-generated method stub
		for(int i=0; i<word.length();i++) {
			
			char ch = word.charAt(i);
			
			if (Character.isDigit(ch)) {
				return false;
			}
			
		}
		
		return true;
	}

}

package General_Programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Substring {
	
	public static void  lengthofsubstring(String s) {
		s=s.toLowerCase();
		
		Set<Character> set= new HashSet<>();
		
		int maxlength=0;
		
		for(int i=0; i<s.length(); i++) {
			
			char currchar=s.charAt(i);
			
			while (set.contains(currchar)){
				set.remove(currchar);
				maxlength--;
				
			}
			
			
		  set.add(currchar);
		  maxlength= maxlength+1;
		}
			
	System.out.println(maxlength);
		}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s = sc.nextLine();
		
		lengthofsubstring(s);
		
		
	}

}

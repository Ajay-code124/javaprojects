package General_Programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static String RemoveDuplicates(String str) {
		
		
			
			Set<Character> ch = new HashSet<>();
			  String result="";
			  for(int i=0; i<str.length(); i++) {
			   char c=str.charAt(i);
			if (ch.contains(c)) {
				continue;
			}
			else {
				ch.add(c);
				result+=c;
			}
			
		}
		
		return result;
	}
	
	private static Character CharAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String args[]) {
		
		
		 String str="aabbeecd";
		 
		 String result= RemoveDuplicates(str);
		 
		 System.out.println(result);
	}

}

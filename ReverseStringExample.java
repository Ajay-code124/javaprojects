package General_Programs;

public class ReverseStringExample {

	public static void main(String[] args) {
		
		String s="Ramesh";
		int length=s.length();		
		String new_string="";
		
		for(int i=0; i<length;i++) {
			
			char c = s.charAt(i);
			new_string=c+new_string;
			
		
			
		}
		
		System.out.println(new_string);
	}
}

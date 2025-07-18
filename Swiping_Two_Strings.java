package General_Programs;

public class Swiping_Two_Strings {
	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 ="World";
		
		System.out.println("Before swapping "+str1+" "+str2);
		
		str1 = str1+str2;
		int total_length = str1.length()-str2.length();
		str2 = str1.substring(0,total_length);
		int str2length = str2.length();
		str1 = str1.substring(str2length);
		
		System.out.println("After swapping "+str1+" "+str2);
		
		
		
	}

}

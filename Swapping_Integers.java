package General_Programs;

public class Swapping_Integers {

	
	public static void main(String[] args) {
		int a = 10;
		int b=20;
		
		System.out.println("Before swapping "+a+" "+b);
		
		
		a = a+b;
		b=  a-b;
		a = a-b;
		
		System.out.println("After swapping "+a+" "+b);
		

		
		
	}
}

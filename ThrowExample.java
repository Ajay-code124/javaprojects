package General_Programs;

public class ThrowExample {
	
	public static void main(String args[]) {
	
	   int n =15;
	   
	   if (n<18) {
		   throw new ArithmeticException("Access denied - you must be 18+");
	   }
	   
	   System.out.println("Access granted");

}
}

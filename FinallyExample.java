package General_Programs;

public class FinallyExample {
	
	public static void main(String[] args) {
		
	
		 
		try {
			//String s = null;
			//System.out.println(s.length());
			
			float f =10/0;
			
			System.out.println(f);
		}
		// catch(NullPointerException e) {
			// System.out.println("Caught a null pointer exception !");
		
		//}
		catch(ArithmeticException e) {
			System.out.println("Caught a Arithmetic Exception");
		}
		
		finally {
			System.out.println("Finally block is always executed..");
		}
	}

}

package flm.db.operators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		boolean b1 = true;
		
		boolean b2 = false;
		
		boolean b3 = true;
		
		boolean b4 = false;
		
		System.out.println(b1 && b2);
		
		System.out.println(b1 && b3);
	
		System.out.println(b1 || b2);
		
		System.out.println(!b3);
		
		System.out.println(b1 && b2 && b3);
		
		System.out.println(b1 || b2 && b3);
		
		System.out.println(b1 || b2 && b3 ||b4);
		
		//&& has highest precedence
		//true || false && true || false 
		//true || false || false
		//true || false
		//true
		

		
	
		
		
		
	}

}

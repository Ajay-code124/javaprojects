package flm.db.operators;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b=20;
		int add=a+b;
		
		System.out.println("addition "+add);
		System.out.println(a+b+"ab");
		System.out.println(a+" + "+b+" -> "+(a+b));
		System.out.println("divide "+26/5);
		System.out.println("percentaile "+26%5);
		System.out.println(a*b);
		System.out.println(a+" + "+ b +" -> "+ (b-a));
		int c=10;
		float e = 7.0f;
		float f = 2.0f;
		
		System.out.println(e%f);
		System.out.println(e+f);
		System.out.println(e-f);
		System.out.println(e/f);
		System.out.println(e*f);
		System.out.println(c+" * "+ e+" -> "+(c*e));//Bodmas rule
		
		a += 2;
		System.out.println(a);
		a -= 2;
		System.out.println(a);
		a *=2 ;
		System.out.println(a);
		a /=2 ;
		System.out.println(a);
		a %=2 ; //remainder
		System.out.println(a);
		
		
	}

}

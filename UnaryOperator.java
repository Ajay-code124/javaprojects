package flm.db.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		
		long a= 10;
		long b=-20;
		boolean flag = false;
		
		System.out.println(+a);
		System.out.println(-a);
		
		System.out.println(-b);
		
		System.out.println(!flag);
		boolean result = !flag;
		System.out.println(result);
		
		a=15;
		b=20;
		System.out.println(a);//15
		System.out.println(a++); //15
		System.out.println(a); //16
		System.out.println(++a);//17
		
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(b);
		a=20;
		long add = a++ + ++a;
		//20+ 22=42
		System.out.println(add);
		
		a=10;
		b=15;
		
		long value = --b + a++ - --a;
		//14+10 - 10
		//24-10 =14
		System.out.println(value);
		
		a=5;
		b=10;
		long v = a++ + --b * ++a;
		// 5 + 9 *7
		//5+63 =68
		System.out.println(v);
		
	}
}

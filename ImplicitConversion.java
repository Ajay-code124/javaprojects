package com.converstions;

public class ImplicitConversion {
	
	public static void main(String[] args) {
		
		byte b=127;
		short s=b;
		
		int i=s;
		long l=i;
		
		float f =32.5678f;
		double d = f;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
	}

}

package com.converstions;

public class ExplicitConversion {
	
	
	public static void main(String args[]) {
		
		
	short s = 98;
	
	byte b = (byte) s;
	
	long  l=1200000;
	int i = (int) l;
	
	
	double d = 56.5555;
	float f = (float) d;
	
	char c = (char) b; //It gives ASCII value
	float f2 ='&'; //It gives ASCII value
	
	System.out.println(s);
	System.out.println(b);
	System.out.println(l);
	System.out.println(i);
	System.out.println(d);
	System.out.println(f);
	System.out.println(c);
	System.out.println(f2);
	
	
	
	}

}

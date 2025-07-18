package com.methods;

public class StringMethod {
	
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2="Hello World";
	   String s3="hello";
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s2.contains(s1));
		System.out.println(s1.lastIndexOf('l'));
		System.out.println(s1.substring(1,4));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s3));
		
		String s4 = "    Hello  World    ";
		String s5 ="ELEPHANT";
		System.out.println(s4.length());
		System.out.println(s4.trim());
		System.out.println(s2.replace("l", "K"));
		System.out.println(s3.toUpperCase());
		System.out.println(s5.toLowerCase());
	}

}

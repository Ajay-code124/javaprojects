package com.arrays;

import java.util.Arrays;

public class SplitMethod {
	
	public static void main(String[] args) {
		
		String s = "This is a Java class";
		
		String[] word = s.split(" "); // split() is a string method..
		
		System.out.println(Arrays.toString(word));
		
		//toString is a method calling from Arrays class.
		
		
		String s2 = "Array,is,a,fixed,size";
		
		String[] split = s2.split(",");
		
		System.out.println(Arrays.toString(split));
		
		

		String s3 = "FLM";
		
		String[] space = s3.split("");
		
		System.out.println(Arrays.toString(space));
	}

}

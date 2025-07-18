package com.breakexample;

public class ContinueExample {
	
	public static void main(String[] args) {
		
		
	  for(int i = 1;i<=100;i++)
	  {
		if(i%8==0) {
			continue;
		}
		
		System.out.println(i);
	}

}
}

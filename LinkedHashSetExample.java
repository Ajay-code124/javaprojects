package Collection_Set_Interface;

import java.util.LinkedHashSet;

//it maintains the insertion order and implements set it maintain insertion order 
//it contains only unique values

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		LinkedHashSet <String> lh= new LinkedHashSet<>();
		lh.add("Java");
		lh.add("Python");
		lh.add("React Js");
		lh.add("Python");
		
		System.out.println(lh); //ignored duplicate values and maintain insertion order
		//System.out.println(lh.get(1));
	}

}

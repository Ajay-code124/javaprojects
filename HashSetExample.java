\package Collection_Set_Interface;

import java.util.HashSet;

//Set is used to implement the list Set interface and it used Hash table to store the elements 
//Set contains unique elements and doesn't maintain order.


public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet <String> h= new HashSet<>();
		h.add("Apple");
		h.add("Banana");
		h.add("Pineapple");
		h.add("Apple");
		
		System.out.println(h);
		h.remove("Pineapple");
	//	System.out.println(h.get(1));
		
		
	}

}

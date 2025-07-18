package Collection_List_Interface;

import java.util.ArrayList;

//ArrayList in java is resizeable array it implements List interface.
//It maintains insertion order and allows duplicates and null values

public class ArrayListExample { 
	
	public static void main(String[] args) {
		
		ArrayList<String> s= new ArrayList<>();
		
		s.add("Apple");
		s.add("Banana");
		s.add("Pineapple");
		s.add("Mango");
		
		System.out.println(s);
		
		System.out.println(s.get(0));
		
		System.out.println(s.remove("Pineapple"));
		
		System.out.println(s.add("Watermelon"));
		
		System.out.println(s.add("Apple"));
		
		System.out.println(s.add(""));
		
		System.out.println(s);
		
	}

}

package Collection_List_Interface;

import java.util.Vector;

// Vector are also like array List it implements List interface and resizeable array.
// It contains null and duplicate values and maintain insertion order.
//It is thread safe

public class VectorExample {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("Tomato");
		v.add("Brinjal");
		v.add("Potato");
		
		System.out.println(v);
		System.out.println(v.get(1));
	}

}

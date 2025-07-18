package Collection_Map_Interface;

import java.util.TreeMap;

//TreeMap is also stores the key value pair it implements the navigable map interface 
//it is maintains sorted order

public class TreeMapExample {
	

	public static void main(String[] args) {
		
		TreeMap<String, Integer> t = new TreeMap<>();
		 t.put("Banana",1);
		 t.put("Apple", 2);
		 t.put("Mango", 3);
		 
		 System.out.println(t);
		 System.out.println(t.get("Banana"));
	}
		

	}

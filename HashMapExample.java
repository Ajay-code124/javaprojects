package Collection_Map_Interface;

import java.util.HashMap;

//HashMap in java implements the map and uses hashtable, it is used to key value pair, it doesn't maintain any order 
//When we call key in hash map it internally calls the hashcode() method based on the size it will module with string code and store the value..


public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> h= new HashMap<>();
		
		 h.put("Banana",1);
		 h.put("Apple", 2);
		 h.put("Mango", 3);
		 h.put("Orange", 3);
		 
		 System.out.println(h);
				 System.out.println(h.get("Banana"));
	}

}

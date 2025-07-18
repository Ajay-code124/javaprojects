package Collection_Map_Interface;


import java.util.LinkedHashMap;

//it implements map interface it also stored key value pairs and maintain insertion order
public class LinkedHashMapExample {


	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> h= new LinkedHashMap<>();
		
		 h.put("Banana",1);
		 h.put("Apple", 2);
		 h.put("Mango", 3);
		 
		 System.out.println(h);
		 System.out.println(h.get("Banana"));
	}

}



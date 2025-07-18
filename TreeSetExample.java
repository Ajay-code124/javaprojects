package Collection_Set_Interface;

import java.util.TreeSet;

// Hashet it implements the Navigable set interface which extends the sorted set 
// It used to store the unique elements and maintain insertion order

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> t= new TreeSet<>();
		  t.add(20);
		  t.add(30);
		  t.add(10);
		  t.add(60);
		  t.add(50);
		  t.add(20);
		  
		  System.out.println(t);
		
	}

}

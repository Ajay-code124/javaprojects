package Collection_List_Interface;

import java.util.LinkedList;

//LikedList is a linear data structure that is used to store the elements in nodes,
//nodes contains data and reference to the next and previous data. 
//It is implemented both List and queue so that it can perform operations like arraylist and like queue/dequeue.
public class LinkedListExample {

	
	public static void main(String[] args) {
		
		LinkedList <String> l= new LinkedList<>();
		
		l.add("John");
		l.add("Bob");
		l.add("Alice");
		l.add("John");
		
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.add("chalies"));
		System.out.println(l);
		l.addFirst("Alex");
		System.out.println(l);
	}
}

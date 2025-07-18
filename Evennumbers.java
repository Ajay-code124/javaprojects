package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Evennumbers {
	
	

	public static void main(String[] args) {
		
		ArrayList <Integer> nums = new ArrayList<Integer>();
		    
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(6);
		
		List<Integer> even = 
				nums.stream().filter(x -> x % 2 ==0).collect(Collectors.toList());
		
		System.out.println("Even numbers are:"+even)
		;
	}

}

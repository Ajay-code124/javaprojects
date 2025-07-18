package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
	
	
		public static void main(String[] args) {
			
			List<String> nums = new ArrayList<>();
			nums.add("John");
			nums.add("David");
			nums.add("Alex");
			
			List<String> sorted = nums.stream().sorted().collect(Collectors.toList());
			
			System.out.println(sorted);
		}
	}



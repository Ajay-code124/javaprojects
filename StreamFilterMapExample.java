package Stream;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMapExample {

	public static void main(String[] args) {
		
		List<String> nums = new ArrayList<>();
		nums.add("John");
		nums.add("David");
		nums.add("Alex");
		
		List<String> even = nums.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(even);
	}
}

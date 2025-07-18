package General_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopKFrequentElements {
	
	public static List<Integer> topKFrequent(int[] nums, int k){
		Map<Integer, Integer> freqMap = new HashMap<>();
		for(int num : nums) {
			freqMap.put(num,freqMap.getOrDefault(num,0)+1);//(nums, count)
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>>  maxHeap = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
		maxHeap.addAll(freqMap.entrySet());
		
		List<Integer> result = new ArrayList();
			for(int i=0 ; i<k && ! maxHeap.isEmpty();i++) {
				result.add(maxHeap.poll().getKey());
			}
		
		
		return result;
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size or n value");
		
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		System.out.println("Enter the n elemnts :");
		
		for(int i=0; i<n;i++) {
			
			nums[i]=sc.nextInt();
				
		}
		
		System.out.println("Enter the frequent k value");
		int k= sc.nextInt();
		
		List<Integer> topK = topKFrequent(nums, k);
		System.out.println("Top "+k+" frequent elements: "+topK);
		
		
		
	}

}

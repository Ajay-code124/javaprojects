package Rs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	public static int[][] merge(int[][] intervals){
		
		if (intervals.length<=1)
			return intervals;
		
		Arrays.sort(intervals, Comparator.comparing(a -> a[0]));
		
		List<int[]> result = new ArrayList<>();
		int[] current = intervals[0]; 
		result.add(current);
		
		for(int[] interval : intervals) {
			int currentEnd =current[1];
			int nextStart = interval[0];
			int nextEnd =interval[1];
			if (nextStart <= currentEnd) {
				current[1]=Math.max(currentEnd, nextEnd);
				
			}
			else {
				current=interval;
				result.add(current);
			}
		}
		
		return result.toArray(new int[result.size()][]);
	}
	
	public static void main(String args[]) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		
		
		int[][] merged = merge(intervals);
		
		System.out.println("Merged Intervals : ");
		
		for(int[] interval : merged) {
			System.out.println(Arrays.toString(interval));
		}
		
		
		
	}

}

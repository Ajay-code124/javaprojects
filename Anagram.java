package General_Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
		
		if (str1.length() != str2.length()){
			 return false;
		}
		char [] arr1= str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
		
		
	}
	
	public static void main(String args[]) {
		
		String str1="listen";
		String str2="silent";
		
		Boolean result= isAnagram(str1,str2);
		System.out.println(result);
	}

}

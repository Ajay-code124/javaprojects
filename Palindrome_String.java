package Rs;

public class Palindrome_String {
	
	

	public static boolean isPalindrome(String s1) {
		int left = 0 ;
		int right=s1.length()-1;
		while(left<right) {
		
		if(s1.charAt(left)!=s1.charAt(right)) 
			return  false;
			left --;
			right++;
			
			
		
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		String s1= "madam";
		if(isPalindrome(s1)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.println("It is not a palindeome");
		}
	}

}

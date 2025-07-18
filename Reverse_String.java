package Rs;

public class Reverse_String {
	
	public static void main(String args[]) {
		
		String name="Realme";
		String s=name.toLowerCase();
		String reversed="";
		int length=s.length();
		
		for(int i=0;i<length;i++) {
			
			reversed=s.charAt(i)+reversed;
			
		}
		
		System.out.println(reversed);
		
	}

}

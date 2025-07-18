package Rs;

public class String_Compression {
	
	public static String compress(String str) {
		
		StringBuffer sb = new StringBuffer();
		int count=1;
		for(int i=1; i<str.length();i++) {
			if(str.charAt(i-1)==str.charAt(i)) {
				count++;
				
			}
			else {
				sb.append(str.charAt(i-1)).append(count);
			}
			
		}
		
		sb.append(str.charAt(str.length()-1)).append(count);
		return sb.toString();
		
		
	}

	
	
	public static void main(String args[]) {
		String input= "aaabbccdee";
		System.out.println("Compressed "+compress(input));
		
	}
}

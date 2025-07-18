package General_Programs;

public class ThrowsExample {
	
	public static void checkFile() throws java.io.IOException{
		
		throw new java.io.IOException("File not Found");
		
	}
	
	public static void main(String[] args) {
		try {
			checkFile();
		}
		catch(java.io.IOException e) {
			
			System.out.println("Caught: "+e.getMessage());
		}
	}

}

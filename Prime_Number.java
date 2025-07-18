package Rs;

public class Prime_Number {
	public static boolean isPrime(int b) {
		
	if (b<=1){
		return false;
	}
	if (b==2){
		return true;
	}
	for(int i=2; i*i<=b;i++) {
		if(b%i==0) {
			return false;
		}
	}
	return true;
	}
	
	
	public static void main(String args[]) {
		
		int num=29;
		
		if(isPrime(num)) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
			
	}

}

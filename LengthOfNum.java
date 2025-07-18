import java.util.Scanner;

public class LengthOfNum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter yuour number..");
		
		int num = input.nextInt();
		
		int count =0;
		
		while(num>0) {
			num=num/10;
			count=count+1;
		}
		System.out.println("Length of your num is "+count);
	}

}

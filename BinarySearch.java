package Search_Algorithm;

public class BinarySearch {
	
	public static int Binarysearch(int[] arr,int target) {
		
		int left=0;
		int right=arr.length-1; //6-1=5
		
		while(left<right) //0<5 True -1<5 True -2<5, -3<5, -4<5
			{
			int mid= left+(right-left)/2;  //0+(5-0)/2==2 //-1+(5+1)/2 = -1+3 ==2 //-2+(5+2)/2=-2+3==1 //-3+(5+3)/2=-3+4 ==1 //-4+(5+4)/2=-4+4==0
			if (arr[mid]==target) { //arr[0]==22 22==22
				return mid;
			}
			if (arr[mid]>target) { //34>22 
				left=left-1;   //-1 -2 -3 -4
			}
			else {
				right=right+1;
			}
		}
			return -1;
		}
	
	public static void main(String args[]) {
		
		int[] arr= {22,34,44,66,76,80};
		
	   int target=22;
	   
	   int result=Binarysearch(arr, target);
	   if (result==-1){
		   System.out.println(result);
	   }
	   else {
	   System.out.println(result);
	   }
		
		
	}

}

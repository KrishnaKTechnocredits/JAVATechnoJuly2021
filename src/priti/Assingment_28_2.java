package priti;

public class Assingment_28_2 {
	int findNthHightestNumFromArray(int []arr) {
		int max=0;
		int maxAtNthIndex=0;
		for (int index=0;index<arr.length;index++) {
			if (arr[index]>max) {
			max=arr[index];
			maxAtNthIndex=index;
			}
		}
		arr[maxAtNthIndex]=0;
		//System.out.println(max);
		return max;
	}
	
	int findNthHighestNumber(int []arr, int nMAx) {
		 int nthmax=0;
		for (int index=0;index<nMAx;index++ ) {
			nthmax=findNthHightestNumFromArray(arr);
		} 
		//System.out.println(nthmax);
		return nthmax;
	 }
	
	
	
	
	public static void main(String[] a) {
		Assingment_28_2 assingment_28_2 =new Assingment_28_2();
		int	[]arr = {10,23,2,11,55,43,99};
		int nthHigest=3;
		//int output =assingment_28_2.findNthHightestNumFromArray(arr);
		//System.out.println("Max highest number is : "+output);
		int output1=assingment_28_2.findNthHighestNumber(arr,nthHigest);
		System.out.println("nth highest number is : "+output1);
	}
	
}
/*Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/



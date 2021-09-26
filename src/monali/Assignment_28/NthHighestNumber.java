package monali.Assignment_28;
/*Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/

public class NthHighestNumber {
	
	int getMaxNumber(int arr[]) {
		
		int max=0;
		int maxIndex=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>max) {
				max=arr[index];
				maxIndex=index;
			}
		}
		arr[maxIndex]=0;
		return max;
	}
	
	int getnthHighest(int arr[], int nthHighest ) {
		
		int nthHighestNum=0;
		
		for(int index=0;index<nthHighest;index++) {
			nthHighestNum=getMaxNumber(arr);	
		}
		
		
		return nthHighestNum;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,2,11,55,43,99};
		NthHighestNumber nthhighest=new NthHighestNumber();
		int input=3;
		System.out.println(input+" rd highest number in array : "+ nthhighest.getnthHighest(arr,input));
		
	}
}

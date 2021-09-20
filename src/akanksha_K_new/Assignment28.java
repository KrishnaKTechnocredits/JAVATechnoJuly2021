package akanksha_K_new;

import java.util.Arrays;

public class Assignment28 {
	
	//To find the Second Highest number
	void getSecondHighestNumber(int[] arr) {
		int maxnumber = arr[0];
		int secondHighest = arr[1];
		if (maxnumber <  secondHighest) {
			maxnumber = arr[1];
			secondHighest = arr[0];
		}
		for (int index=2; index<arr.length;index++) {
			if(maxnumber < arr[index]) {
				secondHighest = maxnumber;
				maxnumber = arr[index];
			} else if(secondHighest<arr[index]) {
				secondHighest = arr[index];
			}
		}
		System.out.println("Second highest number: " +Arrays.toString(arr) + " is " +secondHighest);
			
	}
	
	//nth highest number
	int getMaxNum(int input[]) {
		int maxnum = input[0];
		int maxIndexPosition = 0;
		for (int index=0; index<input.length; index++) {
			if(maxnum<input[index]) {
				maxnum= input[index];
				maxIndexPosition = index;		
			}
		}
		return maxIndexPosition;
	}	
		
	void getHighestsum(int input[], int nNumber) {
		int num = nNumber-1;
		while(num>0) {
			int index = getMaxNum(input);
			input[index]=0;
			num--;
		}
		int index = getMaxNum(input);
		System.out.println(nNumber +"rd highest number is: " +input[index]);
	}		
		
	public static void main(String[] args) {
		int[] arr= {10,23,2,11,55,43,99};
		Assignment28 assi = new Assignment28();
		assi.getSecondHighestNumber(arr);
		assi.getHighestsum(arr, 3);
	}
}

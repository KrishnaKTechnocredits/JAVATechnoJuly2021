package chirag.codingTest;

import java.util.Arrays;

public class ShiftAllZeroAtTheEndOfAnArray {
	
	void isShiftArray(int [] arr) {
		System.out.println("Given Array : "+Arrays.toString(arr));
		int [] input = new int[arr.length];
		int countindex = 0;
		for(int index = 0;index < arr.length;index++) {
			if(arr[index] !=0) {
				input[countindex]=arr[index];
				countindex++;
			}
		}
				System.out.println("After shifting zero at the end of an array : "+Arrays.toString(input));
	}
	public static void main(String[] args) {
		ShiftAllZeroAtTheEndOfAnArray allZeroAtTheEndOfAnArray = new ShiftAllZeroAtTheEndOfAnArray();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		allZeroAtTheEndOfAnArray.isShiftArray(arr);
	}

}

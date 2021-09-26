package chirag.assignment31;

import java.util.Arrays;

public class FindConsecutiveNumber {
	
	void isConsecutiveNumber(int [] arr) {
		System.out.println("Given array : "+Arrays.toString(arr));
		boolean status = false;
		for(int index=0; index < arr.length -2;index++) {
			if(arr[index]+1 == arr [index +1])
				if(arr[index +1]+1 == arr[index +2]) {
					System.out.println("Consecutive numbers in a given array : "+arr[index]+","+arr[index+1]+","+arr[index+2]);
			status = true;
		}
		}
		if(status == false)
			System.out.println("No consecutive number");
		
	}
	public static void main(String[] args) {
		FindConsecutiveNumber consecutiveNumber = new FindConsecutiveNumber();
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		int[] arr1 = {10,12,14,17,18,10,33,89,44,77};
		consecutiveNumber.isConsecutiveNumber(arr);
		consecutiveNumber.isConsecutiveNumber(arr1);
		
	}

}

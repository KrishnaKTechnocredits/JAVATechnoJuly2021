package akshay;

import java.util.Arrays;

public class ArrayMatching {
	
	void getResult(int[] arr1, int[] arr2) {
		boolean b = false;
		if(arr1.length != arr2.length) {
			System.out.println("Arrays are not identical");
		}
		else {
			for(int index = 0; index <= arr1.length-1; index++) {
				if(arr1[index] == arr2[index]) {
					b = true;
					continue;
				}
				else
					b = false;
					break;
			}
			if(b)
				System.out.println("Arrays are identical");
			else
				System.out.println("Arrays are not identical");
		}
		
	}
	
	public static void main(String[] args) {
		ArrayMatching arrayMatching = new ArrayMatching();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		System.out.println("Array 1: " +Arrays.toString(arr1));
		System.out.println("Array 2: " +Arrays.toString(arr2));
		arrayMatching.getResult(arr1, arr2);
		System.out.println();
		
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		System.out.println("Array 1: " +Arrays.toString(arr3));
		System.out.println("Array 2: " +Arrays.toString(arr4));
		arrayMatching.getResult(arr3, arr4);
		System.out.println();
		
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		System.out.println("Array 1: " +Arrays.toString(arr5));
		System.out.println("Array 2: " +Arrays.toString(arr6));
		arrayMatching.getResult(arr5, arr6);
		
		
	}
}

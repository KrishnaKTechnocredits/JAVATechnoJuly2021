package kalpesh;

import java.util.Arrays;

public class Assignment_27 {
	void getArrayIdentical(int[] arr1, int[] arr2) {
		if (Arrays.equals(arr1, arr2)) {
			System.out.println(Arrays.toString(arr1) + " and " + Arrays.toString(arr2));
			System.out.println("Arrays are identical");
		} else {
			System.out.println(Arrays.toString(arr1) + " and " + Arrays.toString(arr2));
			System.out.println("Arrays are not identical");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		Assignment_27 assignment_27 = new Assignment_27();
		assignment_27.getArrayIdentical(arr1, arr2);
	}

}

/*
 * Assignment - 27 : 2nd Sep'2021
 * 
 * WAP to find 2 arrays are identical or not. 
 * int[] arr1 = {10,12,55,32,17};
 * int[] arr2 = {10,12,55,32,17}}; 
 * output : Identical
 */
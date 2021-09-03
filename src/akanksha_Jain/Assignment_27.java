package akanksha_Jain;

import java.util.Arrays;

public class Assignment_27 {
	
	void getArrayIdentical(int[] arr1, int[] arr2) {
		if(Arrays.equals(arr1, arr2)) {
			System.out.println(Arrays.toString(arr1) + " and " + Arrays.toString(arr2));
			System.out.println("Arrays are identical");
		}
		else {
			System.out.println(Arrays.toString(arr1) + " and " + Arrays.toString(arr2));
			System.out.println("Arrays are not identical");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		Assignment_27 assignment_27 = new Assignment_27();
		assignment_27.getArrayIdentical(arr1, arr2);
		assignment_27.getArrayIdentical(arr3, arr4);
		assignment_27.getArrayIdentical(arr5, arr6);
	}
}

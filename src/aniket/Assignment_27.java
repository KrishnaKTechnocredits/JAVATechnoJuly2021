package aniket;

import java.util.Arrays;

public class Assignment_27 {
	void isIdentical(int[] arr1, int[] arr2) {

		if (Arrays.equals(arr1, arr2)) {
			System.out.println(Arrays.toString(arr1)+"and"+Arrays.toString(arr2));
			System.out.println("Both arrays are identical");
		}
		else {
			System.out.println(Arrays.toString(arr1)+"and"+Arrays.toString(arr2));
			System.out.println("Both arrays are not identical");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		int[] arr3 = { 10, 12, 55, 32, 17,99};
		int[] arr4 = { 10,55, 32, 17,99};
		Assignment_27 assignment_27_1 = new Assignment_27();
		assignment_27_1.isIdentical(arr1, arr2);
		assignment_27_1.isIdentical(arr2, arr3);
		assignment_27_1.isIdentical(arr3, arr4);
		
	}
}

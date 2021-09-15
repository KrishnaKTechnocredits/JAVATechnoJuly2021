package suruchi.Assignment27;

import java.util.Arrays;

public class IdenticalArrays_A27 {

	void verifyIdenticalArrays(int[] arr1, int[] arr2) {
		boolean flag = false;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index])
					flag = true;
				else {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Output: Both arrays are identical");
			else
				System.out.println("Output: Both arrays are not identical");
		} else
			System.out.println("Output: Both arrays are not identical");
	}

	public static void main(String[] args) {
		IdenticalArrays_A27 identicalArrays_A27 = new IdenticalArrays_A27();

		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };

		System.out.println("Arrays inputs provided: ");
		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));

		System.out.println();
		identicalArrays_A27.verifyIdenticalArrays(arr1, arr2);

		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };

		System.out.println("\nArrays inputs provided: ");
		System.out.println("Array 1: " + Arrays.toString(arr3));
		System.out.println("Array 2: " + Arrays.toString(arr4));

		System.out.println();
		identicalArrays_A27.verifyIdenticalArrays(arr3, arr4);

		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };

		System.out.println("\nArrays inputs provided: ");
		System.out.println("Array 1: " + Arrays.toString(arr5));
		System.out.println("Array 2: " + Arrays.toString(arr6));

		System.out.println();
		identicalArrays_A27.verifyIdenticalArrays(arr3, arr4);
	}
}
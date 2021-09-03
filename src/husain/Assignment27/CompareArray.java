package husain.Assignment27;

import java.util.Arrays;

public class CompareArray {

	void compArray(int arr1[], int arr2[]) {

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
		} else
			flag = false;
		if (flag)
			System.out.println("Arrays are identical");
		else
			System.out.println("Arrays are not identical");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareArray comp = new CompareArray();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		System.out.println("Array1: " + Arrays.toString(arr1));
		int[] arr2 = { 10, 12, 55, 32, 17 };
		System.out.println("Array2: " + Arrays.toString(arr2));
		comp.compArray(arr1, arr2);

		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		System.out.println("\n\nArray3: " + Arrays.toString(arr3));
		int[] arr4 = { 10, 12, 55, 32, 17 };
		System.out.println("Array4: " + Arrays.toString(arr4));
		comp.compArray(arr3, arr4);

		int[] arr5 = { 10, 12, 55, 32, 17 };
		System.out.println("\n\nArray5: " + Arrays.toString(arr5));
		int[] arr6 = { 10, 12, 99, 32, 17 };
		System.out.println("Array6: " + Arrays.toString(arr6));
		comp.compArray(arr5, arr6);

	}

}

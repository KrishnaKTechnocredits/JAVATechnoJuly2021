package madhavi;

import java.util.Arrays;

public class Assignment_27 {
	void comparisionOfArrayList1() {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Given two arrays are identical :-");
			System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));
		} else {
			System.out.println("Given two arrays are not identical -:");
			System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));
		}
	}

	void comparisionOfArrayList2() {
		int[] arr1 = { 10, 12, 55, 32, 17, 99 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Given two arrays are identical :-");
			System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));

		} else {
			System.out.println("Given two arrays are not identical :-");
			System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));
		}
	}

	void comparisionOfArrayList3() {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 99, 32, 17 };
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Given two arrays are identical :-");
			System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));
		} else {
			System.out.println("Given two arrays are not identical :-");
			System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));
		}
	}

	public static void main(String[] args) {
		Assignment_27 assignment_27 = new Assignment_27();
		assignment_27.comparisionOfArrayList1();
		System.out.println("----------------------------------");
		assignment_27.comparisionOfArrayList2();
		System.out.println("----------------------------------");
		assignment_27.comparisionOfArrayList3();
	}
}

package amol_Pawar.assignment_27;

import java.util.Arrays;

public class Assignment_27 {

	boolean getIdenticalArray(int[] input1, int[] input2) {

		if (input1.length != input2.length)
			return false;

		for (int index = 0; index < input1.length; index++) {
			if (input1[index] != input2[index])
				return false;
		}

		return true;
	}

	void displayResult(boolean flag, int arr[], int arr2[]) {
		if (flag)
			System.out.println(
					"Given array " + Arrays.toString(arr) + " and " + Arrays.toString(arr2) + " : is identical");
		else
			System.out.println(
					"Given array " + Arrays.toString(arr) + " and " + Arrays.toString(arr2) + " : is not identical");
	}

	public static void main(String[] args) {
		Assignment_27 assignment_27 = new Assignment_27();
		int[] input1 = { 10, 12, 55, 32, 17 };
		int[] input2 = { 10, 12, 55, 32, 17 };
		boolean flag = assignment_27.getIdenticalArray(input1, input2);
		assignment_27.displayResult(flag, input1, input2);

		int[] arr1 = { 10, 12, 55, 32, 17, 99 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		boolean flag1 = assignment_27.getIdenticalArray(arr1, arr2);
		assignment_27.displayResult(flag1, arr1, arr2);

		int[] arr3 = { 10, 12, 55, 32, 17 };
		int[] arr4 = { 10, 12, 99, 32, 17 };
		boolean flag2 = assignment_27.getIdenticalArray(arr3, arr4);
		assignment_27.displayResult(flag2, arr3, arr4);

	}
}

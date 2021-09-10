package amol_Pawar.Test4;

import java.util.Arrays;

public class ProgrammingTest_4 {

	void displayArray(int input[]) {
		int arr[] = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				arr[count] = input[index];
				count++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + ",");

		}
	}

	public static void main(String[] args) {
		ProgrammingTest_4 programmingTest_4 = new ProgrammingTest_4();

		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		programmingTest_4.displayArray(arr);
	}

}

package amol_Pawar.programmingtest3;

import java.util.Arrays;

public class ProgrammingTest_3 {

	void removeSpecifiedElement(int input[], int num) {
		int count = 0;
		int arr[] = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != num) {
				arr[count] = input[index];
				count++;
			}
		}

		System.out.println("Array after revesing String is given below");
		for (int index = 0; index < count; index++) {
			System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		ProgrammingTest_3 programmingtest_3 = new ProgrammingTest_3();
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int num = 14;
		programmingtest_3.removeSpecifiedElement(input, num);
	}
}

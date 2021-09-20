package amol_Pawar.assignment_33;

import java.util.Arrays;

public class Program_1 {

	void getNonZeroAtEnd(int input[]) {
		int count = 0;

		int arr[] = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				count++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				arr[count] = input[index];
				count++;
			}
		}
		System.out.println("Array with Non Zero at ends is: "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		int input[] = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		program_1.getNonZeroAtEnd(input);
	}
}
/*
 * Program 1 : shift all non zeros at the end. input :
 * {1,0,3,4,0,2,88,0,0,22,34}; output : [0,0,0,0,1,3,4,2,88,22,34]
 */

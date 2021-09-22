package amol_Pawar.assignment_33;

import java.util.Arrays;

public class Program_2 {

	void getAllNegativeAtBeginning(int input[]) {
		int count = 0;
		int arr[] = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				arr[count] = input[index];
				count++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				arr[count] = input[index];
				count++;
			}
		}
		System.out.println("Arrays with all negative numbers at the beginning is " + Arrays.toString(arr));
	}

	public static void main(String[] args) {// TODO Auto-generated method stub
		Program_2 program_2 = new Program_2();
		int[] input = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		program_2.getAllNegativeAtBeginning(input);
	}
}
/*
 * Program 2: place all negative numbers at the beginning and all positive
 * numbers at the end. input = {1,-3,-2,11,44,55,-76,33,12}; output :
 * [-3,-2,-76,1,11,44,55,33,12]
 */

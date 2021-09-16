package neha.assignment_33;
/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/

import java.util.Arrays;

public class Program1 {
	void displayArrayAfterShiftingNonZeroNum(int[] arr) {
		int oLength = arr.length;
		int[] output = new int[oLength];
		int count = 0;
		for (int i = 0; i < oLength; i++) {
			if (arr[i] == 0)
				count++;
		}
		for (int i = 0; i < oLength; i++) {
			if (arr[i] != 0) {
				output[count] = arr[i];
				count++;
			}
		}
		System.out.println("Array after shifting non zeros to the end is " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		int[] input = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		program1.displayArrayAfterShiftingNonZeroNum(input);
	}
}

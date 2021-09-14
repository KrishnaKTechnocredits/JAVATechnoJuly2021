package dattaraj;

import java.util.Arrays;

public class Assignment33_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		Assignment33_P4 p4 = new Assignment33_P4();
		p4.getMaximumTripletFromArray(input);
	}

	 void getMaximumTripletFromArray(int[] input) {
		// TODO Auto-generated method stub
		 int sum = 0, maxSum = 0;
		 int startIndex = 0;
		 for (int index = 0; index < input.length - 2; index++) {
				if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2) {
					sum = input[index] + input[index + 1] + input[index + 2];
					if (sum > maxSum) {
						maxSum = sum;
						startIndex = index;
					}
				}
		 }
			int[] output = new int[3];
			int count = 0;
			for (int index = startIndex; index < startIndex + 3; index++) {
				output[count] = input[index];
				count++;
			}
			System.out.println(Arrays.toString(output) + " is a triplet having maximum Sum");
	}

}

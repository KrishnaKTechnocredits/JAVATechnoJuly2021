package devendra_Assignment_33;

import java.util.Arrays;

public class Assignment33_A_SequenceMaxSum {
	int[] getTriplet(int[] input) {
		int sum = 0;
		int max = 0;
		int[] output = new int[3];
		for(int index = 0; index < input.length - 2; index++) {
			if(input[index] + 1 == input[index + 1] && input[index + 1] + 1 == input[index + 2]) {
				sum = input[index] + input[index + 1] + input[index + 2];
				if(sum > max) {
					max = sum;
					for(int index1 = 0; index1 <output.length; index1++) {
						output[index1] = input[index + index1];
					}
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment33_A_SequenceMaxSum obj = new Assignment33_A_SequenceMaxSum();
		int[] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		System.out.println("Input Array = "+Arrays.toString(input));
		int[] output = obj.getTriplet(input);
		System.out.println("The Triple which in Sequence & have Max Sum = "+Arrays.toString(output));
	}
}

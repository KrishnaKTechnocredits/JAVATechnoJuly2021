package shreya_assignment_34;

import java.util.Arrays;

public class SumAfterEachTriple {
	int[] addSumAfterTriplet(int[] input) {
		int[] output;
		int count = 0;
		for(int index = 0; index < input.length-2; index++) {
			if(input[index]+1 == input[index+1] && input[index]+2 == input[index+2]) {
				count++;
			}
		}
		output = new int[input.length+count];
		int outputIndex = 0;
		int index = 0;
		for(index = 0; index < input.length-2; index++) {
			if(input[index]+1 == input[index+1] && input[index]+2 == input[index+2]) {
				output[outputIndex] = input[index];
				output[outputIndex+1] = input[index+1];
				output[outputIndex+2] = input[index+2];
				output[outputIndex+3] = input[index] + input[index+1] + input[index+2];
				index += 2;
				outputIndex += 4;
			}
			else {
				output[outputIndex] = input[index];
				outputIndex++;
			}
			
		}
		if(index == input.length-1)
			output[outputIndex] = input[index];
		return output;
	}
	void displayNewArray(int[] input) {
		System.out.println("After placing sum of triple after each triple which in sequence:");
		int[] output = addSumAfterTriplet(input);
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		SumAfterEachTriple sumAfterEachTriple = new SumAfterEachTriple();
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		sumAfterEachTriple.displayNewArray(input);
	}

}

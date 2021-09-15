package chirag.assignment33;

import java.util.Arrays;

/*Assignment - 33 : 11th Sep'2021
Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]
*/

public class NegativeNumAtBeginPositiveAtEnd {
	
	void getNegativeAtBeginPositiveAtEnd(int [] input) {
		int [] output = new int [input.length];
		int outputIndex=0;
		for(int index = 0;index < input.length;index++) {
			if(input[index] < 0) {
				output[outputIndex]=input[index];
				outputIndex++;	
			}
		}
		for(int index=0;index < input.length;index++) {
			if(input[index] > 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		NegativeNumAtBeginPositiveAtEnd negativeNumAtBeginPositiveAtEnd = new NegativeNumAtBeginPositiveAtEnd();
		int [] input = {1,-3,-2,11,44,55,-76,33,12};
		negativeNumAtBeginPositiveAtEnd.getNegativeAtBeginPositiveAtEnd(input);
	}
}
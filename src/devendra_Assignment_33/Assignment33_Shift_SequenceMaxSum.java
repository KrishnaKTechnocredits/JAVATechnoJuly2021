package devendra_Assignment_33;

import java.util.Arrays;

public class Assignment33_Shift_SequenceMaxSum {
	/*P1*/
	int[] shiftAllNonZerosAtEnd(int[] input) {
		int[] output1 = new int[input.length];	
		int zeroCnt = 0;
		for(int index = 0; index < input.length; index++) {	
			if(input[index] == 0)
				zeroCnt++;

		}
		for(int index1 = 0; index1 < input.length; index1++) {
			if(input[index1] != 0) {
				output1[zeroCnt] = input[index1];
				zeroCnt++;
			}
		}
		return output1;
	 }
	/*P2*/
	int[] shiftAllPositiveAtEnd(int[] input) {
		int[] output2 = new int[input.length];	
		int negativeCnt = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] < 0) {
				output2[negativeCnt] = input[index];	
				negativeCnt++;					
			}			
		}
		for(int index1 = 0; index1 < input.length; index1++) {
			if(input[index1] > 0) {
				output2[negativeCnt] = input[index1];
				negativeCnt++;
			}
		}
		return output2;
	 }
	/*P3*/
	int[] placeNegativeZeroPositiveInSequence(int[] input) {
		int[] output3 = new int[input.length];	
		int negativeCnt=0;
		int zeroCnt=0;
		for(int index = 0; index < input.length; index++) {
			if(input[index]<0) {
				output3[negativeCnt]=input[index];
				negativeCnt++;
			}
			else if(input[index] == 0) {
				zeroCnt++;
			}
		}
		int positiveStartIndex = negativeCnt + zeroCnt;
		for(int index1 = 0; index1 < input.length; index1++) {
			if(input[index1] > 0) {
				output3[positiveStartIndex] = input[index1];
				positiveStartIndex++;
			}
		}
		return output3;
	 }
	
	public static void main(String[] args) {
		Assignment33_Shift_SequenceMaxSum obj = new Assignment33_Shift_SequenceMaxSum();
		int[] input = {1,0,-3,4,0,-2,88,0,0,22,-34};
		System.out.println("Input Array = "+Arrays.toString(input));
		int[] output1 = obj.shiftAllNonZerosAtEnd(input);
		System.out.println("After Shifting Non Zeros to end, Array = "+Arrays.toString(output1));
		int[] output2 = obj.shiftAllPositiveAtEnd(input);
		System.out.println("After Shifting Positive Aside, Array = "+Arrays.toString(output2));
		int[] output3 = obj.placeNegativeZeroPositiveInSequence(input);
		System.out.println("After Placing all in Sequence of -ve 0 +ve, Array = "+Arrays.toString(output3));
	}
}

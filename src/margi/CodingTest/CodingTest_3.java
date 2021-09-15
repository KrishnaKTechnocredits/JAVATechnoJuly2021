package margi.CodingTest;

import java.util.Arrays;

public class CodingTest_3 {
	
	int[] removeNum(int[] input, int num) {
		int[] output = new int[input.length-1];
		int innerIndex;
		for(int index=0; index<input.length; index++) {
			if(input[index]==num) {
				innerIndex=index;
				while(innerIndex < input.length-1){
					input[innerIndex]=input[innerIndex+1];
					innerIndex++;
				}
			}
		}
		for(int index=0; index<output.length;index++) {
			output[index]=input[index];
		}
		return output;
	}
	
	public static void main(String[] args) {
		CodingTest_3 codingTest_3 = new CodingTest_3();
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] output = codingTest_3.removeNum(input,14);
		System.out.println(Arrays.toString(output));
	}
}

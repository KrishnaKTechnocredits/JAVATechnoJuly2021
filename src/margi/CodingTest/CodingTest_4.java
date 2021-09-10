package margi.CodingTest;

import java.util.Arrays;

public class CodingTest_4 {
	
	int[] processData(int[] input) {
		int temp=0;
		int[] output = new int[input.length];
		for(int index=0; index<input.length; index++) {
			if(input[index]!=0) {
				output[temp]=input[index];
				temp++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		CodingTest_4 codingTest_4 = new CodingTest_4();
		System.out.println(Arrays.toString(codingTest_4.processData(arr)));
	}
}

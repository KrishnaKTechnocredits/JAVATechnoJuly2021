package avinash.codingtest;

import java.util.Arrays;

public class CodingTest4 {
	void shiftzeroatLast(int[] input) {
		int[] output = new int[input.length];
		int zeroCount =0; 
		int nonZeroCount=0;
		for(int index=0;index<output.length;index++) {
			if(input[index]!=0) {
				output[nonZeroCount]=input[index];
				nonZeroCount++;
			}
			else {
				output[(output.length-1)-zeroCount]=input[index];
				zeroCount++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodingTest4 test4 = new CodingTest4();
		int[] input = {1,0,0,6,0,2,3,0,4,0,5};
		test4.shiftzeroatLast(input);
		
	}


}

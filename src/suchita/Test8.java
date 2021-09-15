package suchita;

//Test 8

//How many pairs can be created from given sock size array.

import java.util.Arrays;

class Test8 {

	void getPairs(int[] input) {
		
		//int count = 1;
		int sum = 0;
		int temp = 0;
		
		System.out.println("\n Given array :: " + Arrays.toString(input));
		
		for(int index=0; index<input.length-1; index++) {
			int count = 1;
			for(int i=index+1; i<input.length; i++) {
				if(input[index]==input[i] && input[i] != 0) {
					count ++;
					input[i]=0;
				}
			}
			temp= count/2;
			sum += temp;
		}
	
		System.out.println("\n Sum of pairs in the array :: " + sum);
	}
	
	public static void main(String[] args) {
		
		Test8 test = new Test8();
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		test.getPairs(input);
	}
}
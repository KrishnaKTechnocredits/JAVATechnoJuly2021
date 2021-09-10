package suchita;

//Test 4

import java.util.Arrays;

class Test4 {

	void getArray(int[] input) {
		
		int[] output = new int[input.length];
		int i = 0;
		int j = 0;
		System.out.println("Given array ::" + Arrays.toString(input));
		for(int index=0;index<input.length;index++){
			if(input[index] != 0){
				output[i] = input[index];
				i++;
			}	
			else {
				output[(output.length-1)-j] = input[index];
				j++;
			}	
		}
		System.out.println("\nOutput array :: " + Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		
		Test4 test = new Test4();
		int[] input = {1,0,0,6,0,2,3,0,4,0,5};
		test.getArray(input);
		
	}
}
package suchita;

import java.util.Arrays;

//WAP to remove a specific element from an array

class Test03 {

	void removeSpecificElement(int[] input ,int num) {
		
		int[] output = new int[input.length - 1]; 
		int i = 0;
		System.out.println("\n Input array :: " + Arrays.toString(input));
		for(int index=0;index<input.length;index++) {
			if(input[index] != num) {
				output[i] = input[index];
				i++;
			}
		}
		System.out.println("\n Output array :: " + Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		
		Test03 test = new Test03();
		int[] input = {25,14,56,15,36,56,77,18,29,49}; 
		test.removeSpecificElement(input, 14);
	}
}
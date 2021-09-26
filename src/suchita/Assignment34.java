package suchita;

//Assignment 34

import java.util.Arrays;

class Assignment34 {

	//Count number of triplets in array
	int getCountTriplet(int[] input) {
		
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2) {
				count++;
			}
		}
		return count;
	}
	
	//Place 0 after the triplet which in sequence.
	void placeZero(int[] input, int num) {
		
		int count = num;
		System.out.println("\nInput array :: " + Arrays.toString(input));
		int[] output = new int[input.length + count];
		int i = 2;
		output[0] = input[0];
		output[1] = input[1];
		for (int index = 2; index < input.length; index++) {
			output[i] = input[index];
			i++;
			if (input[index - 2] == input[index] - 2 && input[index - 1] == input[index] - 1)
			i++;
			
		}
		System.out.println(Arrays.toString(output));
	}
	
	//Place sum after the triplet which in sequence.
	void placeSum(int[] input, int num) {
		
		int count = num;
		int[] output = new int[input.length + count];
		System.out.println("\nInput array :: " + Arrays.toString(input));
		int i = 2;
		output[0] = input[0];
		output[1] = input[1];
		for (int index = 2; index < input.length; index++) {
			output[i] = input[index];
			i++;
			if (input[index - 2] == input[index] - 2 && input[index - 1] == input[index] - 1) 
			{
				output[i] = input[index - 2] + input[index - 1] + input[index];
				i++;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	
	//Find first non repeating vowel character from string.
	void getFirstNonRepitativeVowel(String input) {
		
		int strLength = 0;
		while (input.length() > 0) {
			input = input.replace(String.valueOf(input.charAt(0)), "");
			strLength = input.length();
			
			if (strLength - input.replace(String.valueOf(input.charAt(0)), "").length() == 1) {
				if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o'
						|| input.charAt(0) == 'u') 
				{
					System.out.println("\nFirst non repitative vowel :: " + input.charAt(0));
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Assignment34 assignment = new Assignment34();
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		int count = assignment.getCountTriplet(input);
		assignment.placeZero(input,count);
		
		assignment.placeSum(input,count);
		assignment.getFirstNonRepitativeVowel("aeapquawrpti");
	}
}
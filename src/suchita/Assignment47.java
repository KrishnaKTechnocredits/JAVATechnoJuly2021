package suchita;
// Assignment 47

import java.util.HashMap;
import java.util.Map;
//import java.util.Arrays;

class Assignment47 {

	//find frequency of each character from
	void getCharFreq(Map<Character, Integer> output, String input) {
		
		System.out.println("\n Given String :: " + input);
		for (int index = 0; index < input.length(); index++) {
			
			char ch = input.charAt(index);
			if (output.containsKey(ch)) {
				int count = output.get(ch);
				output.put(ch, ++count);
			} else
				output.put(ch, 1);
		}

		System.out.println(" Output :: " +output);

	}
	
	//find frequency of each word from line.
	void getWordFreq(Map<String, Integer> output, String input) {
		
		System.out.println("\n Given line :: " + input);
		String arr[] = input.split(" ");
		
		for (int index = 0; index < arr.length; index++) {
			
			String temp = arr[index];
			if (output.containsKey(temp)) {
				int count = output.get(temp);
				output.put(temp, ++count);
			} else
				output.put(temp, 1);
		}

		System.out.println(" Output :: " +output);

	}

	public static void main(String[] args) {
		
		Assignment47 assignment = new Assignment47();
		Map<Character, Integer> output1 = new HashMap<Character, Integer>();
		String input1 = "varsha";
		Map<String, Integer> output2 = new HashMap<String, Integer>();
		String input2 = "hi good morning hello good morning";
		assignment.getCharFreq(output1, input1);
		assignment.getWordFreq(output2, input2);
	}
}
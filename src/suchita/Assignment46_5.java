package suchita;
//Assignment 46_5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Assignment46_5 {

	//WAP to remove the longest string from given Set.
	public static void main(String[] args) {
		
		Set<String> output = new LinkedHashSet<String>();
		output.add("techno");
		output.add("credits");
		output.add("selenium");
		output.add("java");
		output.add("automation");
		
		System.out.println("\n Input string :: " + output);
		int maxLength = 0;
		String maxWord = "";
		
		for (String word : output)
			if (word.length() > maxLength) {
				maxLength = word.length();
				maxWord = word;
			}
		output.remove(maxWord);
		System.out.println(" Longest word :: " + maxWord);
		System.out.println(" Output string after removing longest word :: " + output);
	}

}
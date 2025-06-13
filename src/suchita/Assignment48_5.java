package suchita;
//Assignment 48_5

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Assignment48_5 {

	//Find the freq of each character in given word.
	void getFreq(String str) {

		System.out.println("\n Given string :: "+str);
		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		System.out.println("Frequency of each letter :: " + map);
	}

	public static void main(String[] args) {
		
		Assignment48_5 assignment = new Assignment48_5();
		String input = "technocredits";
		assignment.getFreq(input);

	}
}
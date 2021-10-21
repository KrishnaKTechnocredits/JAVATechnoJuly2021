package suchita;
// Assignment 48_9

import java.util.LinkedHashMap;
import java.util.Map;

class Assignment48_9 {

	//find the first non repeating word from given string.[LinkedHashMap]
	void getNonRepeatingWord(String str) {
	
		System.out.println("]n Given String :: "+str);
		String arr[] = str.split(" ");
		String output = "";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String temp : arr) {
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);

		}

		for (String key : map.keySet())
			if (map.get(key) == 1) {
				output = key;
				break;
			}

		System.out.println("First non-reeating word :: " + output);
	}

	public static void main(String[] args) {
		
		Assignment48_9 assignment = new Assignment48_9();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		assignment.getNonRepeatingWord(input);

	}

}
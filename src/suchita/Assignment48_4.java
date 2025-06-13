package suchita;
// Assignment 48_4

import java.util.HashMap;
import java.util.Map;

class Assignment48_4 {

	//Print all duplicate words with their freq.
	void printDuplicates(String input) {
	
		System.out.println("\nGiven String :: "+input);
		Map<String, Integer> map = new HashMap<String, Integer>();
		String arr[] = input.split(" ");

		for (String str : arr)
			if (map.containsKey(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);

		System.out.println("Number of duplicate words :: ");
		for (String key : map.keySet())
			if (map.get(key) > 1)
				System.out.println(key + " : " + map.get(key));

	}

	public static void main(String[] args) {
		
		Assignment48_4 assignment = new Assignment48_4();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		assignment.printDuplicates(input);
	}
}
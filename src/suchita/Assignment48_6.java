package suchita;
// Assignment 48_6

import java.util.HashMap;
import java.util.Map;

class Assignment48_6 {

	//find the freq of each word in a given statement.
	void getFreq(String str) {
	
		System.out.println("\n Given String :: "+str);
		String arr[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : arr)
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);
		System.out.println("Frequency of each word :: "+ map);
	}

	public static void main(String[] args) {
		
		Assignment48_6 assignment = new Assignment48_6();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		assignment.getFreq(input);
	}
}
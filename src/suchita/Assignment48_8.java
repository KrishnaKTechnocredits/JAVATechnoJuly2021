package suchita;
// Assignment 48_8

import java.util.HashMap;
import java.util.Map;

class Assignment48_8 {

	//find the word with second highest freq.
	void getFreq(String str) {
	
		int maxCount = 0;
		int secondMax = 0;
		String output = "";
		System.out.println("\n Given String :: "+str);
		String arr[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : arr)
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);

		for (String key : map.keySet()) {
			if (map.get(key) > maxCount) {
				secondMax = maxCount;
				maxCount = map.get(key);

			} else if(secondMax < map.get(key)){
				secondMax = map.get(key);
				output = key;
			}
		}
		System.out.println("Word with second highest frequency :: "+output);
	}

	public static void main(String[] args) {
		
		Assignment48_8 assignment = new Assignment48_8();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		assignment.getFreq(input);
	}

}
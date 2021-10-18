package gauravk.Assignment_48;
/*
 *Assignment - 48 : 9th Oct'2021

program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
-----------------------
 */

import java.util.LinkedHashMap;

public class FrequencyOfEachWordInString {

	LinkedHashMap<String,Integer> extractWordsWithFrequency(String words) {
		String[] word = words.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String w1 : word) {
			if (map.containsKey(w1))
				map.put(w1, map.get(w1) + 1);
			else
				map.put(w1, 1);
		}
		return map;
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		System.out.println("Input: "+input+"\n........Returning each word from string with their frequencies........");
		System.out.println("Output: "+new FrequencyOfEachWordInString().extractWordsWithFrequency(input));
	}
	
}
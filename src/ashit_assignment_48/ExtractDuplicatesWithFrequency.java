/*
 * Assignment - 48 : 9th Oct'2021
program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3
-----------------------		
 */
package ashit_assignment_48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class ExtractDuplicatesWithFrequency {

	HashMap<String, Integer> extractDuplicateElementsWithFrequency(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String key : map.keySet()) {
			if (map.get(key) > 1)
				hm.put(key, map.get(key));
		}
		return hm;
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		System.out.println("Input: "+input+"\n........Returning words with their repeating frequencies........");
		System.out.println("Output: "+new ExtractDuplicatesWithFrequency().extractDuplicateElementsWithFrequency(input));
	}

}
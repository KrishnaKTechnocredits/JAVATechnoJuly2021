/*
 * Assignment - 48 : 9th Oct'2021
		
program 5: find the freq of each character in given word.
String input = "technocredits";
-----------------------
 */

package ashit_assignment_48;
import java.util.LinkedHashMap;
public class FrequencyOfCharactersInWord {

	LinkedHashMap<Character,Integer> extractElementsWithFrequency(String word) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i=0; i<word.length(); i++) {
			if (map.containsKey(word.charAt(i)))
				map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
			else
				map.put(word.charAt(i), 1);
		}
		return map;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		System.out.println("Input: "+input+"\n........Returning characters of word with their frequencies........");
		System.out.println("Output: "+new FrequencyOfCharactersInWord().extractElementsWithFrequency(input));
	}

}

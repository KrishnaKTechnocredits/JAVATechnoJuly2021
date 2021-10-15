package monali.Assignment_47;

import java.util.HashMap;
import java.util.Map;

/*Program 1: find frequency of each char from string
i/p : "varsha"
o/p : v = 1
	  a = 2
	  r = 1
	  s = 1
	  h = 1

Program 2: find frequency of each word from line
i/p : "hi good morning hello good morning"
o/p : hi = 1
	  good = 2
	  morning = 2
	  hello = 1
*/
public class MapFreqOfWordAndCharCount {

	HashMap<Character, Integer> getCharacterFrequency(String input) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int index = 0; index < input.length(); index++) {
			int value = 1;
			char ch = input.charAt(index);
			if (map.containsKey(ch)) {

				map.put(ch, value + 1);
			} else
				map.put(ch, value);
		}
		// System.out.println("Frequency of each character --> " + map);
		return map;
	}

	HashMap<String, Integer> getWordFrequency(String input) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] words = input.split(" ");

		for (int index = 0; index < words.length; index++) {
			int value = 1;
			if (map.containsKey(words[index])) {
				map.put(words[index], value + 1);
			} else
				map.put(words[index], value);
		}
		// System.out.println(map);
		return map;
	}

	public static void main(String[] args) {
		MapFreqOfWordAndCharCount frequencyCount = new MapFreqOfWordAndCharCount();
		String input = "technocredits";
		System.out.println("Frequency of each character --> \n" + frequencyCount.getCharacterFrequency(input));
		String input2 = "hi good morning hello good morning";
		System.out.println("Frequency of word in string --> \n" + frequencyCount.getWordFrequency(input2));
	}
}

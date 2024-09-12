package arti_G_Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/
public class Program8 {

	void printSecondHighestFrequencyWord(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String highestFrequencyWord = "", secondFrequencyWord = "";
		int highestFrequency = 0, secondHighestFrequency = 0;
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			int freq = map.get(key);
			if (freq > highestFrequency) {
				secondHighestFrequency = highestFrequency;
				secondFrequencyWord = highestFrequencyWord;
				highestFrequency = freq;
				highestFrequencyWord = key;
			} else if (freq != highestFrequency && freq > secondHighestFrequency) {
				secondHighestFrequency = freq;
				secondFrequencyWord = key;
			}
		}
		System.out.println(secondFrequencyWord + ":" + secondHighestFrequency);
	}
	public static void main(String[] args) {
		Program8 p8 = new Program8();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		p8.printSecondHighestFrequencyWord(input);
	}

}

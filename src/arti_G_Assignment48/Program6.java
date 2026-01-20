package arti_G_Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/
public class Program6 {

	void printFrequencyOfEachWord(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}

	public static void main(String[] args) {
		Program6 p6 = new Program6();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		p6.printFrequencyOfEachWord(input);

	}

}

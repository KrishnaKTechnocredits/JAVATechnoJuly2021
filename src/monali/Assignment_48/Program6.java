package monali.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

public class Program6 {

	
	void getFreqOfEachWord(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);	
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		Program6 p6 = new Program6();
		p6.getFreqOfEachWord(input);
	}
	
}

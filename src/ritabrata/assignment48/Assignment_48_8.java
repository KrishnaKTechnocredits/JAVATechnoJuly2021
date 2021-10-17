/*Assignment - 48 : 9th Oct'2021
Program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2
*/

package ritabrata.assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_48_8 {
	int maxFreq = 0, secMaxFreq = 0;
	String MaxFreqWord = "", secMaxFreqWord = "";
	void getSecHighWordFreq(String input) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] str = input.split(" ");
		for (String word : str) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			int freq = map.get(key);
			if (freq > maxFreq) {
				secMaxFreq = maxFreq;
				secMaxFreqWord = MaxFreqWord;
				maxFreq = freq;
				MaxFreqWord = key;
			} else {
				secMaxFreq = freq;
				secMaxFreqWord = key;
			}
		}
		System.out.println("The word with second highest freq is: " + secMaxFreqWord + ":" + secMaxFreq);
	}
	public static void main(String[] args) {
		Assignment_48_8 freq= new Assignment_48_8();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		freq.getSecHighWordFreq(input);
	}
}

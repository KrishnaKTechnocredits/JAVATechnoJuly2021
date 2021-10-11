/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/
package purshottamJoshi;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Assignment48_8 {

	int highestFrequency = 0, secondHighestFrequency = 0;
	String secondFrequencyWord = "", highestFrequencyWord = "";
	void getSecondMaxWord(String input) {
		String[] output = input.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		for(String str: output) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
		}
		for (String key : map.keySet()) {
			int frequency = map.get(key);
			
			if (frequency > highestFrequency) {
				secondHighestFrequency = highestFrequency;
				
				secondFrequencyWord = highestFrequencyWord;
				highestFrequency = frequency;
				highestFrequencyWord = key;
			} else if (frequency < highestFrequency && frequency > secondHighestFrequency) {
				secondHighestFrequency = frequency;
				secondFrequencyWord = key;
			}
		}
		System.out.println(secondFrequencyWord);
		System.out.println(map);
		
	}
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		new Assignment48_8().getSecondMaxWord(input);
	}
}

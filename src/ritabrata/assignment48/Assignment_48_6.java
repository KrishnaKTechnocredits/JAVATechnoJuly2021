/*Assignment - 48 : 9th Oct'2021
program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"

*/

package ritabrata.assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_48_6 {
	void getFreq(String input) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] str = input.split(" ");
		for (String word : str) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		System.out.println("The freq of each word is: " + map);
	}

	public static void main(String[] args) {
		Assignment_48_6 freq= new Assignment_48_6();
		String input= "Hi Hello Hi Techno Credits Credits Hi Credits";
		freq.getFreq(input);
	}
}

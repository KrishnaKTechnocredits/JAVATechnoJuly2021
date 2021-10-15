/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

package amol_Vyas.Assignment_48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program_6 {

	static void getFreqOfEachWord(String input) {
		String[] word = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap();
		for (String letter : word) {
			if (map.containsKey(letter)) {
				int cnt = map.get(letter);
				map.put(letter, ++cnt);
			} else
				map.put(letter, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		getFreqOfEachWord(input);
	}

}

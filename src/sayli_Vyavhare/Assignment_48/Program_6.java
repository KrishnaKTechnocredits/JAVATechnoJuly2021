/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/
package sayli_Vyavhare.Assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_6 {

	static void getFreqOfWord(String input) {

		Map<String, Integer> map = new HashMap<>();
		String[] input1 = input.split(" ");
		for (int index = 0; index < input1.length; index++) {
			String s = input1[index];
			if (map.containsKey(s)) {
				int count = map.get(s);
				map.put(s, ++count);

			} else {
				map.put(s, 1);

			}
		}
		System.out.println("freq of each word in a given statement:"+map);
	}

	public static void main(String[] args) {

		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		getFreqOfWord(input);
	}

}

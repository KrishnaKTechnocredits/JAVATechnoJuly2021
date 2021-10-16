/*find the freq of each character in given word.
String input = "technocredits";*/

package suruchi.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program5 {

	void getFreqOfEachChar(String input) {
		char[] ch = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char letter : ch) {
			if (map.containsKey(letter)) {
				map.put(letter, map.get(letter) + 1);
			} else
				map.put(letter, 1);
		}
		System.out.println("Frequency of each character in string is: ");
		System.out.println(map);
	}

	public static void main(String[] args) {
		Program5 program5 = new Program5();

		String input = "technocredits";

		System.out.println("String is: " + input);
		program5.getFreqOfEachChar(input);
	}
}
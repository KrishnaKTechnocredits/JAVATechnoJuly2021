/*find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

package suruchi.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program6 {

	void getFreqOfEachWord(String input) {
		String[] strArr = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String letter : strArr) {
			if (map.containsKey(letter)) {
				map.put(letter, map.get(letter) + 1);
			} else
				map.put(letter, 1);
		}
		System.out.println("Frequency of each character in string is: ");
		System.out.println(map);
	}

	public static void main(String[] args) {
		Program6 program6 = new Program6();

		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";

		System.out.println("String is: " + input);
		program6.getFreqOfEachWord(input);
	}
}
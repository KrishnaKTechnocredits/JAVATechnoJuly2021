package monali.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 5: find the freq of each character in given word.
String input = "technocredits";
*/
public class Program5 {

	void getFreqOfEachCharacter(String input) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] ch = input.toCharArray();
		for (Character character : ch) {
			if (map.containsKey(character))
				map.put(character, map.get(character) + 1);
			else
				map.put(character, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String input = "technocredits";
		Program5 p5 = new Program5();
		p5.getFreqOfEachCharacter(input);
	}
}

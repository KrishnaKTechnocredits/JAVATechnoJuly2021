/*Assignment - 48 : 9th Oct'2021
program 5: find the freq of each character in given word.
String input = "technocredits";*/

package shraddha.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequncyOfEachChar {
	public static void main(String[] args) {
		String input = "technocredits";
		FrequncyOfEachChar obj1 = new FrequncyOfEachChar();
		obj1.getFrequencyOfEachChar(input);
	}

	void getFrequencyOfEachChar(String str) {
		System.out.println("Frequency of each char in "+str+" is as follows:- ");
		System.out.println("--------------------------------------------------------");
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int count = 0;
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (map.containsKey(ch)) {
				count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}

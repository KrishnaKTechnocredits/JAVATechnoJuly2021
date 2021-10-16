/*program 5: find the freq of each character in given word.
String input = "technocredits";*/
package shalaka.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfEachChar {
	void getFreqOfEachChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}
		System.out.println("The freq of each character in given word:\n"+map);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		FreqOfEachChar freqOfEachChar = new FreqOfEachChar();
		freqOfEachChar.getFreqOfEachChar(input);
	}

}

/*Assignment 47 : 6th Oct'2021

Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1
*/
package shraddha.Assignment47;

import java.util.LinkedHashMap;

public class FrequencyOfEachCharInString {
	public static void main(String[] args) {
		getFrequencyOfChar("varsha");
	}

	static void getFrequencyOfChar(String str) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (lhm.containsKey(ch)) {
				int count = lhm.get(ch);
				lhm.put(ch, count + 1);
			} else {
				lhm.put(ch, 1);
			}
		}
		System.out.println(lhm);
	}
}

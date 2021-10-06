
/*Harsh, 09:58
Assignment 47 : 6th Oct'2021

Program 1: find frequency of each char from string(map)
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1*/
package shalaka.Assignment47;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar {
	void getFreqOfEachChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, ++count);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "varsha";
		FrequencyOfEachChar frequencyOfEachChar = new FrequencyOfEachChar();
		frequencyOfEachChar.getFreqOfEachChar(input);
	}

}

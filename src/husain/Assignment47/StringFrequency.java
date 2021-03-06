/*
 * Assignment 47 : 6th Oct'2021

Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1

Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1
 */
package husain.Assignment47;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency {

	void findCharFreq(Map<Character, Integer> map, String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, ++count);
			} else
				map.put(ch, 1);
		}

		System.out.println(map);

	}

	void findWordFreq(Map<String, Integer> map, String str) {

		String arr[] = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String temp = arr[index];
			if (map.containsKey(temp)) {
				int count = map.get(temp);
				map.put(temp, ++count);
			} else
				map.put(temp, 1);
		}

		System.out.println(map);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFrequency freq = new StringFrequency();
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		String str1 = "varsha";
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		String str2 = "hi good morning hello good morning";
		freq.findCharFreq(map1, str1);
		freq.findWordFreq(map2, str2);
	}

}

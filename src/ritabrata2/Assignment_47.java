

/*
 Assignment 47 : 6th Oct'2021
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




package ritabrata2;

import java.util.HashMap;
import java.util.Map;
public class Assignment_47 {
	Map<Character, Integer> getCharFreq(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int index = 0; index < input.length(); index++) {
			Character key = input.charAt(index);
			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, ++value);
			} else {
				map.put(key, 1);
			}
		}
		return map;
	}
	Map<String, Integer> getWordsFrequency(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] word = str.split(" ");
		for (int index = 0; index < word.length; index++) {
			String key = word[index];
			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, ++value);
			} else {
				map.put(key, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		Assignment_47 freqStr= new Assignment_47();
		System.out.println(freqStr.getCharFreq("varsha"));
		System.out.println(freqStr.getWordsFrequency("hi good morning hello good morning"));

	}

}

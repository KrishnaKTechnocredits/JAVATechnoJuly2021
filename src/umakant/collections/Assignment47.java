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

package umakant.collections;

import java.util.HashMap;
import java.util.Map;

public class Assignment47 {

	Map<Character, Integer> getCharactersFrequency(String word) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int index = 0; index < word.length(); index++) {
			Character key = word.charAt(index);
			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, ++value);
			} else {
				map.put(key, 1);
			}
		}
		return map;
	}

	Map<String, Integer> getWordsFrequency(String sentence) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = sentence.split(" ");
		for (int index = 0; index < words.length; index++) {
			String key = words[index];
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
		Assignment47 assignment = new Assignment47();
		System.out.println(assignment.getCharactersFrequency("varsha"));
		System.out.println(assignment.getWordsFrequency("hi good morning hello good morning"));
	}
}

package gauravk.Assignment_47;

import java.util.HashMap;

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
public class FrequencyOfEachCharacterFromString {
	
	HashMap<Character, Integer> frequencyOfEachCharacter(String str){
		char [] ch = str.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for(Character c : ch) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}
			else {
				hmap.put(c, 1);
			}
		}
		return hmap;
	}
	
	HashMap<String, Integer> frequencyOfEachWord(String str1){
		String[] s1 = str1.split(" ");
		HashMap<String, Integer> sMap = new HashMap<String, Integer>(s1.length);
		for(String word : s1) {
			if(sMap.containsKey(word)) {
				sMap.put(word, sMap.get(word)+1);
			}else {
				sMap.put(word, 1);
			}
		}
		return sMap;
	}
	
	public static void main(String[] args) {
		String s = "varsha";
		System.out.println("Frequency of each character of the word ["+s+"]. \nOutput: "+new FrequencyOfEachCharacterFromString().frequencyOfEachCharacter(s));
		String ss = "hi good morning hello good morning";
		System.out.println("Frequency of each character of the word ["+ss+"]. \nOutput: "+new FrequencyOfEachCharacterFromString().frequencyOfEachWord(ss));
	}
}
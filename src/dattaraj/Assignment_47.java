package dattaraj;

import java.util.HashMap;
import java.util.Map;


public class Assignment_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_47 assignment47 = new Assignment_47();
		assignment47.getCharacterFrequency("varsha");
		assignment47.getWordFrequency("hi good morning hello good morning");
	}
	
	void getCharacterFrequency(String input) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
			if(charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				count++;
				charMap.replace(ch,count);
			}
			else
				charMap.put(ch,1);
		}
		System.out.println(charMap);
	}
	
	void getWordFrequency(String input) {
		String [] inputArr = input.split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for(int index=0; index<inputArr.length;index++) {
			String word = inputArr[index];
			if(wordMap.containsKey(word)) {
				int count = wordMap.get(word);
				count++;
				wordMap.replace(word,count);
			}
			else
				wordMap.put(word, 1);
		}
		System.out.println(wordMap);
	}
}

/*
program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/
package shalaka.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfEachWord {
	void getFreqOfEachWord(String input) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] str = input.split(" ");
		for (String word : str) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		System.out.println("The freq of each word:" + map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		FreqOfEachWord freqOfEachWord = new FreqOfEachWord();
		freqOfEachWord.getFreqOfEachWord(input);
	}

}

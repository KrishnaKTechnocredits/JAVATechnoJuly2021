/*
program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/
package shalaka.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondHighestWord {
	int maxFreq = 0, secMaxFreq = 0;
	String MaxFreqWord = "", secMaxFreqWord = "";

	void getSecondHighestWordWithFreq(String input) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] str = input.split(" ");
		for (String word : str) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			int freq = map.get(key);
			if (freq > maxFreq) {
				secMaxFreq = maxFreq;
				secMaxFreqWord = MaxFreqWord;
				maxFreq = freq;
				MaxFreqWord = key;
			} else {
				secMaxFreq = freq;
				secMaxFreqWord = key;

			}
		}
		System.out.println("The word with second highest freq is: " + secMaxFreqWord + "->" + secMaxFreq);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		new SecondHighestWord().getSecondHighestWordWithFreq(input);
	}

}

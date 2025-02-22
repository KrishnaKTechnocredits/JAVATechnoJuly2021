/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/


package astha.Assignment48;

import java.util.HashMap;
import java.util.Set;

public class Program8 {

	HashMap<String, Integer> wordFreqMap = new HashMap<String, Integer>();

	void getWordFreq(String[] inputArr) {
		for (int index = 0; index < inputArr.length; index++) {
			if (wordFreqMap.containsKey(inputArr[index]))
				wordFreqMap.put(inputArr[index], wordFreqMap.get(inputArr[index]) + 1);
			else
				wordFreqMap.put(inputArr[index], 1);
		}
	}

	String getHighestFreqWord() {
		int tempValue = 0;
		String tempKey = "";
		Set<String> keys = wordFreqMap.keySet();
		for (String key : keys) {
			if (wordFreqMap.get(key) > tempValue) {
				tempValue = wordFreqMap.get(key);
				tempKey = key;
			}
		}
		return tempKey;
	}

	void getSecondHighestFreqWord(String input) {
		String[] inputArr = input.split(" ");
		getWordFreq(inputArr);
		String key = getHighestFreqWord();
		wordFreqMap.remove(key);
		key = getHighestFreqWord();
		System.out.println(key + " : " + wordFreqMap.get(key));

	}

	public static void main(String[] args) {
		Program8 program8 = new Program8();
		program8.getSecondHighestFreqWord("Hi Hello Hi Techno Credits Hi Credits");
	}

}

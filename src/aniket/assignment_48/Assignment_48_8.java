package aniket.assignment_48;

/*program 8 : find the word with second highest freq.

String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_48_8 {

	static void wordWithSecondMaxFrequeny(String str) {
		String[] input = str.split(" ");
		String secondMax = "";
		int maxCnt = 0, secondMaxCnt = 0;
		Map<String, Integer> tmap = new LinkedHashMap<>();
		for (String word : input) {
			if (tmap.containsKey(word)) {
				tmap.put(word, tmap.get(word) + 1);
			} else {
				tmap.put(word, 1);
			}

		}
		System.out.println(tmap);

		for (String key : tmap.keySet()) {
			int freq = tmap.get(key);
			if (freq > maxCnt) {
				secondMaxCnt = maxCnt;
				maxCnt = freq;
			} else if (freq > secondMaxCnt & freq != maxCnt) {
				secondMaxCnt = freq;
				secondMax = key;
			}
		}
		System.out.println(secondMax + " -> " + tmap.get(secondMax));
	}

	public static void main(String[] args) {
		wordWithSecondMaxFrequeny("Hi Hello Hi Techno Credits Hi Credits");
	}

}

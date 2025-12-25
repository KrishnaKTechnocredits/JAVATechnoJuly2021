/*Assignment 47 : 6th Oct'2021

Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1
 */
package shraddha.Assignment47;

import java.util.LinkedHashMap;

public class FrequencyOfEachWordInLine {
	public static void main(String[] args) {
		getFrequencyOfWord("hi good morning hello good morning");
	}

	static void getFrequencyOfWord(String str) {
		String[] arr = str.split(" ");
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		for (int index = 0; index < arr.length; index++) {
			String temp = arr[index];
			if (lhm.containsKey(temp)) {
				int count = lhm.get(temp);
				lhm.put(temp, count + 1);
			} else {
				lhm.put(temp, 1);
			}
		}
		System.out.println(lhm);
	}
}

/*Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1*/
package shalaka.Assignment47;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachWord {
	void getFreqOfEachword(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (int index = 0; index < arr.length; index++) {
			if (map.containsKey(arr[index])) {
				int cnt = map.get(arr[index]);
				map.put(arr[index], ++cnt);
			} else {
				map.put(arr[index], 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hi good morning hello good morning";
		FrequencyOfEachWord frequencyOfEachWord = new FrequencyOfEachWord();
		frequencyOfEachWord.getFreqOfEachword(input);
	}

}

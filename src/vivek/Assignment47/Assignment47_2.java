/*Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		 hello = 1*/

package vivek.Assignment47;

import java.util.LinkedHashMap;

public class Assignment47_2 {

	static void getWordFrequency(String[] arr) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			if (map.containsKey(word)) {
				int cnt = map.get(word);
				map.put(word, ++cnt);
			} else
				map.put(word, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String str = "hi good morning hello good morning";
		String[] arr = str.split(" ");
		Assignment47_2.getWordFrequency(arr);
	}
}

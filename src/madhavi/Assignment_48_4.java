package madhavi;

import java.util.HashMap;

// print all duplicate words with their freq.
public class Assignment_48_4 {
	void getDuplicatesWordsFreq(String name) {
		HashMap<String, Integer> strmap = new HashMap<String, Integer>();
		String[] strarr = name.split(" ");

		for (String str : strarr) {

			if (strmap.containsKey(str))
				strmap.put(str, strmap.get(str) + 1);
			else
				strmap.put(str, 1);
		}

		for (String key : strmap.keySet()) {
			if (strmap.get(key) > 1) {
				System.out.println(key + "->" + strmap.get(key));
			}
		}
	}

	public static void main(String[] args) {
		Assignment_48_4 assignmenmt_48_4 = new Assignment_48_4();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		assignmenmt_48_4.getDuplicatesWordsFreq(input);

	}
}
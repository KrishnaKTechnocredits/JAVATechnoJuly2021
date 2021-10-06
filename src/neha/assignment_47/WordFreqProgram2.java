package neha.assignment_47;

import java.util.HashMap;
import java.util.Map;

/*Program 2: find frequency of each word from line
i/p : "hi good morning hello good morning"
o/p : hi = 1
	  good = 2
	  morning = 2
hello = 1*/
public class WordFreqProgram2 {
	void findFreqOfEachWordOfString(String str) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int cnt = 1;
			String word = arr[i];
			if (hm.containsKey(word))
				hm.put(word, ++cnt);
			else
				hm.put(word, cnt);
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		WordFreqProgram2 wordFreq = new WordFreqProgram2();
		String input = "hi good morning hello good morning";
		wordFreq.findFreqOfEachWordOfString(input);
	}
}

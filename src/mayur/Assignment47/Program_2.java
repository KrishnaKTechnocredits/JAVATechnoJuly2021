/*Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1
*/
package mayur.Assignment47;

import java.util.LinkedHashMap;
import java.util.Map;


public class Program_2 {
	
	void findFrequencyOfEachWord(String word) {
		Map<String, Integer> list = new LinkedHashMap<String, Integer>();
		String str[] = word.split(" ");
		for (int index = 0; index < str.length; index++) {
			String inputWord = str[index];
			if (list.containsKey(inputWord)) {
				list.put(inputWord, list.get(inputWord) + 1);
			} else {
				list.put(inputWord, 1);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		String word = "hi good morning hello good morning";
		program_2.findFrequencyOfEachWord(word);
	}
}

/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

package parthav.parthavD_Assignment48;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program8 {

	String str;
	Map<String, Integer> map = new LinkedHashMap<>();
	int maxValue;
	String maxOccuringWord = "";

	Program8(String str) {
		this.str = str;
	}

	void findHighestFrequency() {
		Set<Entry<String, Integer>> entrSet = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entrSet.iterator();
		maxValue = 0;
		while (itr.hasNext()) {
			Entry<String, Integer> ent = itr.next();
			if (maxValue < ent.getValue()) {
				maxValue = ent.getValue();
				maxOccuringWord = ent.getKey();
			}
		}
		map.remove(maxOccuringWord);

	}

	void printSecondHighestFrequencyWord(int number) {
		String[] strArray = str.split(" ");

		for (String word : strArray) {
			if (!map.containsKey(word))
				map.put(word, 1);
			else
				map.put(word, map.get(word) + 1);
		}

		for (int index = 0; index < number; index++) {
			findHighestFrequency();
		}

		System.out.println(maxOccuringWord + ":" + maxValue);

	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Hi Credits";
		Program8 newObj = new Program8(str);
		newObj.printSecondHighestFrequencyWord(2);
	}

}

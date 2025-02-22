/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

package chandani.Assignment_48;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Assignment48i {

	void getFirstNonRepeatingWord(String input) {
		String[] inputArr = input.split(" ");
		LinkedHashMap<String, Integer> wordFreqMap = new LinkedHashMap<String, Integer>();

		for (int index = 0; index < inputArr.length; index++) {
			if (wordFreqMap.containsKey(inputArr[index]))
				wordFreqMap.put(inputArr[index], wordFreqMap.get(inputArr[index]) + 1);
			else
				wordFreqMap.put(inputArr[index], 1);
		}

		Set<String> keySet = wordFreqMap.keySet();
		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			if (wordFreqMap.get(key) == 1) {
				System.out.println("The first non repeating word is : " +key);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment48i Assignment48i = new Assignment48i();
		Assignment48i.getFirstNonRepeatingWord("Hi Hello Hi Techno Credits Hi Credits");
	}
}
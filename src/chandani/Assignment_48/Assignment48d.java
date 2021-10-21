/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3
*/
package chandani.Assignment_48;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Assignment48d {

	void printDuplicateWords(String input) {
		String[] inputArr = input.split(" ");
			HashMap<String,Integer> wordFrequencyMap = new HashMap<String,Integer>();
			for (int index = 0; index < inputArr.length; index++) {
				if (wordFrequencyMap.containsKey(inputArr[index]))
					wordFrequencyMap.put(inputArr[index], wordFrequencyMap.get(inputArr[index]) + 1);
				else
					wordFrequencyMap.put(inputArr[index], 1);
			}

			System.out.println(wordFrequencyMap);

			Set<String> keySet = wordFrequencyMap.keySet();
			Iterator<String> iterator = keySet.iterator();
			System.out.println("The duplicate word in the string are : ");
			while (iterator.hasNext()) {
				String key = iterator.next();
				if (wordFrequencyMap.get(key) != 1)
					System.out.println(key + " : " + wordFrequencyMap.get(key));
			}
		}

	public static void main(String[] args) {
		Assignment48d Assignment48d = new Assignment48d();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		Assignment48d.printDuplicateWords(input);
	}
}
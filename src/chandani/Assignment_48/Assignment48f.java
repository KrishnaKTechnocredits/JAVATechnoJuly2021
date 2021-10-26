/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

package chandani.Assignment_48;

import java.util.HashMap;

public class Assignment48f {

	void printWordFrequency(String input) {
		String[] inputArr = input.split(" ");
			HashMap<String,Integer> wordFrequencyMap = new HashMap<String,Integer>();
			for (int index = 0; index < inputArr.length; index++) {
				if (wordFrequencyMap.containsKey(inputArr[index]))
					wordFrequencyMap.put(inputArr[index], wordFrequencyMap.get(inputArr[index]) + 1);
				else
					wordFrequencyMap.put(inputArr[index], 1);
			}

			System.out.println(wordFrequencyMap);
	}
	public static void main(String[] args) {
		Assignment48f Assignment48f = new Assignment48f();
		Assignment48f.printWordFrequency("Hi Hello Hi Techno Credits Credits Hi Credits");
	}
}
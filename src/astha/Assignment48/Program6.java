/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

package astha.Assignment48;

import java.util.HashMap;

public class Program6 {

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
		Program6 program6 = new Program6();
		program6.printWordFrequency("Hi Hello Hi Techno Credits Credits Hi Credits");
	}
}

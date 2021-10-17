/*Assignment - 48 : 9th Oct'2021
Program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3
*/	
         
package ritabrata.assignment48;

import java.util.HashMap;

public class Assignment_48_4 {
	void duplicateWordFrequency(String input) {
		String[] word = input.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String dupWord : word) {
			if (map.containsKey(dupWord))
				map.put(dupWord, map.get(dupWord) + 1);
			else
				map.put(dupWord, 1);
		}
		System.out.println("Duplicate words with their freq: ");
		for (String str : map.keySet()) {
			if (map.get(str) > 1)
				System.out.println(str + ":" + map.get(str));
		}
	}

	public static void main(String[] args) {
		Assignment_48_4 freq= new Assignment_48_4();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		freq.duplicateWordFrequency(input);
	}

}

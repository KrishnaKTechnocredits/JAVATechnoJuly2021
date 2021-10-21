/*program 5: find the freq of each character in given word.
String input = "technocredits";*/

package astha.Assignment48;

import java.util.HashMap;

public class Program5 {

	void printCharacterFrequency(String input) {
			HashMap<Character,Integer> charatcerFrequencyMap = new HashMap<Character,Integer>();
			for (int index = 0; index < input.length(); index++) {
				if (charatcerFrequencyMap.containsKey(input.charAt(index)))
					charatcerFrequencyMap.put(input.charAt(index), charatcerFrequencyMap.get(input.charAt(index)) + 1);
				else
					charatcerFrequencyMap.put(input.charAt(index), 1);
			}

			System.out.println(charatcerFrequencyMap);
	}
	public static void main(String[] args) {
		Program5 program5 = new Program5();
		program5.printCharacterFrequency("technocredits");
	}
}

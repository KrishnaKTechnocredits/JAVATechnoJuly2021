package suruchi.Assignment47;

import java.util.HashMap;
import java.util.Map;

public class Program_A47 {

	void printCharFrequency(String input) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.replace(ch, ++count);
			} else
				charMap.put(ch, 1);
		}
		System.out.println("Frequency of characters in the string '" + input + "' is: " + charMap);
	}

	void printStringFrequency(String input) {
		String[] strArr = input.split(" ");
		Map<String, Integer> strMap = new HashMap<String, Integer>();

		for (int index = 0; index < strArr.length; index++) {
			String str = strArr[index];
			if (strMap.containsKey(str)) {
				int count = strMap.get(str);
				strMap.replace(str, ++count);
			} else
				strMap.put(str, 1);
		}
		System.out.println("Frequency of characters in the string '" + input + "' is: " + strMap);
	}

	public static void main(String[] args) {
		Program_A47 program_A47 = new Program_A47();

		program_A47.printCharFrequency("varsha");
		System.out.println();
		program_A47.printStringFrequency("hi good morning hello good morning");
	}
}
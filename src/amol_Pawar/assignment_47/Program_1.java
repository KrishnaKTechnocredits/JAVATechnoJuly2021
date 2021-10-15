/*Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1
*/

package amol_Pawar.assignment_47;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program_1 {

	void getFrequencyOfEachChar(String input) {
		Map<Character, Integer> inputList = new LinkedHashMap<>();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (inputList.containsKey(ch)) {
				inputList.put(ch, inputList.get(ch) + 1);
			} else {
				inputList.put(ch, 1);
			}
		}
		System.out.println(inputList);
	}

	public static void main(String[] args) {

		Program_1 program_1 = new Program_1();
		String name = "varsha";
		program_1.getFrequencyOfEachChar(name);
	}

}

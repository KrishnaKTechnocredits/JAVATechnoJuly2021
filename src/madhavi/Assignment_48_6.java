package madhavi;

import java.util.HashMap;

//find the freq of each word in a given statement
public class Assignment_48_6 {

	void getFreqOfWord(String input) {
		HashMap<String, Integer> strmap = new HashMap<String, Integer>();
		String[] strarr = input.split(" ");
		for (String str : strarr) {

			if (strmap.containsKey(str))
				strmap.put(str, strmap.get(str) + 1);
			else
				strmap.put(str, 1);
		}
		System.out.println(input + "->" + strmap);
	}

	public static void main(String[] args) {
		Assignment_48_6 assignment_48_6 = new Assignment_48_6();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		assignment_48_6.getFreqOfWord(input);

	}
}
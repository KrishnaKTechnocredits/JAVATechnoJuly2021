package madhavi;

import java.util.HashMap;

public class Assignment_48_8 {

	void getFreqOfWord(String input) {
		HashMap<String, Integer> strmap = new HashMap<String, Integer>();
		String[] strarr = input.split(" ");
		int max = 0;
		String inpstr = "";
		int i = 0;
		for (String str : strarr) {

			if (strmap.containsKey(str)) {
				strmap.put(str, strmap.get(str) + 1);

			}

			else
				strmap.put(str, 1);
		}

		while (i < 2) {
			max = 0;
			for (String str : strmap.keySet()) {
				if (max < strmap.get(str)) {
					max = strmap.get(str);
					inpstr = str;
				}
			}

			strmap.put(inpstr, 0);
			i++;
		}

		System.out.println(inpstr + "->" + max);
	}

	public static void main(String[] args) {
		Assignment_48_8 assignment_48_8 = new Assignment_48_8();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		assignment_48_8.getFreqOfWord(input);

	}

}

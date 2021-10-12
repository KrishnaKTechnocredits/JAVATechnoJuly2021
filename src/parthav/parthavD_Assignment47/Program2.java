/*Assignment 47 : 6th Oct'2021

Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1*/

package parthav.parthavD_Assignment47;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program2 {

	void printFrequencyOfEachLine(String str) {
		String[] strArray = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();

		for (int index = 0; index < strArray.length; index++) {
			String strIndex = strArray[index];
			if (!map.containsKey(strIndex)) {
				map.put(strIndex, 1);
			} else
				map.put(strIndex, map.get(strIndex) + 1);
		}

		System.out.println(map);
	}

	public static void main(String[] args) {
		Program2 newObj = new Program2();
		String str = "hi good morning hello good morning";
		newObj.printFrequencyOfEachLine(str);

	}

}

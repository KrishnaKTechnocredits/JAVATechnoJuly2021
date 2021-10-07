/* Assignment 47 : 6th Oct'2021
Program 2: find frequency of each word from line
i/p : "hi good morning hello good morning"
o/p : hi = 1 good = 2 morning = 2 hello = 1 */

package akanksha_Jain.Assignment_47;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		String str = "hi good morning hello good morning";
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			String s = arr[index];
			if(map.containsKey(s)) {
				int count = map.get(s);
				map.put(s, count+1);
			}
			else {
				map.put(s, 1);
			}
		}
		System.out.println("Frequency of each word in string '" + str + "'- "+ map);
	}
}
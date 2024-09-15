package chirag.Assignment47;

import java.util.Arrays;
import java.util.HashMap;

/*Program 1: find frequency of each char from string
i/p : "varsha"
o/p : v = 1
	  a = 2
	  r = 1
	  s = 1
	  h = 1*/

public class FindFreqOfEachCharFromString {
	
	public static void main(String[] args) {
		String input = "varsha";
		HashMap<Character, Integer> map = new HashMap<>();
		int count =0;
		for(int index = 0 ; index < input.length();index++) {
			char ch = input.charAt(index);
			if(map.containsKey(input.charAt(index))) {
				count = map.get(ch);
				map.put(ch, ++count);
			}
			else {
				map.put(ch,1);
			}
		}
		System.out.println(map);
	}
}

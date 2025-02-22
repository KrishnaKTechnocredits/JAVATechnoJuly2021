/* Assignment 47 : 6th Oct'2021
 Program 1: find frequency of each char from string
            	i/p : "varsha"
            	o/p : v = 1
                            	  a = 2
                            	  r = 1
                            	  s = 1
                            	  h = 1
 
 Hint : use maps
Program 2: find frequency of each word from line
            	i/p : "hi good morning hello good morning"
            	o/p : hi = 1
                            	  good = 2
                            	  morning = 2
                            	  hello = 1
*/

package harshada.Assignment41_47;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Assignment_47 {

	void p1_getFreqOfChar(String str) {

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		char ch = ' ';

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (hm.containsKey(ch)) { // v a r s h a
				int count = hm.get(ch);
				hm.put(ch, ++count);
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}

	void p2_getFreqOfWord(String str[]) {

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		String temp = " ";

		for (int i = 0; i < str.length; i++) {
			temp = str[i];
			if (hm.containsKey(temp)) {
				int count = hm.get(temp);
				hm.put(temp, ++count);
			} else {
				hm.put(temp, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_47 assignment_47 = new Assignment_47();
		System.out.println("Program 1 : Output Frequency of each char");
		assignment_47.p1_getFreqOfChar("harshada");
		String str = "hi good morning hello good morning";
		String input[] = str.split(" ");
		System.out.println("\nProgram 2 : Output Frequency of each word");
		assignment_47.p2_getFreqOfWord(input);
	}

}

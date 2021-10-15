/*Assignment 47 : 6th Oct'2021

Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1

Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1*/

package bhakti;

import java.util.HashMap;

public class Assignment_47 {
	
	static void countFrequncyOfEachChar(String input) {
		HashMap<Character, Integer> hm= new HashMap();
		for (int i=0; i < input.length(); i++) {
			char ch= input.charAt(i);
			if (hm.containsKey(ch)) {
				int n=hm.get(ch);
				hm.put(ch, ++n);
				
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
	
	public static void main(String[] args) {
		String str= "Bhaktik kakade";
		countFrequncyOfEachChar(str);
		
	}

}

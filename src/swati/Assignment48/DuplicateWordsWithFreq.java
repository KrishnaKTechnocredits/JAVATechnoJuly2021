package swati.Assignment48;

/*
 * program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3
 */

import java.util.*;

public class DuplicateWordsWithFreq {
	
	void findDuplicateWithFreq(String input) {
		String[] arr=input.split(" ");
		LinkedHashMap<String,Integer> map1=new LinkedHashMap<String,Integer>();
		for(String temp:arr) {
			if(map1.containsKey(temp)) {
				map1.put(temp,map1.get(temp)+1);
			}
			else
				map1.put(temp,1);			
		}
		for(String temp:map1.keySet()) {
			if(map1.get(temp)!=1) {
				System.out.println(temp+" : "+map1.get(temp));
			}
		}
	}
	
	public static void main(String[] a) {
		DuplicateWordsWithFreq d1=new DuplicateWordsWithFreq();
		String input= "Hi Hello Hi Techno Credits Credits Hi Credits";
		d1.findDuplicateWithFreq(input);				
	}

}


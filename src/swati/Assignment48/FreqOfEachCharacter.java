package swati.Assignment48;

/*
 * program 5: find the freq of each character in given word.
String input = "technocredits";
 */

import java.util.LinkedHashMap;

public class FreqOfEachCharacter {
	
	void findFreqOfEachChar(String input) {
		LinkedHashMap<Character,Integer> map1=new LinkedHashMap<Character,Integer>();
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(map1.containsKey(ch)) {
				map1.put(ch,map1.get(ch)+1);
			}else
				map1.put(ch,1);
		}
		System.out.println(map1);		
	}
	
	public static void main(String[] a) {
		FreqOfEachCharacter f1=new FreqOfEachCharacter();
		String input= "technocredits";
		f1.findFreqOfEachChar(input);				
	}
}


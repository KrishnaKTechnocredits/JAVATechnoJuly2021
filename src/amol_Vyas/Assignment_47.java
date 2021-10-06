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

package amol_Vyas;

import java.util.HashMap;
import java.util.Map;

public class Assignment_47 {

	static Map<Character, Integer> getFreqCountOfEachChar(String input) {
		Map<Character, Integer> output = new HashMap();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (output.containsKey(ch)) {
				int cnt = output.get(ch);
				output.put(ch, ++cnt);
			} else
				output.put(ch, 1);
		}
		return output;

	}
	
	static Map<String,Integer> getFreqCountOfEachWord(String input){
		Map<String, Integer> output = new HashMap();
		String[] str = input.split(" ");
		
		for(int index=0;index<str.length;index++) {
			String word = str[index];
			if(output.containsKey(word)) {
				int cntWord = output.get(word);
				output.put(word, ++cntWord);
				
			} else
				output.put(word, 1);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFreqCountOfEachChar("varsha"));
		System.out.println(getFreqCountOfEachWord("hi good morning hello good morning"));
	}

}

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
package monika;

import java.util.HashMap;
import java.util.Map;

public class Assignment_47 {
	
	Map<Character, Integer> getFreqCountOfEachCharacter(String str){
		Map<Character, Integer> output=new HashMap<>();
		for(int index=0; index<str.length(); index++) {
			char ch=str.charAt(index);
			if(output.containsKey(ch)) {
				int count=output.get(ch);
				output.put(ch, ++count);
			}else
				output.put(ch, 1);
		}
		return output;
	}
	
	Map<String, Integer> getFreqCountOfEachWord(String str){
		Map<String,Integer> output=new HashMap<>();
		String[] str1=str.split(" ");
		for(int index=0; index<str1.length; index++) {
			String word=str1[index];
			if(output.containsKey(word)) {
				int count=output.get(word);
				output.put(word, ++count);
				
			}else
				output.put(word, 1);
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_47 assignment_47=new Assignment_47();
		System.out.println("Frequency of Each Character is: "+assignment_47.getFreqCountOfEachCharacter("varsha"));
		System.out.println("Frequency of Each Word is: "+assignment_47.getFreqCountOfEachWord("hi good morning hello good morning"));

	}

}

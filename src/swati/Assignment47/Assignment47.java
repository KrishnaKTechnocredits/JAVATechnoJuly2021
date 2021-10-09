package swati.Assignment47;

/*
 * Assignment 47 : 6th Oct'2021

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
		  hello = 1
 */

import java.util.*;

public class Assignment47{
	
	void program1(String input) {
		Map<Character,Integer> map1=new LinkedHashMap<>();
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(map1.containsKey(ch)) {
				int count=map1.get(ch);
				map1.put(ch,count+1);				
			}
			else {
				map1.put(ch,1);
			}
		}
		System.out.println(map1);	
		
	}
	
	void program2(String input) {
		String[] arr=input.split(" ");
		Map<String,Integer> map1=new LinkedHashMap<>();
		for(String str:arr) {
			if(map1.containsKey(str)) {
				int count=map1.get(str);
				map1.put(str,count+1);
			}
			else {
				map1.put(str,1);
			}
		}
		System.out.println(map1);
	}

	public static void main(String[] a) {
		Assignment47 a1=new Assignment47();
		System.out.println("Program1 Output :");
		a1.program1("varsha");
		System.out.println("Program2 Output :");
		a1.program2("hi good morning hello good morning");
		
	}
}


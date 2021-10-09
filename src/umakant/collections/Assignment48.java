/*
 Assignment - 48 : 9th Oct'2021

Program 1: Create a system to generate AadharNumber with rules discussed in class.

Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map

if(hm.containsKey(key))
	hm.put(key, hm.get(key)+1);
else
	hm.put(key,1);

program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map

program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3
		
program 5: find the freq of each character in given word.
String input = "technocredits";

program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"

program 7 : find the freq of each number in given array.

program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2

program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap

program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList

program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.
 */

package umakant.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment48 {

	int getNumberOfPairs(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pairs = 0;
		for (int number : input) {
			if (map.containsKey(number))
				map.put(number, map.get(number) + 1);
			else
				map.put(number, 1);
		}
		for (int key : map.keySet()) {
			pairs += map.get(key) / 2;
		}
		return pairs;
	}

	void printUniqueElements(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int number : input) {
			if (map.containsKey(number))
				map.put(number, map.get(number) + 1);
			else
				map.put(number, 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) == 1)
				System.out.print(key + " ");
		}
		System.out.println();
	}

	void printDuplicateElementsWithFrequenct(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.println(key + ":" + map.get(key));
		}
	}

	void printFrequencyOfEachWord(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}

	void printFrequencyOfEachCharacter(String input) {
		char[] chars = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (Character ch : chars) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}
		for (Character key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}

	void printFrequencyOfEachNumber(int[] input) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int number : input) {
			if (map.containsKey(number))
				map.put(number, map.get(number) + 1);
			else
				map.put(number, 1);
		}
		for (int key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}

	void printSecondHighestFrequencyWord(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String highestFrequencyWord = "", secondFrequencyWord = "";
		int highestFrequency = 0, secondHighestFrequency = 0;
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			int freq = map.get(key);
			if (freq > highestFrequency) {
				secondHighestFrequency = highestFrequency;
				secondFrequencyWord = highestFrequencyWord;
				highestFrequency = freq;
				highestFrequencyWord = key;
			} else if (freq != highestFrequency && freq > secondHighestFrequency) {
				secondHighestFrequency = freq;
				secondFrequencyWord = key;
			}
		}
		System.out.println(secondFrequencyWord + ":" + secondHighestFrequency);
	}

	void printFirstNonRepeatingWord(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println(key);
				break;
			}
		}
	}

	ArrayList<Integer> appenZeroAfter3ConsecutiveNumber(int[] input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		output.add(input[0]);
		output.add(input[1]);
		for (int index = 2; index < input.length; index++) {
			output.add(input[index]);
			if (input[index] - 1 == input[index - 1] && input[index] - 2 == input[index - 2]) {
				output.add(0);
			}
		}
		return output;
	}

	void printDublicateNumber(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int number : input) {
			if (map.containsKey(number))
				map.put(number, map.get(number) + 1);
			else
				map.put(number, 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.println(key + " :" + map.get(key));
		}
	}

	public static void main(String[] args) {
		Assignment48 assignment = new Assignment48();
		System.out.println("******************1********************");
		AadharGenerator aadharCenter1 = new AadharGenerator("FKAPS6730K");
		System.out.println(aadharCenter1.getAadharNumber());
		System.out.println("******************2********************");
		int[] input1 = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		System.out.println(assignment.getNumberOfPairs(input1));
		System.out.println("******************3********************");
		int[] input2 = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		assignment.printUniqueElements(input2);
		System.out.println("******************4********************");
		String input3 = "Hi Hello Hi Techno Credits Credits Hi Credits";
		assignment.printDuplicateElementsWithFrequenct(input3);
		System.out.println("******************5********************");
		String input4 = "technocredits";
		assignment.printFrequencyOfEachCharacter(input4);
		System.out.println("******************6********************");
		String input5 = "Hi Hello Hi Techno Credits Credits Hi Credits";
		assignment.printFrequencyOfEachWord(input5);
		System.out.println("******************7********************");
		assignment.printFrequencyOfEachNumber(input1);
		System.out.println("******************8********************");
		String input6 = "Hi Hello Hi Techno Credits Hi Credits";
		assignment.printSecondHighestFrequencyWord(input6);
		System.out.println("******************9********************");
		String input7 = "Hi Hello Hi Techno Credits Hi Credits";
		assignment.printFirstNonRepeatingWord(input7);
		System.out.println("******************10********************");
		int[] input8 = { 1, 2, 3, 5, 4, 7 };
		System.out.println(assignment.appenZeroAfter3ConsecutiveNumber(input8));
		System.out.println("******************11********************");
		int[] input9 = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		assignment.printDublicateNumber(input9);
	}

}

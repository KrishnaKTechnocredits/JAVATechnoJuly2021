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
package shreya_assignment_47_frequencyofcharacterusing_collection;

import java.util.HashMap;

public class FrequencyOfWord {
	void getFrequency(String input) {
    String[] arr = input.split(" ");
    HashMap<String, Integer> words = new HashMap<>();
    for (String str : arr) {
        if (words.containsKey(str)) {
            words.put(str, 1 + words.get(str));
        } else {
            words.put(str, 1);
        }
    }
	System.out.println("Frequency of each word fro the string : "+input);
    System.out.println(words);
	 }
	public static void main(String[] args) {
		FrequencyOfWord frequencyOfWord= new FrequencyOfWord();
		String str = "hi good morning hello good morning";
		frequencyOfWord.getFrequency(str);

	}

}

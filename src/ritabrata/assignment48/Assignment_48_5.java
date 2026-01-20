/*Assignment - 48 : 9th Oct'2021
Program 5: find the freq of each character in given word.
String input = "technocredits";*/

package ritabrata.assignment48;

import java.util.HashMap;

public class Assignment_48_5 {
	void frequencyOfEachChar(String input) {
		char[] arr1= input.toCharArray();
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		for (char ch: arr1) {
			if (hm.containsKey(ch)) {
				int num= hm.get(ch);
				hm.put(ch, ++num);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println("Frequency of each char: "+hm);
	}
	

	public static void main(String[] args) {
		Assignment_48_5 freqChar= new Assignment_48_5();
		String input= "technocredits";
		freqChar.frequencyOfEachChar(input);
	}

}

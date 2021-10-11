/*program 5: find the freq of each character in given word.
String input = "technocredits";*/
package indu.Assignment_48;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FreqencyOfEachCharInWord_48_5 {

	void frequencyOfEachChar(String word)
	{
		char[] ch = word.toCharArray();
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
		
		for(char c : ch)
		{
			if(hmap.containsKey(c))
			{
				hmap.put(c,hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
		}
		System.out.println("Frequency of each char of word "+word+"is :\n"+hmap);
	}
	
	public static void main(String[] args) {
		FreqencyOfEachCharInWord_48_5 a48_5 = new FreqencyOfEachCharInWord_48_5();
		a48_5.frequencyOfEachChar("technocredits");
	}
}

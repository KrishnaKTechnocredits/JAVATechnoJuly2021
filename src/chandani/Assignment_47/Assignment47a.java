/*Program 1: find frequency of each char from string
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
package chandani.Assignment_47;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Assignment47a {
	
	public static void main(String[] args) {
		
	String inputString = "Varsha";
	HashMap<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();

     char[] strArray = inputString.toCharArray();

    for (char c : strArray) {
        if (charCountMap.containsKey(c)) {

            charCountMap.put(c, charCountMap.get(c) + 1);
        }
        else {

            charCountMap.put(c, 1);
        }
    }

    // Printing the charCountMap
    System.out.println("Frequency of each char from string " + inputString + " is "+ charCountMap);
			
	}

}

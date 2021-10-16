/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
*/
package bhaktik_Assignment_48;

import java.util.HashMap;

public class Assignment_48_6 {
	
	static void findFrequencyOFeachWord(String input) {
		String [] arry = input.split(" ");
		HashMap <String, Integer> words= new HashMap();
		for (String word :arry) {
			if (words.containsKey(word)) {
				int n= words.get(word);
				words.put(word, ++n);
			}else {
				words.put(word, 1);
			}
		}
		System.out.println(words);
	}
	
	
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		findFrequencyOFeachWord(input);
	}

}

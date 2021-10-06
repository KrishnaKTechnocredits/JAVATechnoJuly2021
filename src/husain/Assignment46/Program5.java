/*
 * Example 5 :
Remove the longest string from given Set.
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<String>();
		set.add("techno");
		set.add("credits");
		set.add("selenium");
		set.add("java");
		set.add("automation");
		System.out.println("Input set" + set);
		int maxLength = 0;
		String maxWord = "";
		for (String word : set)
			if (word.length() > maxLength) {
				maxLength = word.length();
				maxWord = word;
			}
		set.remove(maxWord);
		System.out.println("The longest word in the set is " + maxWord);
		System.out.println("Output set after removing the logest word " + set);
	}

}

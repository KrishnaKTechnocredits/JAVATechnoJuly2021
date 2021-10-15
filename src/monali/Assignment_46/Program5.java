package monali.Assignment_46;

import java.util.HashSet;
import java.util.Set;

public class Program5 {
	// Example 5 :Remove the longest string from given Set.
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Testing");
		set.add("Selenium");
		set.add("Traininggg");
		set.add("Practice8");

		System.out.println("Original set values : " + set);
		int maxLength = 0;
		String maxWord = "";
		for (String word : set) {
			if (word.length() > maxLength) {
				maxLength = word.length();
				maxWord = word;
			}

		}
		System.out.println("Max Length word : "+maxWord);
		set.remove(maxWord);
		// System.out.println(set.remove(maxWord));
		System.out.println("After removing max length word : " + set);

	}

}

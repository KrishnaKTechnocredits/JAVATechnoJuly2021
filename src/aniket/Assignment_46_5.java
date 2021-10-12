package aniket;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Example 5 : Remove the longest string from given Set.
public class Assignment_46_5 {

	Set<String> removeLongestString(String[] input) {
		String max = "";
		Set<String> listNames = new HashSet<String>(Arrays.asList(input));
		for (String str : listNames) {
			if (str.length() > max.length()) {
				max = str;
			}

		}

		System.out.println("Longest String is : " + max);
		listNames.remove(max);
		return listNames;

	}

	public static void main(String[] args) {

		String[] input = { "Technocredits", "Aniket", "Maulik", "Krishna" };
		// Assignment_46_5 assignnment_46_5 = new Assignment_46_5();
		// assignnment_46_5.getLongestString(input);
		System.out.println(
				"After removing longest string from a set : " + new Assignment_46_5().removeLongestString(input));
	}
}

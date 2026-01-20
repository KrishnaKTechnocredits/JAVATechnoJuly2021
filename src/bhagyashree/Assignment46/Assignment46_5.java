/*
 * Remove the longest string from given Set
 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment46_5 {

	static void removeLongestString(String[] arr) {
		Set<String> setInput = new LinkedHashSet(Arrays.asList(arr));
		int lengthLongString = 0;
		String longString = null;

		for (String name : setInput) {
			if (name.length() > lengthLongString) {
				lengthLongString = name.length();
				longString = name;
			}
		}
		System.out.println(setInput);
		setInput.remove(longString);
		System.out.println(setInput);
	}

	public static void main(String[] args) {
		String[] str = { "bhagyashree", "techno", "credits", "input123", "jitendra", "bhavesh", "india" };
		removeLongestString(str);
	}
}

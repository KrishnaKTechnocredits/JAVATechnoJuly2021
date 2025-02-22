/*Remove the longest string from given Set.*/
package sayli_Vyavhare.Assignment_46;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program_5 {

	static void removeLongestString(String[] input) {

		Set<String> set = new LinkedHashSet<String>(Arrays.asList(input));
		System.out.println("Input set is:" + set);

		int max = 0;
		String output = "";
		for (String name : set) {
			if (name.length() > max) {
				max = name.length();
				output = name;
			}

		}
		set.remove(output);

		System.out.println("Output after removing longest String from  set.:" + set);
	}

	public static void main(String[] args) {
		String[] input = { "hi", "hello", "assignments", "java" };
		removeLongestString(input);
	}

}

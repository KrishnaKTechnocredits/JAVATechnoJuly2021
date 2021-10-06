package margi.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;

//Remove the longest string from given Set

public class Assignment_46_5 {

	void processSet(String[] str) {
		HashSet<String> set = new HashSet<>(Arrays.asList(str));
		String maxWord = "";
		for (String len : set) {
			if (maxWord.length() < len.length()) {
				maxWord = len;
			}
		}
		System.out.println("Before removing longest string: " + set);
		set.remove(maxWord);
		System.out.println("After removing longest string: " + set);
	}

	public static void main(String[] args) {
		Assignment_46_5 assignment_46_5 = new Assignment_46_5();
		String[] arr = { "credits", "technocredits", "techno", "data", "computer", "info" };
		assignment_46_5.processSet(arr);
	}
}

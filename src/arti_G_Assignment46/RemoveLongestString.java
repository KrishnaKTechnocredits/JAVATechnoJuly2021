package arti_G_Assignment46;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*Example 5 :
Remove the longest string from given Set.*/
public class RemoveLongestString {

	static void removeLongestString(String[] str) {
		Set<String> input = new LinkedHashSet(Arrays.asList(str));
		int longestLength=0;
		String longestString = null;
		for(String name : input) {
			if(name.length()>longestLength) {
				longestLength = name.length();
				longestString = name;
			}
		}
		System.out.println("Input string is : "+input);
		input.remove(longestString);
		System.out.println("After removing longest String : "+input);
	}
	public static void main(String[] args) {
		String[] str = {"Techno", "Credits", "Aman", "Nidhi", "Arti","TechnoCredits"};
		removeLongestString(str);
	}

}

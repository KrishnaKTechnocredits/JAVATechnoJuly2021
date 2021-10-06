package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*Remove the longest string from given Set.*/
public class RemoveLongestStringFromSet {
	ArrayList<String> removeLongestString(LinkedHashSet<String> setOfStrings){
		ArrayList<String> modified = new ArrayList<>(setOfStrings);
		String longest = modified.get(0);
		int maxLength = longest.length();
		for(int index = 0; index < modified.size(); index++) {
			String str = modified.get(index);
			if(str.length() > maxLength ) {
				maxLength = str.length();
				longest = str;
			}
		}
		modified.remove(longest);
		return modified;
	}
	public static void main(String[] args) {
		String[] strings = {"Yardi","Capgemini","Globant","Xoriant","Xento"};
		LinkedHashSet<String> setOfStrings = new LinkedHashSet<>(Arrays.asList(strings));
		RemoveLongestStringFromSet removeLongestStringFromSet = new RemoveLongestStringFromSet();
		System.out.println("Set after removing longest string");
		System.out.println(removeLongestStringFromSet.removeLongestString(setOfStrings));
	}
}

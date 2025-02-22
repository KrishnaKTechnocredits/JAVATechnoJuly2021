package rushikesh.assign46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Example 5 :
//Remove the longest string from given Set.
public class Assign46_5 {
	static void removeHighestLengthElement(String[] str) {
		Set<String> input = new LinkedHashSet<String>(Arrays.asList(str));
		int longestLength = 0;
		String longestString = null;

		for(String name : input) {
			if(name.length()>longestLength) {
				longestLength = name.length(); 
				longestString = name;
			}	
	}
		System.out.println(input);
		input.remove(longestString);
		System.out.println(input);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"indore","credits","techno","country","ram","shyam","srilanka"};
		removeHighestLengthElement(str);
	}
	
}

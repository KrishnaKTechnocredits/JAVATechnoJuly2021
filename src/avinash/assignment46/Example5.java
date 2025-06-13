package avinash.assignment46;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*Remove the longest string from given Set.*/
public class Example5 {
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

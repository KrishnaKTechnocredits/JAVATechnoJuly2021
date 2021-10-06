/*Remove the longest string from given Set.*/

package amol_Vyas.Assignment_46;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program_5 {
	
	static void removeHighestLengthElement(String[] str) {
		Set<String> input= new LinkedHashSet(Arrays.asList(str));
		int longestLength=0;
		String longestString=null;
		for(String name : input) {
			if(name.length()>longestLength) {
				longestLength=name.length();
				longestString=name;
			}
		}
		System.out.println(input);
		input.remove(longestString);
		System.out.println(input);

	}
	
	public static void main(String[] args) {
		String[] str = {"indore","credits","techno","country","ram","shyam","srilanka"};
		removeHighestLengthElement(str);
}
}
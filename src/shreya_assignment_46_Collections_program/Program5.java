/*Example 5 :
Remove the longest string from given Set.*/
package shreya_assignment_46_Collections_program;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program5 {

	public static void main(String[] args) {
		String[] arr = {"Unnati","Kanak","Avantika","Sonu"};
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(arr));
		System.out.println("Input :"+set);
		String maxWord="";
		int wordLength=0;
		for(String word:set) 
			if(word.length()>wordLength) {
				wordLength=word.length();
				maxWord=word;
			}
		set.remove(maxWord);
		
		System.out.println("Longest string from the given set is :"+maxWord);
		System.out.println("After removing longest string from set :"+set);

	}

}

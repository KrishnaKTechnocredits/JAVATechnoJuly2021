/*Programming Questions - Collections : 4th Oct'2021
 Example 5 :
Remove the longest string from given Set.
*/
package shraddha.Assignment46;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveLongestStringFromGivenSet {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("I");
		set.add("am");
		set.add("learning");
		set.add("java");
		set.add("selenium");
		set.add("from");
		set.add("TechnoCredits");
		set.add("team");
		System.out.println("Input set :- " + set);
		int maxLength = 0;
		String maxWord = "";
		for (String word : set)
			if (word.length() > maxLength) {
				maxLength = word.length();
				maxWord = word;
			}
		set.remove(maxWord);
		System.out.println("The longest word in the set is " + maxWord);
		System.out.println("Output set after removing the longest word will be :- " + set);
	}
}

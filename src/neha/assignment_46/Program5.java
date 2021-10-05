package neha.assignment_46;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*Example 5 :
Remove the longest string from given Set.
*/
public class Program5 {

	void removeLongestStringFromSet(Set<String> names) {
		int max = 0;
		String maxWord = " ";
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			int nameLength = name.length();
			if (nameLength > max) {
				maxWord = name;
				max = nameLength;
			}
		}
		names.remove(maxWord);
		System.out.println("Set after removal of longest string: " + names);
	}

	public static void main(String[] args) {
		Program5 program5 = new Program5();
		String[] nameList = { "Parth", "Ashrith", "Aniket", "Tarun", "Ovi" };
		Set<String> setList = new LinkedHashSet<String>(Arrays.asList(nameList));
		program5.removeLongestStringFromSet(setList);

	}
}
